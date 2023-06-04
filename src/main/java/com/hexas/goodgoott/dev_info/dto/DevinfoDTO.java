package com.hexas.goodgoott.dev_info.dto;

public class DevinfoDTO {
	
	private String user_id;
	private String dev_title;
	private String dev_content;
	
	// Getter
	public String getUser_id() {
		return user_id;
	}
	
	public String getDev_title() {
		return dev_title;
	}
	
	public String getDev_content() {
		return dev_content;
	}
	
	// Setter
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public void setDev_title(String dev_title) {
		this.dev_title = dev_title;
	}
	
	public void setDev_content(String dev_content) {
		this.dev_content = dev_content;
	}
	
	
	
	//게시글 생성 및 요청 method
	public static DevinfoDTO of(String user_id, String dev_title, String dev_content) {
		System.out.println("DTO 실행되냐? ");
		DevinfoDTO devinfoDTO = new DevinfoDTO();
		devinfoDTO.setUser_id(user_id);
		devinfoDTO.setDev_title(dev_title);
		devinfoDTO.setDev_content(dev_content);
		return devinfoDTO;
		
		
	}

	

	
}