package edu.marrat.microgram.model;

import java.time.LocalDate;

public class Publication {

    private String photo;
    private String description;
    private LocalDate publicDate;

    public Publication(String photo, String description, LocalDate publicDate) {
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
}
