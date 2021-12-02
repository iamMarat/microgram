package edu.marrat.microgram.repository;

import edu.marrat.microgram.model.Like;
import edu.marrat.microgram.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface LikeRepository extends CrudRepository<Like, User> {
    List<Like> getLikeByLikedDate(LocalDate date);
    List<Like> getLikeByWhoLiked_id(User id);
}
