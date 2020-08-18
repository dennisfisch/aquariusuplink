package de.dennisfisch.aquariusuplink.model.uplink;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class System {

  private int systemId;

  private String name;

  private String productName;

  private String serialNumber;

  private Date lastActivityDate;

  private String connectionStatus;

  private boolean hasAlarmed;
}
