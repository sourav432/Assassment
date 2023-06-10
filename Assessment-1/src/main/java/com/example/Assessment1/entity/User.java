package com.example.Assessment1.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "userType_id")
    private TypeMaster userType;

    public User() {
    }

    public User(Long id, String username, String password, TypeMaster userType) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TypeMaster getUserType() {
        return userType;
    }

    public void setUserType(TypeMaster userType) {
        this.userType = userType;
    }
}
