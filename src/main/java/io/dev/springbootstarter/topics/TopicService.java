package io.dev.springbootstarter.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Boot Starter", "Started Learning"),
            new Topic("Spring", "Spring Boot 1.0", "Started Learning 1.0"),
            new Topic("C++", "New Edition", "Intro to C++")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }



}