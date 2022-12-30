package com.educandoweb.projetospring.config;

import com.educandoweb.projetospring.entities.Order;
import com.educandoweb.projetospring.entities.User;
import com.educandoweb.projetospring.repositories.OrderRepository;
import com.educandoweb.projetospring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2022-07-23T14:52:09Z"), u1);
        Order o2 = new Order(null, Instant.parse("2022-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2022-07-20T01:30:26Z"), u1);
        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
