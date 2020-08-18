package de.dennisfisch.aquariusuplink.service.uplink;

import de.dennisfisch.aquariusuplink.model.uplink.SystemConfig;
import de.dennisfisch.aquariusuplink.service.transport.OAuth2WebClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConfigProvider {

  private static final String URL_SYSTEM_CONFIG = "/api/v1/systems/{systemId}/config";

  @Value("${aquariusuplink.base-uri}")
  private String baseUri;

  private final OAuth2WebClientService oAuth2WebClientService;

  public SystemConfig provideConfig(final int systemId) {
    final String url = baseUri + URL_SYSTEM_CONFIG.replace("{systemId}", String.valueOf(systemId));
    return oAuth2WebClientService.getForObject(url, SystemConfig.class);
  }
}