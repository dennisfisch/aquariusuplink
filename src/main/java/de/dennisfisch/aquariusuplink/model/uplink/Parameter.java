package de.dennisfisch.aquariusuplink.model.uplink;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Parameter {

  private int parameterId;

  private String name;

  private String title;

  private String designation;

  private String unit;

  private String displayValue;

  private int rawValue;

  /*
ParameterId
Parameter id.

integer
Name
Name used for parameter in the request

string
Title
Parameter title

string
Designation
Parameter designation

string
Unit
Unit

string
DisplayValue
Human readable representation of the raw value

string
RawValue
Raw value, as handled by the system itself

integer
   */
}