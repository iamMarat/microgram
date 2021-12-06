package edu.marrat.microgram.service;


import edu.marrat.microgram.model.Like;
import edu.marrat.microgram.repository.LikeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class LikeService {
    private final LikeRepository repository;



}
