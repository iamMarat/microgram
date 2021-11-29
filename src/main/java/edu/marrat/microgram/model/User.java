package edu.marrat.microgram.model;


public class User {
    private Long id;
    private String userName;
    private String email;
    private String password;
    private int qtyOfLike;
    private int qtyOfFollower;
    private int qtyOfFollowing;


    public User(Long id, String userName, String email, String password, int qtyOfLike, int qtyOfFollower, int qtyOfFollowing) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.qtyOfLike = qtyOfLike;
        this.qtyOfFollower = qtyOfFollower;
        this.qtyOfFollowing = qtyOfFollowing;
    }

    public User(String userName, String email, String password, int qtyOfLike, int qtyOfFollower, int qtyOfFollowing) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.qtyOfLike = qtyOfLike;
        this.qtyOfFollower = qtyOfFollower;
        this.qtyOfFollowing = qtyOfFollowing;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getQtyOfLike() {
        return qtyOfLike;
    }

    public void setQtyOfLike(int qtyOfLike) {
        this.qtyOfLike = qtyOfLike;
    }

    public int getQtyOfFollower() {
        return qtyOfFollower;
    }

    public void setQtyOfFollower(int qtyOfFollower) {
        this.qtyOfFollower = qtyOfFollower;
    }

    public int getQtyOfFollowing() {
        return qtyOfFollowing;
    }

    public void setQtyOfFollowing(int qtyOfFollowing) {
        this.qtyOfFollowing = qtyOfFollowing;
    }
}

//
//        Имя учетной записи, Адрес электронной почты, Пароль,
//        Счетчики количества публикаций, подписок и подписчиков.
