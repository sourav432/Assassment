package com.example.Assessment1.dto;

public class UserDTO {
    private String username;
    private String userType;

    public UserDTO() {
    }

    public UserDTO(String username, String userType) {
        this.username = username;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
