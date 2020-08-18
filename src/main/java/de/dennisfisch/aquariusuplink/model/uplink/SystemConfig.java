package de.dennisfisch.aquariusuplink.model.uplink;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class SystemConfig {

  private boolean hasCooling;

  private boolean hasHeating;

  private boolean hasHotWater;

  private boolean hasVentilation;

  /*
{
  "hasCooling": true,
  "hasHeating": true,
  "hasHotWater": true,
  "hasVentilation": true
}
   */
}