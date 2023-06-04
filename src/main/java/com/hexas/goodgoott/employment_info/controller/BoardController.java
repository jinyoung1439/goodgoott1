package com.hexas.goodgoott.employment_info.controller;

import com.hexas.goodgoott.employment_info.domain.EmploymentInfo;
import com.hexas.goodgoott.employment_info.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/employment")
@Controller
public class BoardController {

    final BoardService boardService;

    @GetMapping("/create")
    public String create() {
        return "employment_info/create";
    }

    @PostMapping("/create")
    public String write(@ModelAttribute("EmploymentInfo") EmploymentInfo employmentInfo) {
        boardService.save(employmentInfo);
        return "employment_info/create";
    }

    @GetMapping("/list")
    public ModelAndView list(ModelAndView mv) {
        List<EmploymentInfo> list = boardService.findAll();
        mv.setViewName("employment_info/list");
        mv.addObject("list", list);
        return mv;
    }
    @GetMapping("/detail/list/{idx}")
    public ModelAndView detail(@PathVariable("idx") int idx, ModelAndView mv){

        return mv;
    }


}
