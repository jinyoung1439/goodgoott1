package com.hexas.goodgoott.free.dto;

import com.hexas.goodgoott.free.domain.FreeEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class FreeResponseDto {

    private int freeIdx;
    private String userId;
    private String freeTitle;
    private String freeContent;
    private int fViewCount;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private String fDelYn;

    public FreeResponseDto(FreeEntity entity) {
        this.freeIdx = entity.getFreeIdx();
        this.freeTitle = entity.getFreeTitle();
        this.freeContent = entity.getFreeContent();
        this.fViewCount = entity.getFViewCount();
        this.createDate = entity.getCreateDate();
        this.updateDate = entity.getUpdateDate();
        this.fDelYn = entity.getFDelYn();
    }

    @Override
    public String toString() {
        return "freeResponseDto{" +
                "freeIdx=" + freeIdx +
                ", userId='" + userId + '\'' +
                ", freeTitle='" + freeTitle + '\'' +
                ", freeContent='" + freeContent + '\'' +
                ", fViewCount=" + fViewCount +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", fDelYn='" + fDelYn + '\'' +
                '}';
    }
}
