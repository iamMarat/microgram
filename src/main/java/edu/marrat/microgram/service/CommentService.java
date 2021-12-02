package edu.marrat.microgram.service;

import edu.marrat.microgram.model.Comment;
import edu.marrat.microgram.model.User;
import edu.marrat.microgram.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private  final CommentRepository repository;

    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public List<Comment> getCommentByUser(User id){
        return repository.getCommentByPathWhoComment(id);
    }
}
