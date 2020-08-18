package de.dennisfisch.aquariusuplink.service.uplink;

import de.dennisfisch.aquariusuplink.model.uplink.SystemUnit;
import de.dennisfisch.aquariusuplink.service.transport.OAuth2WebClientService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UnitProvider {

  private static final String URL_SYSTEM_UNITS = "/api/v1/systems/{systemId}/units";

  @Value("${aquariusuplink.base-uri}")
  private String baseUri;

  private final OAuth2WebClientService oAuth2WebClientService;

  public List<SystemUnit> provideUnits(final int systemId) {
    final String url = baseUri + URL_SYSTEM_UNITS.replace("{systemId}", String.valueOf(systemId));
    return oAuth2WebClientService.getForObject(url, new ParameterizedTypeReference<List<SystemUnit>>() {});
  }
}