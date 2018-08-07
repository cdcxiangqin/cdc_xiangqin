package com.cdc.blinddate.interfaces.facede;

import com.cdc.blinddate.interfaces.user.facede.dto.TokenDTO;

import java.util.Optional;

/**
 * @Program: blinddate
 * @Description: 业务逻辑
 * @Author: Mr.Hogan
 * @Create: 2018-08-05 17:01
 **/
public interface UserServiceFaced {

    TokenDTO authenticate(com.cdc.blinddate.interfaces.command.AuthenticateCommand authenticateCommand);
}
