package edu.marrat.microgram.model;


import edu.marrat.microgram.util.Generator;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.UUID;



@Data
@Document(collection = "users")
@Builder
@AllArgsConstructor
public class User implements UserDetails {

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
    @Indexed(direction = IndexDirection.ASCENDING)
    private String nickname;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String email;
    private String password;
    @DBRef
    List<Publication> publications;
    @DBRef
    List<Subscribe> subscribes;
    private int subscribersQTY ;
    private int likesQTY;
    private int followingQTY;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}

