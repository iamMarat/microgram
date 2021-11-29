package edu.marrat.microgram;


import edu.marrat.microgram.model.User;
import edu.marrat.microgram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Configuration
public class PreloadDatabaseWithData {

    @Bean

    CommandLineRunner initDatabase(UserRepository repository) {

        repository.deleteAll();

        return (args) -> Stream.of(artists())
                .peek(System.out::println)
                .forEach(repository::save);
    }

    private User[] artists() {
        return new User[]{
                new User("Markus Sillman", "mark007@asd.com","mar123"),
                new User("Kusman MaSill", "kusman@masd.kz","asda311")


        };
}}
