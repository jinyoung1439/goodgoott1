package com.hexas.goodgoott.free.controller;

import com.hexas.goodgoott.employment_info.domain.EmploymentInfo;
import com.hexas.goodgoott.free.dto.FreeDto;
import com.hexas.goodgoott.free.dto.FreeResponseDto;
import com.hexas.goodgoott.free.service.FreeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/free")
public class FreeController {

    private  final FreeService freeService;

    @GetMapping("/list")
    public String getAllFreeList(Model model){
        List<FreeResponseDto> free = freeService.getAllFreeList(model);
        model.addAttribute("free",free);
        return "free/list";
    }

    @GetMapping("/create")
    public String create() {
        return "free/create";
    }

    @PostMapping("/create/action")
    public String write(@ModelAttribute("free") FreeDto freeDto) {
        freeService.save(freeDto);
        return "redirect:/free/list";
    }

    @GetMapping("/view")
    public String getViewById(@PathVariable int freeIdx, Model model) {
        FreeResponseDto free = freeService.getViewById(freeIdx);
        model.addAttribute("free", free);
        return "free/view";
    }

}
