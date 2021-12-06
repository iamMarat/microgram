package edu.marrat.microgram.service;


import edu.marrat.microgram.model.Publication;
import edu.marrat.microgram.repository.PublicationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class PublicationService {

    private final PublicationRepository repository;

}
