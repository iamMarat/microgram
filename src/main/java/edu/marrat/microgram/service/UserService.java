package edu.marrat.microgram.service;


import edu.marrat.microgram.model.User;
import edu.marrat.microgram.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }


    public List<User> getByName(String name){
        return repository.getByName(name);
    }
    public List<User> getByNickName(String nick){
        return repository.getByNickName(nick);
    }
    public List<User> getByMail(String mail){
        return repository.getByMail(mail);
    }
    public int existByEmail(String email){
        return repository.countByEmail(email);
    }

    public boolean isValid(String email,String password) {
        if (repository.existsByEmailAndPassword(email, password)) {
            return true;
        }
        else {return false;}
    }



    public boolean isValidForSignIn(String email, String nickname,String password) {
        if (repository.existsByEmailAndNickname(email,nickname)){
            return false;
        }

        else {return true;}
    }

    public User saveUser(String email, String nickname,String password){
        return  repository.save(new User(email,nickname,password));
    }
}
