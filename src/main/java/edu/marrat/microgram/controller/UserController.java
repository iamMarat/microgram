package edu.marrat.microgram.controller;


import edu.marrat.microgram.model.User;
import edu.marrat.microgram.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
private final UserService service;



    @ResponseBody
    @GetMapping("/userByName/{name}")
    public List<User> getUserByName(@PathVariable String name){
    return service.getByName(name);
    }

    @ResponseBody
    @GetMapping("/userByNick/{nickname}")
    public List<User> getUserByNickName(@PathVariable String nickname){
        return service.getByNickName(nickname);
    }

    @ResponseBody
    @GetMapping("/userByMail/{email}")
    public List<User> getUserByMail(@PathVariable String email){
        return service.getByMail(email);
    }
    @ResponseBody
    @GetMapping("/existByEmail/{email}")
    public int existUserByMail(@PathVariable String email){
        return service.existByEmail(email);
    }


    @GetMapping
    public String loginPage(){
        return "login";
    }
    @PostMapping("/login")
    public String login( @Validated User user){
        if (this.service.isValid(user.getEmail(),user.getPassword())){
            return "profile";
        }
        else { return "error_login";}
    }
    @GetMapping("/signin")
    public String signInPage(){
        return "signin";
    }
    @PostMapping("/signin")
    public String signIn(String email,String nickname,String password){
        if (this.service.isValidForSignIn(email,nickname,password)){
            service.saveUser(email,nickname,password);
            return "login";
        }
        return "signin_error";
    }


    @PostMapping("/logout/{email}")
    public String loginout(@RequestBody String user){
        return "login";
    }

}
