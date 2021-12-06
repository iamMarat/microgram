package edu.marrat.microgram.service;


import edu.marrat.microgram.model.User;
import edu.marrat.microgram.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class UserService {

    private final UserRepository repository;



    public List<User> login(String email, String password) {
        return List.of(new User(email,password));

    }
}
