package com.gold.wang.oauthservice.domain;


public class User {

    private Long id;

    private String username;

    private String realname;

    public User() {
    }

    public User(Long id, String username, String realname) {
        this.id = id;
        this.username = username;
        this.realname = realname;
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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
}
