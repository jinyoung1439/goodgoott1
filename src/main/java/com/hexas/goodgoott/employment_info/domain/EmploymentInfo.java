package com.hexas.goodgoott.employment_info.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity(name="employment_info")
public class EmploymentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employment_idx;
    private String employment_title,employment_content, user_id;
    private Timestamp create_date;
}
