package com.cdc.blinddate.repository;

import com.cdc.blinddate.entity.UserSingIn;
import org.springframework.data.repository.CrudRepository;

/**
 * @Program: blinddate
 * @Description: Crud
 * @Author: Mr.Hogan
 * @Create: 2018-08-05 18:20
 **/
public interface UserRepository extends CrudRepository<UserSingIn, Long> {

    UserSingIn findByUsername(String name);

}
