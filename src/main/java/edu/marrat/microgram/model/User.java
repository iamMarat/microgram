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

//@Data
//@Document(collection="comments")
//        class Comment {
//       @Id
//    private String id;
//    private String path;
//    private String body;
//    private String username;
//    private int depth;
//    private String thread_id;
//}



@Data
@Document(collection = "users")
@CompoundIndex( def = "{'userName': 1, 'email': 1}")
@Builder
@AllArgsConstructor
public class User {

    public static User random() {
        return builder()
                .email(Generator.makeEmail())
                .name(Generator.makeName())
                .build();
    }
    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    @Indexed
    private String name;
    private String nickname;
    @Indexed
    private String email;
    private String password;
    @Indexed(direction = IndexDirection.ASCENDING)
    @DBRef
    List<Publication> publications = new ArrayList<>();
    @Indexed(direction = IndexDirection.ASCENDING)
    @DBRef
    List<Subscribe> subscribes = new ArrayList<>();
    private int subscribersQTY ;
    private int likesQTY;
    private int followingQTY;

}

//
//        Имя учетной записи, Адрес электронной почты, Пароль,
//        Счетчики количества публикаций, подписок и подписчиков.
