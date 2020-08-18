package de.dennisfisch.aquariusuplink.model.uplink;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Notification {

  private int notificationId;

  private String systemUnitId;

  private String moduleName;

  private Date occuredAt;

  private Date stoppedAt;

  private boolean wasReset;

  private boolean resetPossible;

  private boolean aidmodePossible;

  private NotificationInfo info;

  private List<NotificationComment> comments;


/*
    {
      "notificationId": 1,
      "systemUnitId": 3,
      "moduleName": "sample string 4",
      "occuredAt": "2020-08-05T18:24:08Z",
      "stoppedAt": "2020-08-05T18:24:08Z",
      "wasReset": true,
      "resetPossible": true,
      "aidmodePossible": true,
      "info": {
        "alarmNumber": 1,
        "type": "ALARM",
        "title": "sample string 2",
        "description": "sample string 3"
      },
      "comments": [
        {
          "authorName": "sample string 1",
          "authorAvatar": {
            "name": null,
            "sizes": [
              {
                "width": 35,
                "height": 35,
                "url": "https://secure.gravatar.com/avatar/8f1b5a0edd19674db68799f1e7aed3e4?s=35&d=mm"
              },
              {
                "width": 50,
                "height": 50,
                "url": "https://secure.gravatar.com/avatar/8f1b5a0edd19674db68799f1e7aed3e4?s=50&d=mm"
              }
            ]
          },
          "creationDate": "2020-08-05T18:24:08Z",
          "text": "sample string 3"
        },
        {
          "authorName": "sample string 1",
          "authorAvatar": {
            "name": null,
            "sizes": [
              {
                "width": 35,
                "height": 35,
                "url": "https://secure.gravatar.com/avatar/8f1b5a0edd19674db68799f1e7aed3e4?s=35&d=mm"
              },
              {
                "width": 50,
                "height": 50,
                "url": "https://secure.gravatar.com/avatar/8f1b5a0edd19674db68799f1e7aed3e4?s=50&d=mm"
              }
            ]
          },
          "creationDate": "2020-08-05T18:24:08Z",
          "text": "sample string 3"
        }
      ]
    }
 */
}