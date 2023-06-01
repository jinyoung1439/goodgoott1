package com.hexas.goodgoott.dev_info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexas.goodgoott.dev_info.domain.DevinfoDomain;
import com.hexas.goodgoott.dev_info.repository.DevinfoRepository;

@Service
public class DevinfoService {
	private final DevinfoRepository devinfoRepository;
	
	@Autowired
	public DevinfoService(DevinfoRepository devinfoRepository) {
		this.devinfoRepository = devinfoRepository;
	}
	
	public DevinfoDomain devcontentcreate(String user_id, String dev_title, String dev_content) {
		DevinfoDomain devContentCreate = DevinfoDomain.create(user_id, dev_title, dev_content);
		System.out.println("[service] 유저 "+user_id);
		System.out.println("[service] 타이틀 "+dev_title);
		System.out.println("[service]  내용 "+dev_content);
		return devinfoRepository.save(devContentCreate);
	}
	
	
}
