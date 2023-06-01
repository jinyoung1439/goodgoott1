package com.hexas.goodgoott.dev_info.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "dev_info")
public class DevinfoDomain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dev_idx;
	
	
	private String user_id;
	private String dev_title;
	private String dev_content;
	
	// 게시글 생성 
	public static DevinfoDomain create(String user_id, String dev_title, String dev_content) {
		
		System.out.println("domain단 user_id "+user_id);
		System.out.println("domain단 dev_title "+dev_title);
		System.out.println("domain단 dev_content "+dev_content);
		
		DevinfoDomain devcontentcreate = new DevinfoDomain();
		devcontentcreate.user_id = user_id;
		devcontentcreate.dev_title = dev_title;
		devcontentcreate.dev_content = dev_content;
		System.out.println("domain단 내용 확인 "+devcontentcreate.user_id);
		System.out.println("domain단 내용 확인 "+devcontentcreate.dev_title);
		System.out.println("domain단 내용 확인 "+devcontentcreate.dev_content);
		
		return devcontentcreate;
	}
	
}
