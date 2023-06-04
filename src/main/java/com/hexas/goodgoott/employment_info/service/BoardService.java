package com.hexas.goodgoott.employment_info.service;

import com.hexas.goodgoott.employment_info.domain.EmploymentInfo;
import com.hexas.goodgoott.employment_info.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {

    final BoardRepository boardRepository;

    public void save(EmploymentInfo employmentInfo) {
        boardRepository.save(employmentInfo);
    }

    public List<EmploymentInfo> findAll() {
        return boardRepository.findAll();
    }
}
