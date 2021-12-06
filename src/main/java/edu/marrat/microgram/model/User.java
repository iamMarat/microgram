package edu.marrat.microgram.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

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
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
public class User {
    @Id
    private String id;
    private String userName;
    private String email;
    private String password;
    @Indexed(direction = IndexDirection.ASCENDING)
    @DBRef
    List<Publication> publications = new ArrayList<>();
    @Indexed(direction = IndexDirection.ASCENDING)
    List<Subscribe> subscribes = new ArrayList<>();
    private int subscribersQTY ;
    private int likesQTY;
    private int followingQTY;


//    private List<Like> like = new ArrayList<>();



    public User(String userName, String email, String password, List<Publication> publications, List<Subscribe> subscribes) {

        this.userName = userName;
        this.email = email;
        this.password = password;
        this.publications = publications;
        this.subscribes = subscribes;
    }

    public User(String userName, String email, String password, int subscribersQTY, int likesQTY, int followingQTY) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.subscribersQTY = subscribersQTY;
        this.likesQTY = likesQTY;
        this.followingQTY = followingQTY;
    }

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

//
//        Имя учетной записи, Адрес электронной почты, Пароль,
//        Счетчики количества публикаций, подписок и подписчиков.
