package edu.marrat.microgram.repository;


import edu.marrat.microgram.model.Publication;
import edu.marrat.microgram.model.User;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.CountQuery;
import org.springframework.data.mongodb.repository.ExistsQuery;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Primary
@Repository
public interface UserRepository extends CrudRepository<User,String> {

    @Query("{ 'name' : { $regex : '?0', $options : 'i' } } ")
    List<User> getByName(String name);

    @Query("{'nickname': ?0}")
    List<User> getByNickName(String nickname);

    @Query("{'email': ?0}")
    List<User> getByMail(String mail);







    @CountQuery("{ email: { $count: 0 } }")
    int countByEmail(String email);

    Boolean existsByEmailAndPassword(String email,String password);
    Boolean existsByEmailAndNickname(String email,String nickname);


}
