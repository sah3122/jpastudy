package jpabook.jpashop;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * Created by dongchul on 2019-08-02.
 */
@MappedSuperclass
public class BaseEntity {

    private String createdBy;
    private LocalDateTime createdDate;
}
