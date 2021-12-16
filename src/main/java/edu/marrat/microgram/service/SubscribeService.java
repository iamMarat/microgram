package edu.marrat.microgram.service;


import edu.marrat.microgram.model.Comment;
import edu.marrat.microgram.model.Subscribe;
import edu.marrat.microgram.model.User;
import edu.marrat.microgram.repository.SubscribeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor

public class SubscribeService {
    private final SubscribeRepository repository;



    public Subscribe subscribe(User who, User onWho) {
        Subscribe subscribe = new Subscribe(who,onWho,LocalDate.now());
        return repository.save(subscribe);
    }
}
