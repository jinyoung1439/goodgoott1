//package com.hexas.goodgoott.user.controller;
//
//import com.hexas.goodgoott.user.dto.UserDTO;
//import com.hexas.goodgoott.user.service.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/users/")
//public class UserController {
//
//    UserService userService;
//
//    @GetMapping("/signup")
//    public String register(){
//        return "/user/user_signup";
//    }
//
//    @PostMapping("/signup_proc")
//    public String signUpProc(UserDTO userDTO){
//        userService.join(userDTO);
//        return "redirect:/users/login";
//    }
//
//    @GetMapping("/login")
//    public String login(){
//        return "user/user_login";
//    }
//
//}
