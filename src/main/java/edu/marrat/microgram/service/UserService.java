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





    public List<User> getByName(String name){
        return repository.getByName(name);
    }
    public List<User> getByNickName(String nick){
        return repository.getByNickName(nick);
    }
    public List<User> getByMail(String mail){
        return repository.getByMail(mail);
    }
    public List<User> existByEmail(String mail){
        return repository.existsByEmail(mail);
    }

}
