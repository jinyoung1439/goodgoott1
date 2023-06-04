package com.hexas.goodgoott.free.dto;

import com.hexas.goodgoott.free.domain.FreeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class FreeDto {

    private int freeIdx;
    private String userId;
    private String freeTitle;
    private String freeContent;
    private int fViewCount;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private String fDelYn;

    public FreeEntity toEntity(){
        return FreeEntity.builder()
                .userId(userId)
                .freeTitle(freeTitle)
                .freeContent(freeContent)
                .fViewCount(fViewCount)
                .createDate(createDate)
                .updateDate(updateDate)
                .fDelYn(fDelYn)
                .build();
    }


}
