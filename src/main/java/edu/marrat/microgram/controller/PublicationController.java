package edu.marrat.microgram.controller;


import edu.marrat.microgram.model.Publication;
import edu.marrat.microgram.model.User;
import edu.marrat.microgram.service.PublicationService;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class PublicationController {
    private final PublicationService service;

    @GetMapping("/{userName}/get")
    public List<Publication> getPubByUser(@RequestParam User user){
        return service.getPublicationByUser(user.getUsername());
    }

    @PostMapping("/user/{photo}/{description}/add")
    public Publication addPublication(Authentication authentication, @PathVariable String photo, @PathVariable String descriprion){
        return service.addPublication(photo,descriprion);
    }

    @DeleteMapping("/user/{publicationId}/delete")
    public void delete(@RequestParam String id){
        service.delete(id);
    }


}
