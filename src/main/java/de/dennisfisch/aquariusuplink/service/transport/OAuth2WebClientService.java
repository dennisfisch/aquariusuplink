package de.dennisfisch.aquariusuplink.service.transport;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction.clientRegistrationId;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@RequiredArgsConstructor
@Component
public class OAuth2WebClientService {

  private final WebClient webClient;

  public <T> T getForObject(final String url, final Class<T> responseType) {
    return this.webClient
        .get()
        .uri(url)
        .attributes(clientRegistrationId("nibe"))
        .retrieve()
        .bodyToMono(responseType)
        .block();
  }

  public <T> T getForObject(final String url, final ParameterizedTypeReference<T> responseType) {
    return this.webClient
        .get()
        .uri( url)
        .attributes(clientRegistrationId("nibe"))
        .retrieve()
        .bodyToMono(responseType)
        .block();
  }
}