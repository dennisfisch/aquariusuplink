package de.dennisfisch.aquariusuplink.service.uplink;

import de.dennisfisch.aquariusuplink.model.uplink.Page;
import de.dennisfisch.aquariusuplink.model.uplink.System;
import de.dennisfisch.aquariusuplink.service.transport.OAuth2WebClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SystemProvider {

  @Value("${aquariusuplink.base-uri}")
  private String baseUri;

  private final String URL_SOFTWARE = "/api/v1/software";
  private final String URL_SOFTWARE_SYSTEM = "/api/v1/systems/{systemId}/software";

  private static final String URL_SYSTEMS = "/api/v1/systems";
  private static final String URL_SYSTEM = "/api/v1/systems/{systemId}";

  private final OAuth2WebClientService oAuth2WebClientService;

  public Page<System> provideSystems() {
    return oAuth2WebClientService.getForObject(baseUri + URL_SYSTEMS, new ParameterizedTypeReference<Page<System>>() {});
  }

  public System provideSystem(final int systemId) {
    final String url = baseUri + URL_SYSTEM.replace("{systemId}", String.valueOf(systemId));
    return oAuth2WebClientService.getForObject(url, System.class);
  }
}