package de.dennisfisch.aquariusuplink.config;

import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "aquariusuplink.parameters")
public class ParameterConfig {

  private Map<Integer, String> friendlyNameByIds;

  private List<Integer> divideBy10Ids;

  private List<Integer> divideBy100Ids;

  private List<Integer> additionalParameters;

}