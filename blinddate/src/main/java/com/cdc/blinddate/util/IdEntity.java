package com.cdc.blinddate.util;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @Program: blinddate
 * @Description: 统一定义id的entity的基类
 * @Author: Mr.Hogan
 * @Create: 2018-08-05 02:24
 **/
@MappedSuperclass
public class IdEntity {
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
