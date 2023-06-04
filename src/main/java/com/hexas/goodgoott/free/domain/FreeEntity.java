package com.hexas.goodgoott.free.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
@Entity
@Table(name = "free")
public class FreeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "free_idx")
    private int freeIdx;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "free_title")
    private String freeTitle;
    @Column(name = "free_content")
    private String freeContent;
    @Column(name = "f_viewcount")
    private int fViewCount;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    @Column(name = "update_date")
    private LocalDateTime updateDate;
    @Column(name = "f_del_yn")
    private String fDelYn;

    @Builder
    public FreeEntity(int freeIdx, String userId, String freeTitle,
                      String freeContent, int fViewCount, LocalDateTime createDate,
                      LocalDateTime updateDate, String fDelYn) {
        this.freeIdx = freeIdx;
        this.userId = userId;
        this.freeTitle = freeTitle;
        this.freeContent = freeContent;
        this.fViewCount = fViewCount;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.fDelYn = fDelYn;
    }
}
