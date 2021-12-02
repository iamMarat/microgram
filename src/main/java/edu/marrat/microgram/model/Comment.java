package edu.marrat.microgram.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document(collection = "comments")
@Data
public class Comment {
    private User pathWhoComment;
    private String comment;
    private LocalDate textDate;


}
