package edu.marrat.microgram.repository;

import edu.marrat.microgram.model.Publication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PublicationRepository extends CrudRepository<Publication,Long> {
    List<Publication> getPublicationById(Publication id);
    List<Publication> getPublicationByDescription(Publication des);
}
