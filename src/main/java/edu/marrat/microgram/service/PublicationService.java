package edu.marrat.microgram.service;


import edu.marrat.microgram.model.Publication;
import edu.marrat.microgram.repository.PublicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationService {

    private final PublicationRepository repository;

    public PublicationService(PublicationRepository repository) {
        this.repository = repository;
    }

    public List<Publication> getPublicationById(Publication id){
        return repository.getPublicationById(id);
    }
}
