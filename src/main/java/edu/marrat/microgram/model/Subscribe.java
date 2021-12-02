package edu.marrat.microgram.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "subscribes")
@Data
public class Subscribe {
    User WhoSub;
    User OnWhomSub;
    LocalDate dateSub;

    public Subscribe(User whoSub, User onWhomSub, LocalDate dateSub) {
        WhoSub = whoSub;
        OnWhomSub = onWhomSub;
        this.dateSub = dateSub;
    }
}


