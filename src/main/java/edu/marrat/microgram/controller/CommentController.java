package edu.marrat.microgram.controller;

import edu.marrat.microgram.model.Comment;
import edu.marrat.microgram.model.Publication;
import edu.marrat.microgram.model.User;
import edu.marrat.microgram.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users/user")
public class CommentController {
    private final CommentService service;
    @PostMapping
    public Comment create(@RequestParam Comment comment, Authorization authorization){
        return service.addComment(comment.getComment(),comment.getPublication_Id());
    }

    @DeleteMapping
    public void delete(@RequestParam Comment comment){
        service.delete(comment.getId());
    }
}
