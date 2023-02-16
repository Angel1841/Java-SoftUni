package com.likebookapp.service;

import com.likebookapp.model.entity.DTOS.PostAddDTO;
import com.likebookapp.model.entity.Mood;
import com.likebookapp.model.entity.Post;
import com.likebookapp.model.entity.User;
import com.likebookapp.repository.PostRepository;
import com.likebookapp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private PostRepository postRepository;

    private UserRepository userRepository;

    private MoodService moodService;

    public PostService(PostRepository postRepository, UserRepository userRepository, MoodService moodService) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
        this.moodService = moodService;
    }

    public void addPost(PostAddDTO addPostDTO) {
        this.postRepository.save(this.mapPost(addPostDTO));
    }

    private Post mapPost(PostAddDTO addPostDTO) {
        Post post = new Post();
        Mood mood = this.moodService.findMood(addPostDTO.getMood());
        User userById = userRepository.findById(addPostDTO.getId()).orElse(null);

        post.setMood(mood);
        post.setContent(addPostDTO.getContent());
        post.setUser(userById);
        return post;
    }

}
