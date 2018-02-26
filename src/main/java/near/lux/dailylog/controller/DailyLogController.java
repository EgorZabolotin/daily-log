package near.lux.dailylog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
public class DailyLogController {

//    public static final Logger LOGGER = LoggerFactory.getLogger(DailyLogController.class);

    @PostMapping("/create")
    public String create(@RequestBody String json) {
        log.debug(json);
        return "OK - crate task";
    }

    @GetMapping("/get-task/{id}")
    public String getTaskByIdAsSubstring(@PathVariable int id) {
        log.debug("Get task {}", id);
        return "OK - get task with id as request substring";
    }

    @GetMapping("/get-task")
    public String getTaskByIdAsParam(@RequestParam("id") int id){
        log.debug("Get task for id {}", id);
        return "OK - get task with id as request parameter";
    }

    @PutMapping("/edit-task")
    public String edit(@RequestBody String json) {
        log.debug("Edit \n {}", json);
        return "OK - edit task";
    }

    @DeleteMapping("/remove-task/{id}")
    public String removeTask(@PathVariable int id) {
        log.debug("from remove-task {}", id);
        return "OK - remove task";
    }

    @GetMapping("/get-subtask/{taskId}/{subtaskId}")
    public String getSubtask(@PathVariable int taskId, @PathVariable int subtaskId) {
        log.debug("Get Subtask {} from Task {}", subtaskId, taskId);
        return "OK - getsubtask";
    }

    @DeleteMapping("/remove-subtask/{taskId}/{subtaskId}")
    public String removeTask(@PathVariable int taskId, @PathVariable int subtaskId) {
        log.debug("from remove-Subtask {} from Task {}", subtaskId, taskId);
        return "OK - remove Subtask";
    }

}
