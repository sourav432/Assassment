package com.example.Assessment1.entity;

import javax.persistence.*;

@Entity
@Table(name = "type_master")
public class TypeMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userType")
    private String userType;

    public TypeMaster() {
    }

    public TypeMaster(Long id, String userType) {
        this.id = id;
        this.userType = userType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
