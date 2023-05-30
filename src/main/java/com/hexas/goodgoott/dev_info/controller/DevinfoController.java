package com.hexas.goodgoott.dev_info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hexas.goodgoott.dev_info.domain.DevinfoDomain;
import com.hexas.goodgoott.dev_info.dto.DevinfoDTO;
import com.hexas.goodgoott.dev_info.service.DevinfoService;

@Controller
public class DevinfoController {
	private final DevinfoService devinfoService;
	
	@Autowired
	public DevinfoController(DevinfoService devinfoService) {
		this.devinfoService =  devinfoService;
	}
	
	@PostMapping(value = "/devinfo")
	public ResponseEntity<DevinfoDomain> devcontentcreate(DevinfoDTO devinfoDTO) {
		DevinfoDomain devcontentcreate = devinfoService.devcontentcreate(devinfoDTO.getUser_id(),devinfoDTO.getDev_title(), devinfoDTO.getDev_content());
		System.out.println("[controller] 유저 "+devinfoDTO.getUser_id());
		System.out.println("[controller] 타이틀 "+devinfoDTO.getDev_title());
		System.out.println("[controller]  내용 "+devinfoDTO.getDev_content());
		return new ResponseEntity<>(devcontentcreate, HttpStatus.CREATED);
	}
	
	
	
	//Test url 접근 확인용
    @GetMapping("/devinfo_writing")
    public String register(){
        return "/dev_info/devinfo_writing";
    }
}
