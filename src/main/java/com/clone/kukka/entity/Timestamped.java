package com.clone.kukka.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass   // Timestamped가 상속된 Entity에 자동으로 생성시간과 수정시간 등을 column으로 달아줌
@EntityListeners(AuditingEntityListener.class) //생성 및 수정시간의 변화가 있으면 자동 업데이트
public abstract class Timestamped {

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;
}
