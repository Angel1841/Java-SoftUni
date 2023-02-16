package com.likebookapp.controller;

import com.likebookapp.model.entity.DTOS.PostAddDTO;
import com.likebookapp.service.PostService;
import com.likebookapp.session.LoggedUser;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class PostController {

    @ModelAttribute("postAddDTO")
    public PostAddDTO postAddDTO(){
        return new PostAddDTO();
    }

    private LoggedUser loggedUser;

    private PostService postService;

    public PostController(LoggedUser loggedUser, PostService postService) {
        this.loggedUser = loggedUser;
        this.postService = postService;
    }

    @GetMapping("/post-add")
    public String postAdd(){
        if (!loggedUser.isLogged()) {
            return "redirect:/users/login";
        }

        return "/post-add";
    }

    @PostMapping("/post-add")
    public String postAdd(@Valid PostAddDTO postAddDTO,
                          BindingResult bindingResult,
                          RedirectAttributes redirectAttributes){

        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("postAddDTO", postAddDTO);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userRegistrationDTO", bindingResult);

            return  "redirect:/posts/add-post";
        }

        postAddDTO.setId(loggedUser.getId());
        this.postService.addPost(postAddDTO);
        return "redirect:/home";
    }

}
