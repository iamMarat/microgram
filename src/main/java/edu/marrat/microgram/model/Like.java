package edu.marrat.microgram.model;

import java.time.LocalDate;

public class Like {
        private User whoLiked_id;
        private Publication whatWasLiked_id;
        private LocalDate likedDate;

    public Like(User whoLiked_id, Publication whatWasLiked_id, LocalDate likedDate) {
        this.whoLiked_id = whoLiked_id;
        this.whatWasLiked_id = whatWasLiked_id;
        this.likedDate = likedDate;
    }

    public User getWhoLiked_id() {
        return whoLiked_id;
    }

    public void setWhoLiked_id(User whoLiked_id) {
        this.whoLiked_id = whoLiked_id;
    }

    public Publication getWhatWasLiked_id() {
        return whatWasLiked_id;
    }

    public void setWhatWasLiked_id(Publication whatWasLiked_id) {
        this.whatWasLiked_id = whatWasLiked_id;
    }

    public LocalDate getLikedDate() {
        return likedDate;
    }

    public void setLikedDate(LocalDate likedDate) {
        this.likedDate = likedDate;
    }
}

