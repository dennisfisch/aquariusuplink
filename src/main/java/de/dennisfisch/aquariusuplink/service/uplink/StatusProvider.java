package de.dennisfisch.aquariusuplink.service.uplink;

import de.dennisfisch.aquariusuplink.service.transport.OAuth2WebClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StatusProvider {

  private static final String URL_STATUS_SYSTEM = "/api/v1/systems/{systemId}/status/system";
  private static final String URL_STATUS_UNIT = "/api/v1/systems/{systemId}/status/systemUnit/{systemUnitId}";

  private final OAuth2WebClientService oAuth2WebClientService;


}