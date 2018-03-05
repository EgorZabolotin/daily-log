package near.lux.dailylog.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import near.lux.dailylog.dao.mapper.PersonMapper;
import near.lux.dailylog.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class DailyLogController {

//    public static final Logger LOGGER = LoggerFactory.getLogger(DailyLogController.class);

    private final PersonMapper personMapper;


    @PostMapping("/create")
    public String create(@RequestBody final String json, @RequestHeader("User-Login") final String login) {
        log.debug(json);
        return "OK - crate task";
    }

    @GetMapping("/get-task/{id}")
    public String getTaskByIdAsSubstring(@PathVariable("id") final int id) {
        log.debug("Get task {}", id);
        return "OK - get task with id as request substring";
    }

    @GetMapping("/get-task")
    public String getTaskByIdAsParam(@RequestParam("id") final int id){
        log.debug("Get task for id {}", id);
        return "OK - get task with id as request parameter";
    }

    @PutMapping("/edit-task")
    public String edit(@RequestBody final String json) {
        log.debug("Edit \n {}", json);
        return "OK - edit task";
    }

    @DeleteMapping("/remove-task/{id}")
    public String removeTask(@PathVariable("id") final int id) {
        log.debug("from remove-task {}", id);
        return "OK - remove task";
    }

    @GetMapping("/get-subtask/{taskId}/{subtaskId}")
    public String getSubtask(@PathVariable("taskId") final  int taskId, @PathVariable("subtaskId") final int subtaskId) {
        log.debug("Get Subtask {} from Task {}", subtaskId, taskId);
        return "OK - getsubtask";
    }

    @DeleteMapping("/remove-subtask/{taskId}/{subtaskId}")
    public String removeTask(@PathVariable("taskId") final int taskId, @PathVariable("subtaskId") final int subtaskId) {
        log.debug("from remove-Subtask {} from Task {}", subtaskId, taskId);
        return "OK - remove Subtask";
    }

    @GetMapping("/get-user/{id}")
    public PersonDTO getUserById(@PathVariable("id") final int id) {
        log.debug("from get-user {}", id);
        return personMapper.getPersonById(id);
    }

}
