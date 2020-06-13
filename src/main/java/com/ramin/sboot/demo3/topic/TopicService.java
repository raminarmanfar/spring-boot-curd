package com.ramin.sboot.demo3.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<Topic>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopicById(String id) {
        return topicRepository.findById(id).get();
    }

	public void addTopic(Topic topic) {
        topicRepository.save(topic);
	}

	public void updateTopicById(String id, Topic updatedTopic) {
        topicRepository.save(updatedTopic);
	}

	public void deleteTopicById(String id) {
        topicRepository.deleteById(id);
	}
}