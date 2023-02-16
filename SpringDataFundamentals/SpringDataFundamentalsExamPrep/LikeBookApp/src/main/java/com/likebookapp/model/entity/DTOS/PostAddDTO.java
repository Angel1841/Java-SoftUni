package com.likebookapp.model.entity.DTOS;

import com.likebookapp.model.entity.MoodsEnum;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PostAddDTO {

    private long id;

    @Size(min = 2, max = 50, message = "Content length must be between 2 and 50 characters!")
    @NotNull
    private String content;

    @NotNull(message = "You must select a mood!")
    @Enumerated(EnumType.STRING)
    private MoodsEnum mood;

    public PostAddDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MoodsEnum getMood() {
        return mood;
    }

    public void setMood(MoodsEnum mood) {
        this.mood = mood;
    }

    public String getContent() {
        return content;
    }

    public PostAddDTO setContent(String content) {
        this.content = content;
        return this;
    }

}
