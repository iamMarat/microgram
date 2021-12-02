package edu.marrat.microgram.repository;


import edu.marrat.microgram.model.User;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Primary
@Repository
public interface UserRepository extends CrudRepository<User,String> {
    List<User> getUserByEmail(User email);
    List<User> getUserByUserName(User name);
    List<User> getUserById(User id);

}
