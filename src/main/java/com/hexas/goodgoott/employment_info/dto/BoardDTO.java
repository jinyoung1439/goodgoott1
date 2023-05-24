package com.hexas.goodgoott.employment_info.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BoardDTO {
    String user_id, title, content, e_del_yn;
    int e_viewcount;
    Date create_date, update_date;

}
