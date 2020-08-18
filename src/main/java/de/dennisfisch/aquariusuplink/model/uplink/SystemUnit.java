package de.dennisfisch.aquariusuplink.model.uplink;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SystemUnit {

  private int systemUnitId;

  private String name;

  private String shortName;

  private String product;

  private String softwareVersion;
/*
{
    "systemUnitId": 1,
    "name": "sample string 2",
    "shortName": "sample string 3",
    "product": "sample string 4",
    "softwareVersion": "sample string 5"
  }
 */
}
