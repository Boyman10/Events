package com.example.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EventsApplication.class, args);
    }

    @Autowired
    private KafkaSender sender;

    @Override
    public void run(String... strings) throws Exception {
        sender.send("topic1","Spring Kafka Producer and Consumer Example");
    }
}
