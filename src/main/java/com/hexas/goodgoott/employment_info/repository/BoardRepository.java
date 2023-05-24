package com.hexas.goodgoott.employment_info.repository;

import com.hexas.goodgoott.employment_info.domain.EmploymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<EmploymentInfo, Long> {

}
