package edu.marrat.microgram.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document(collection = "likes")
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
public class Like {
    @Builder.Default
    private String id;
        private User whoLiked;
        private Publication whatWasLiked;
        private LocalDate likedDate;


}

