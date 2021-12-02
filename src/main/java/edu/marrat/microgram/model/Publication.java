package edu.marrat.microgram.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "publications")
@Data
public class Publication {
    private String id;
    private String photo;
    private String description;
    private LocalDate publicDate;
    @Indexed(direction = IndexDirection.DESCENDING)
    private List<Like> likes = new ArrayList<>();
    @Indexed(direction = IndexDirection.DESCENDING)
    private List<Comment> comments = new ArrayList<>();

    public Publication(String photo, String description, LocalDate publicDate) {
        this.photo = photo;
        this.description = description;
        this.publicDate = publicDate;
    }

    public Publication(String id, String photo, String description, LocalDate publicDate) {
        this.id = id;
        this.photo = photo;
        this.description = description;
        this.publicDate = publicDate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(LocalDate publicDate) {
        this.publicDate = publicDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
