package edu.marrat.microgram.model;


import edu.marrat.microgram.Generator;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



@Data
@Document(collection = "users")
@Builder
@AllArgsConstructor
public class User {

    public User() {

    }

    public User(String email, String nickname, String password) {
        this.email = email;
        this.nickname = nickname;
        this.password = password;
    }

    public static User random() {
        return builder()
                .email(Generator.makeEmail())
                .name(Generator.makeName())
                .nickname(Generator.makeName())
                .password(Generator.makePassword())
                .build();
    }
    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    @Indexed

    private String name;
    private String nickname;
    private String email;
    private String password;
    @Indexed(direction = IndexDirection.ASCENDING)
    @DBRef
    List<Publication> publications;
    @Indexed(direction = IndexDirection.ASCENDING)
    @DBRef
    List<Subscribe> subscribes;
    private int subscribersQTY ;
    private int likesQTY;
    private int followingQTY;

}

