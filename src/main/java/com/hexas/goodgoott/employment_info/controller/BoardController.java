package com.hexas.goodgoott.employment_info.controller;

import com.hexas.goodgoott.employment_info.domain.EmploymentInfo;
import com.hexas.goodgoott.employment_info.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/employment")
@Controller
public class BoardController {

    final BoardService boardService;

    @GetMapping("/create")
    public String create(){
        return "employment_info/create";
    }
    @PostMapping("/create")
    public String write(@ModelAttribute("EmploymentInfo") EmploymentInfo employmentInfo){
        boardService.save(employmentInfo);
        return "employment_info/create";
    }
}
