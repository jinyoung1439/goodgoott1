package com.hexas.goodgoott.user.domain;

import com.hexas.goodgoott.global.auth.UserRole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data // getter, setter
@Builder
@AllArgsConstructor //
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="user")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 Id 생성
    private Long id;

    @Column(nullable = false, unique = true)
    private String user_id;
    @Column(nullable = false)
    private String pw;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole userRole;

}
