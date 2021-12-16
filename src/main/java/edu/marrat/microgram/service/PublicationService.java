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


    public List<Publication> getPublicationByUser(String username) {
        return repository.getByUserName(username);
    }

    public Publication addPublication(String photo, String descriprion) {
        Publication publication =new Publication(photo, descriprion);
        return repository.save(publication);
    }

    public void delete(String id){
        var byId = repository.findById(id);
        byId.ifPresent(repository::delete);
    }
}
