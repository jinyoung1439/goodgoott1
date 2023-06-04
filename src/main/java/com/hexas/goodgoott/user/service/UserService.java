package com.hexas.goodgoott.user.service;

import com.hexas.goodgoott.user.dto.UserDTO;
import com.hexas.goodgoott.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder encoder;

//    public UserService(UserRepository userRepository, BCryptPasswordEncoder encoder) {
//        this.userRepository = userRepository;
//        this.encoder = encoder;
//    }
    @Transactional
    public Long join(UserDTO userDTO){
        userDTO.setPw(encoder.encode(userDTO.getPw()));
        return userRepository.save(userDTO.toEntity()).getId();
    }
}
