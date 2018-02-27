package near.lux.dailylog.model;

import lombok.Value;

@Value
public class SubTask {
    private final int id;
    private final String name;
    private final String description;
    private final boolean isClosed;

}
