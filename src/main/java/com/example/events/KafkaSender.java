package com.example.events;

import com.example.events.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, UserDTO> kafkaTemplate;

    public void send(String topic, UserDTO payload) {
        kafkaTemplate.send(topic, payload);
        System.out.println("Message: "+payload+" sent to topic: "+topic);
    }


}