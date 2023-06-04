package com.hexas.goodgoott.user.domain;

import com.hexas.goodgoott.global.auth.UserRole;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="user")
@Data // getter, setter
@Builder
@AllArgsConstructor //
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 Id 생성
    private Long id;

    @Column(nullable = false, unique = true, name= "user_id")
    private String user_id;
    @Column(nullable = false, name="pw")
    private String pw;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, name = "create_date")
    private Date create_date;
    @Column(nullable = false, name="update_date")
    private Date update_date;
    @Column(name = "u_del_un")
    private String u_del_yn;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole userRole;

}
