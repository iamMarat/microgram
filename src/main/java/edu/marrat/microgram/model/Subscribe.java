package edu.marrat.microgram.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "subscribes")
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
public class Subscribe {
    @Id
    private String id;
    private User who;
    private User onWho;
    private LocalDate dateSub;




    public Subscribe(User who, User onWho, LocalDate dateSub) {
        this.who = who;
        this.onWho = onWho;
        this.dateSub =dateSub;
    }
}


