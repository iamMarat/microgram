package edu.marrat.microgram.repository;

import edu.marrat.microgram.model.Publication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface PublicationRepository extends CrudRepository<Publication,Long> {
    List<Publication> getPublicationByDescription(Publication des);
    List<Publication> getByUserName(String username);

    Optional<Publication> findById(String id);


}
