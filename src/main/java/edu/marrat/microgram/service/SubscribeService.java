package edu.marrat.microgram.service;


import edu.marrat.microgram.model.Subscribe;
import edu.marrat.microgram.model.User;
import edu.marrat.microgram.repository.SubscribeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscribeService {
    private final SubscribeRepository repository;

    public SubscribeService(SubscribeRepository repository) {
        this.repository = repository;
    }

    public List<Subscribe> getSubById(User id){
        return repository.getSubscribeByWhoSub(id);
    }
}
