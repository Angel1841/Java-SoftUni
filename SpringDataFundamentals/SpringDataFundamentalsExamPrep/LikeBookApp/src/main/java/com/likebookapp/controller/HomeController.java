package com.likebookapp.controller;

import com.likebookapp.model.entity.User;
import com.likebookapp.repository.UserRepository;
import com.likebookapp.service.AuthService;
import com.likebookapp.session.LoggedUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final LoggedUser loggedUser;

    private final UserRepository userRepository;

    public HomeController(LoggedUser loggedUser,  UserRepository userRepository) {
        this.loggedUser = loggedUser;
        this.userRepository = userRepository;

    }

    @GetMapping("/")
    public String index(){
        return "/index";
    }

    @GetMapping("/home")
    public String loggedInIndex(Model model){

        if (!loggedUser.isLogged()) {
            return "redirect:/";
        }

        User user = userRepository.findById(loggedUser.getId()).orElse(null);

        model.addAttribute("user", user);


        return "/home";
    }

}
