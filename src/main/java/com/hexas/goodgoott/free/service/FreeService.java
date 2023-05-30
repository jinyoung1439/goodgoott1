package com.hexas.goodgoott.free.service;

import com.hexas.goodgoott.free.domain.FreeEntity;
import com.hexas.goodgoott.free.dto.FreeResponseDto;
import com.hexas.goodgoott.free.repository.FreeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class FreeService {

    private final FreeRepository freeRepository;
    public List<FreeResponseDto> getAllFreeList(Model model) {
        List<FreeEntity> notification = freeRepository.findAll();
        return notification.stream()
                .map(FreeResponseDto::new)
                .collect(Collectors.toList());
    }
}
