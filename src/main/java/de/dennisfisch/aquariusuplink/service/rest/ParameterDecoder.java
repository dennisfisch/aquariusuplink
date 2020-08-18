package de.dennisfisch.aquariusuplink.service.rest;

import de.dennisfisch.aquariusuplink.config.ParameterConfig;
import de.dennisfisch.aquariusuplink.model.rest.DecodedParameter;
import de.dennisfisch.aquariusuplink.model.uplink.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParameterDecoder {

  private final ParameterConfig parameterConfig;

  public DecodedParameter decodeParameter(final Parameter parameter) {

    return null;
  }
}