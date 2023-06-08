package kr.bikeroad.api.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)          //Audit = 감시하다. 자동으로 시간을 매핑하여 db의 테이블에 넣어준다.
@MappedSuperclass
@Getter
public abstract class BaseEntity {

    @CreatedBy
    @Column(updatable = false)
    private String createBy;

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @CreatedDate            //Entity가 생성되어 저장될 때 시간이 자동 저장
    @Column(updatable = false)
    private LocalDateTime createDate;

    @LastModifiedBy         //조회한 Entity의 값을 변경한 마지막 사용자
    private String lastModifiedBy;

    @LastModifiedDate       //조회한 Entity의 값을 변경할 때 시간이 자동 저장
    private LocalDateTime lastModifiedDate;

}
