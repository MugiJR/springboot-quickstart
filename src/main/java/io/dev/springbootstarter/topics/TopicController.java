package io.dev.springbootstarter.topics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("Spring", "Spring Boot Starter", "Started Learning"),
                new Topic("Spring", "Spring Boot 1.0", "Started Learning 1.0")
        );
    }
}
