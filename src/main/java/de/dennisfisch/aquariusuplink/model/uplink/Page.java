package de.dennisfisch.aquariusuplink.model.uplink;

import java.util.List;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Page<T> {

  private int page;

  private int itemsPerPage;

  private int numItems;

  private List<T> objects;

  /*
 "page": 1,
  "itemsPerPage": 2,
  "numItems": 3,
  "objects"
   */
}