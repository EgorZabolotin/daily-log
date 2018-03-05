package near.lux.dailylog.dto;

import lombok.Value;

@Value
public class PersonDTO {
        int id;
        String firstName;
        String lastName;
        String middleName;
        String login;
}
