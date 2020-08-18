package de.dennisfisch.aquariusuplink.model.rest;

import de.dennisfisch.aquariusuplink.model.uplink.Parameter;
import lombok.Getter;

@Getter
public class DecodedParameter {

  private String id;

  private String name;

  private String friendlyName;

  private double value;

  public static DecodedParameter fromParameter(final Parameter parameter) {
    return null;
  }
}