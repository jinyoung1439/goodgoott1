package com.hexas.goodgoott.user.dto;

import com.hexas.goodgoott.user.domain.Account;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private String user_id;
    private String pw;
    private String name;
    private String email;
    private Date create_date;
    private Date update_date;

    /* DTO -> toEntity*/
  public Account toEntity(){
      Account account = Account.builder()
              .user_id(user_id)
              .pw(pw)
              .name(name)
              .email(email)
              .build();
      return account;
  }
}
