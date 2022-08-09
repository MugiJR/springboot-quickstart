package io.dev.springbootstarter.repository;

import io.dev.springbootstarter.topics.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
    
}
