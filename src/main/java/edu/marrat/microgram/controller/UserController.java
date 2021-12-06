package edu.marrat.microgram.controller;


import edu.marrat.microgram.model.User;
import edu.marrat.microgram.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class UserController {
private final UserService service;

@GetMapping("/userByName/{name}")
public List<User> getUserByName(String name){
    return service.getByName(name);
}
    @GetMapping("/userByNick/{nickname}")
    public List<User> getUserByNickName(String nick){
        return service.getByNickName(nick);
    }
    @GetMapping("/userByMail/{email}")
    public List<User> getUserByMail(String m){
        return service.getByMail(m);
    }

    @GetMapping("/existByMail/{email}")
    public List<User> existUserByMail(String m){
        return service.existByEmail(m);
    }

}
