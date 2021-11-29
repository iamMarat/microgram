package edu.marrat.microgram.repository;


import edu.marrat.microgram.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    List<User> getUserByEmail();
    List<User> getUserByUserName();

}
