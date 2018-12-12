package com.example.events;

import com.example.events.model.UserDTO;
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

        UserDTO user = new UserDTO();

        user.setName("Bill");
        user.setEmail("bill@gmail.com");
        user.setId("1");



        sender.send("topic1",user);
    }
}
