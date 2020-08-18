package de.dennisfisch.aquariusuplink.service.uplink;

import de.dennisfisch.aquariusuplink.model.uplink.Category;
import de.dennisfisch.aquariusuplink.service.transport.OAuth2WebClientService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryProvider {

  private static final String URL_SYSTEM_CATEGORIES = "/api/v1/systems/{systemId}/serviceinfo/categories?systemUnitId={systemUnitId}&parameters=true";
  private static final String URL_SYSTEM_CATEGORY = "/api/v1/systems/{systemId}/serviceinfo/categories/{categoryId}";

  @Value("${aquariusuplink.base-uri}")
  private String baseUri;

  private final OAuth2WebClientService oAuth2WebClientService;

  public List<Category> provideCategories(final int systemId, final int systemUnitId) {
    final String url = baseUri + URL_SYSTEM_CATEGORIES
        .replace("{systemId}", String.valueOf(systemId))
        .replace("{systemUnitId}", String.valueOf(systemUnitId));
    return oAuth2WebClientService.getForObject(url, new ParameterizedTypeReference<List<Category>>() {});
  }
}