package edu.marrat.microgram.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document(collection = "likes")
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
public class Like {
    @Id
    private String id;
        private User whoLiked;
        private Publication whatWasLiked;
        private LocalDate likedDate;


    public Like(User whoLiked, Publication whatWasLiked, LocalDate likedDate) {
        this.whoLiked = whoLiked;
        this.whatWasLiked = whatWasLiked;
        this.likedDate = likedDate;
    }
}

