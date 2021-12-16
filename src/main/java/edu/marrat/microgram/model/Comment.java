package edu.marrat.microgram.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document(collection = "comments")
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
public class Comment {
    @Id
    private String id;
    private User user_Id;
    private Publication publication_Id;
    private String comment;
    private LocalDate textDate;


    public Comment(String comment, Publication Publication_Id) {
        this.comment = comment;
        this.user_Id = user_Id;
        this.publication_Id = Publication_Id;
    }


}
