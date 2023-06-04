package com.hexas.goodgoott.user.controller;

import com.hexas.goodgoott.user.dto.UserDTO;
import com.hexas.goodgoott.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users/")
public class UserController {

    UserService userService;
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signup")
    public String signUp(){
        return "/user/user_signup";
    }

    @PostMapping("/signup_proc")
    public String signUpProc(@ModelAttribute UserDTO userDTO){
        System.out.println("contoroller : "  + userDTO);
        logger.info("회원가입 : {}", userDTO);
        userService.join(userDTO);
        return "redirect:/users/login";
    }

    @GetMapping("/login")
    public String login(){
        return "user/user_login";
    }

}
