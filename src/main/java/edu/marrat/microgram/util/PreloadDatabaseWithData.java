package edu.marrat.microgram.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.marrat.microgram.model.Publication;
import edu.marrat.microgram.model.User;
import edu.marrat.microgram.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

@Configuration
public class PreloadDatabaseWithData {

    private static final Random r = new Random();

    @Bean
    CommandLineRunner init(UserRepository userRepo, PublicationRepository pubRepo, SubscribeRepository subRepo, LikeRepository likeRepo, CommentRepository commentRepo) {
        return (args) -> {
            pubRepo.deleteAll();
            userRepo.deleteAll();
            subRepo.deleteAll();
            likeRepo.deleteAll();
            commentRepo.deleteAll();

//            List<User>  = readUsers("users.json");

            List<User> users = Stream.generate(User::random)
                    .limit(10)
                    .collect(toList());
            userRepo.saveAll(users);

        };
    }


    private static List<User> readUsers(String fileName) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            var data = Files.readString(Paths.get(fileName));
            var listType = new TypeReference<List<User>>(){};
            return mapper.readValue(data, listType);
        } catch (IOException e) {

            e.printStackTrace();
        }
        return List.of();
    }
}
