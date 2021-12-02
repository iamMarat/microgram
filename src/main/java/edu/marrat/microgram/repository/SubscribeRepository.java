package edu.marrat.microgram.repository;


import edu.marrat.microgram.model.Subscribe;
import edu.marrat.microgram.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SubscribeRepository extends CrudRepository<Subscribe, User> {
    List<Subscribe> getSubscribeByDateSub(LocalDate date);
    List<Subscribe> getSubscribeByWhoSub(User id);
}
