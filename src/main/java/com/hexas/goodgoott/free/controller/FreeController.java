package com.hexas.goodgoott.free.controller;

import com.hexas.goodgoott.free.dto.FreeResponseDto;
import com.hexas.goodgoott.free.service.FreeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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


}
