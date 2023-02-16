package com.likebookapp.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Table(name = "posts")
@Entity
public class Post extends BaseEntity{

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    private User user;

    @Column
    private int likes;

    @ManyToMany
    private Set<User> userLikes;

    @ManyToOne
    private Mood mood;

    public Post() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Set<User> getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(Set<User> userLikes) {
        this.userLikes = userLikes;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }
}
