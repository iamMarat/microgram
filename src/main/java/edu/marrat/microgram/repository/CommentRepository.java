package edu.marrat.microgram.repository;

import edu.marrat.microgram.model.Comment;
import edu.marrat.microgram.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CommentRepository extends CrudRepository<Comment, User> {

     Comment getById(String id);

}
