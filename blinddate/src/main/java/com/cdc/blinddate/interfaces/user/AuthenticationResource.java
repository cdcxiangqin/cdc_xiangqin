package com.cdc.blinddate.interfaces.user;

import com.cdc.blinddate.interfaces.ApiPaths;
import com.cdc.blinddate.interfaces.user.command.AuthenticateCommand;
import com.cdc.blinddate.interfaces.user.facede.UserServiceFaced;
import com.cdc.blinddate.interfaces.user.facede.dto.TokenDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @Program: blinddate
 * @Description: 用户登录
 * @Author: Mr.Hogan
 * @Create: 2018-08-05 03:12
 **/
@RestController
@RequestMapping(path = ApiPaths.API_CONTEXT_PATH)
public class AuthenticationResource {

    private final UserServiceFaced userServiceFaced;

    @Autowired
    public AuthenticationResource(final UserServiceFaced userServiceFaced) {
        this.userServiceFaced = userServiceFaced;
    }

    @ApiOperation(value = "登录", notes = "", response = TokenDTO.class, httpMethod = "POST")
    @RequestMapping(value = "/authenticate", method = POST, produces = APPLICATION_JSON_VALUE)
    public TokenDTO authenticate(@Valid @RequestBody AuthenticateCommand authenticateCommand) {
        return userServiceFaced.authenticate(authenticateCommand);
    }
}
