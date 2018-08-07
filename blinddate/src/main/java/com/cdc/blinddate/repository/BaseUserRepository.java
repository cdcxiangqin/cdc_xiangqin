package com.cdc.blinddate.repository;

import com.cdc.blinddate.entity.BaseUser;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @Program: cdc_xiangqin
 * @Description: 全部的个人资料信息在数据库的查询
 * @Author: Mr.Hogan
 * @Create: 2018-08-07 21:08
 **/
public interface BaserRepository extends JpaRepository<BaseUser, Long> {
//    BaserRepository findByUsername(BaseUser);
}
