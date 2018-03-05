package near.lux.dailylog.model;

import lombok.Value;

import java.util.List;

@Value
public class Person {
    int id;
    String firstName;
    String lastName;
    String middleName;
    String login;
    List<Task> tasks;
}
