package com.likebookapp.model.entity;

import javax.persistence.*;
import java.util.Set;

@Table(name = "moods")
@Entity
public class Mood extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private MoodsEnum moodName;

    @Column
    private String description;

    @OneToMany(mappedBy = "mood")
    private Set<Post> posts;

    public Mood() {
    }

    public MoodsEnum getMoodName() {
        return moodName;
    }

    public Mood setMoodName(MoodsEnum moodName) {
        this.moodName = moodName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Mood setDescription(String description) {
        this.description = description;
        return this;
    }


    public Set<Post> getPosts() {
        return posts;
    }

    public Mood setPosts(Set<Post> posts) {
        this.posts = posts;
        return this;
    }

}
