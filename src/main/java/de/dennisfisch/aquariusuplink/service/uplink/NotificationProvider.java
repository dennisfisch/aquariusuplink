package de.dennisfisch.aquariusuplink.service.uplink;

import de.dennisfisch.aquariusuplink.model.uplink.Notification;
import de.dennisfisch.aquariusuplink.model.uplink.Page;
import de.dennisfisch.aquariusuplink.service.transport.OAuth2WebClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationProvider {

  private static final String URL_SYSTEM_NOTIFICATIONS = "/api/v1/systems/{systemId}/notifications";

  @Value("${aquariusuplink.base-uri}")
  private String baseUri;

  private final OAuth2WebClientService oAuth2WebClientService;

  public Page<Notification> provideNotifications(final int systemId) {
    final String url = baseUri + URL_SYSTEM_NOTIFICATIONS.replace("{systemId}", String.valueOf(systemId));
    return oAuth2WebClientService.getForObject(url, new ParameterizedTypeReference<Page<Notification>>() {});
  }
}