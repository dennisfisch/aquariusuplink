package de.dennisfisch.aquariusuplink.service.uplink;

import de.dennisfisch.aquariusuplink.model.uplink.Parameter;
import de.dennisfisch.aquariusuplink.service.transport.OAuth2WebClientService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ParameterService {

  private static final String URL_SYSTEM_PARAMETERS = "/api/v1/systems/{systemId}/parameters";

  @Value("${aquariusuplink.base-uri}")
  private String baseUri;

  private final OAuth2WebClientService oAuth2WebClientService;

  public List<Parameter> provideParameters(final int systemId) {
    final String url = baseUri + URL_SYSTEM_PARAMETERS.replace("{systemId}", String.valueOf(systemId));
    return oAuth2WebClientService.getForObject(url, new ParameterizedTypeReference<List<Parameter>>() {});
  }
}