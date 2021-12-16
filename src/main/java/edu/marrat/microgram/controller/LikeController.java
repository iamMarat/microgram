package edu.marrat.microgram.controller;

import edu.marrat.microgram.model.Like;
import edu.marrat.microgram.model.Publication;
import edu.marrat.microgram.model.User;
import edu.marrat.microgram.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users/user")
public class LikeController {

    private final LikeService service;

    @PostMapping("/{whatWasLiked}/{whoLiked}/like")
    public Like like(@PathVariable Publication whatWasLiked,@PathVariable User whoLiked){
     return service.likePub(whatWasLiked,whoLiked);
    }
}
