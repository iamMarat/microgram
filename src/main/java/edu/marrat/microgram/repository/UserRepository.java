package edu.marrat.microgram.repository;


import edu.marrat.microgram.model.User;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.ExistsQuery;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Primary
@Repository
public interface UserRepository extends CrudRepository<User,String> {

    @Query("{'name': ?0}")
    List<User> getByName(String name);

    @Query("{'nickname': ?0}")
    List<User> getByNickName(String nickname);

    @Query("{'mail': ?0}")
    List<User> getByMail(String mail);


//    • Проверка на наличие пользователя в системе. Пользователи уникально идентифицируются
//    по email.

    List<User> existsByEmail(String email);
}
