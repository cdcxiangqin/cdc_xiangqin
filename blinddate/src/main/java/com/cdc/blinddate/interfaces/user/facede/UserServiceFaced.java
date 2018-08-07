package com.cdc.blinddate.interfaces.user.facede;

import com.cdc.blinddate.interfaces.user.command.AuthenticateCommand;
import com.cdc.blinddate.interfaces.user.command.RegisterCommand;
import com.cdc.blinddate.interfaces.user.facede.dto.RegisterDto;
import com.cdc.blinddate.interfaces.user.facede.dto.TokenDTO;

/**
 * @Program: blinddate
 * @Description: 业务逻辑
 * @Author: Mr.Hogan
 * @Create: 2018-08-05 17:01
 **/
public interface UserServiceFaced {

    TokenDTO authenticate(AuthenticateCommand authenticateCommand);
    RegisterDto signUp(RegisterCommand registerCommand);
}
