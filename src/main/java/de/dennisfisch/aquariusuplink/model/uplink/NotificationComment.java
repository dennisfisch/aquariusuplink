package de.dennisfisch.aquariusuplink.model.uplink;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotificationComment {

  private String authorName;

  private Date creationDate;

  private String text;


  /*
{
          "authorName": "sample string 1",,
          "creationDate": "2020-08-05T18:24:08Z",
          "text": "sample string 3"
        }
   */
}