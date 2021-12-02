package edu.marrat.microgram.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document(collection = "likes")
@Data
public class Like {
        private User whoLiked;
        private Publication whatWasLiked;
        private LocalDate likedDate;

    public Like(User whoLiked, Publication whatWasLiked_id, LocalDate likedDate) {
        this.whoLiked = whoLiked;
        this.whatWasLiked = whatWasLiked_id;
        this.likedDate = likedDate;
    }

    public User getWhoLiked() {
        return whoLiked;
    }

    public void setWhoLiked(User whoLiked) {
        this.whoLiked = whoLiked;
    }

    public Publication getWhatWasLiked() {
        return whatWasLiked;
    }

    public void setWhatWasLiked(Publication whatWasLiked) {
        this.whatWasLiked = whatWasLiked;
    }

    public LocalDate getLikedDate() {
        return likedDate;
    }

    public void setLikedDate(LocalDate likedDate) {
        this.likedDate = likedDate;
    }
}

