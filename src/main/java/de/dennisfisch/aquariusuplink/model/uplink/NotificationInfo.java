package de.dennisfisch.aquariusuplink.model.uplink;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class NotificationInfo {

  private int alarmNumber;

  private String type;

  private String title;

  private String description;
/*
{
        "alarmNumber": 1,
        "type": "ALARM",
        "title": "sample string 2",
        "description": "sample string 3"
      }
 */
}