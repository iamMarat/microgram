package edu.marrat.microgram.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "subscribes")
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
public class Subscribe {
    private String id;
    private User WhoSub;
    private User OnWhomSub;
    private LocalDate dateSub;


}


