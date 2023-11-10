package com.intuit.assignment.authentication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Auth {

    @Id
    private Long uuid;
    private String username;
    private String password;

    public Auth(Long uuid, String password) {
        this.uuid = uuid;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Auth{" +
                "uuid=" + uuid +
                ", password='" + password + '\'' +
                '}';
    }
}
