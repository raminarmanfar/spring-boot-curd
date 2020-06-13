package com.ramin.sboot.demo3.topic;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;
    
    @RequestMapping(value="/topics", method=RequestMethod.GET)
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping(value="/topics/{id}", method=RequestMethod.GET)
    public Topic getTopicById(@PathVariable String id) {
        return topicService.getTopicById(id);
    }
    
    @RequestMapping(value="/topics", method=RequestMethod.POST)
    public boolean addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
        return true;
    }

    @RequestMapping(value="/topics/{id}", method=RequestMethod.PUT)
    public boolean updateTopicById(@PathVariable String id, @RequestBody Topic updatedTopic) {
        topicService.updateTopicById(id, updatedTopic);
        return true;
    }
    

    @RequestMapping(value="/topics/{id}", method=RequestMethod.DELETE)
    public boolean deleteTopicById(@PathVariable String id) {
        return topicService.deleteTopicById(id);
    }    
}