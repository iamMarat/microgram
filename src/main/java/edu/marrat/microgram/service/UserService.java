package edu.marrat.microgram.service;


import edu.marrat.microgram.model.User;
import edu.marrat.microgram.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getUserById(User user_id){
        return repository.getUserById(user_id);
    }


    public List<User> login(String email, String password) {
        return List.of(new User(email,password));

    }
}
