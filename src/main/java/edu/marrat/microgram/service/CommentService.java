package edu.marrat.microgram.service;

import edu.marrat.microgram.model.Comment;
import edu.marrat.microgram.model.User;
import edu.marrat.microgram.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class CommentService {

    private  final CommentRepository repository;

}
