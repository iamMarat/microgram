package edu.marrat.microgram.service;


import edu.marrat.microgram.model.Like;
import edu.marrat.microgram.repository.LikeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LikeService {
    private final LikeRepository repository;

    public LikeService(LikeRepository repository) {
        this.repository = repository;
    }

    public List<Like> getAllLikeById(LocalDate id){
        return repository.getLikeByLikedDate(id);
    }

}
