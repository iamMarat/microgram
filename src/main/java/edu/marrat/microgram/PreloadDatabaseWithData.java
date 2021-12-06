package edu.marrat.microgram;


import edu.marrat.microgram.model.Subscribe;
import edu.marrat.microgram.model.User;
import edu.marrat.microgram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@Configuration
public class PreloadDatabaseWithData {

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepo) {
        return (args) -> {
        userRepo.deleteAll();

         List<User> users = Stream.generate(User::random)
                .limit(10)
                .collect(toList());
        userRepo.saveAll(users);
    };




}}
