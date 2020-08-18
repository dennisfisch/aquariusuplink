package de.dennisfisch.aquariusuplink.model.uplink;

import java.util.List;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Category {

  private String categoryId;

  private String name;

  private List<Parameter> parameters;

  /*
{
    "categoryId": "STATUS",
    "name": "sample string 1",
    "parameters": null
  }
   */
}
