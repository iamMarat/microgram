package edu.marrat.microgram.controller;


import edu.marrat.microgram.model.Subscribe;
import edu.marrat.microgram.model.User;
import edu.marrat.microgram.service.SubscribeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/users/user")
public class SubscribeController {
    private final SubscribeService service;

    @PostMapping(value = "/{userId}/subscribe")
    public Subscribe subscribe(User who, User onWho) {
        return service.subscribe(who,onWho);
    }
}
