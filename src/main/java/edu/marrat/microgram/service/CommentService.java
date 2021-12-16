package edu.marrat.microgram.service;

import edu.marrat.microgram.model.Comment;
import edu.marrat.microgram.model.Publication;
import edu.marrat.microgram.model.User;
import edu.marrat.microgram.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class CommentService {

    private final CommentRepository repository;

    public Comment addComment(String comment, Publication publication) {
        Comment comment1 = new Comment(comment, publication);
        return repository.save(comment1);
    }

    public void delete(String id) {
        Comment byId = repository.getById(id);
        repository.delete(byId);
    }

}
