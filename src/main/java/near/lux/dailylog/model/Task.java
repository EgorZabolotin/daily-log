package near.lux.dailylog.model;

import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;

@Value
public class Task {
    int id;
    String name;
    String description;
    List<Task> subTasks;
    boolean isClosed;
    LocalDateTime creationTmstp;
    LocalDateTime modificationTmstp;
}
