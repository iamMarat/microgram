package edu.marrat.microgram.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "publications")
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
public class Publication {
    @Id
    private String id;
    private String photo;
    private User user;
    private String description;
    private LocalDate publicDate;
    @Indexed(direction = IndexDirection.DESCENDING)
    private List<Like> likes = new ArrayList<>();
    @Indexed(direction = IndexDirection.DESCENDING)
    private List<Comment> comments = new ArrayList<>();


    public Publication(String photo, String descriprion) {
        this.photo = photo;
        this.description = descriprion;
    }
}
