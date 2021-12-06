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
    private User pathWhoComment;
    private String comment;
    private LocalDate textDate;


}
