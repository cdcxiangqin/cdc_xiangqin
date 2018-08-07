package com.cdc.blinddate.interfaces.user.internal;

import com.cdc.blinddate.entity.BaseUser;
import com.cdc.blinddate.entity.UserSingIn;

import com.cdc.blinddate.interfaces.user.command.AuthenticateCommand;
import com.cdc.blinddate.interfaces.user.command.RegisterCommand;
import com.cdc.blinddate.interfaces.user.facede.UserServiceFaced;
import com.cdc.blinddate.interfaces.user.facede.dto.RegisterDto;
import com.cdc.blinddate.interfaces.user.facede.dto.TokenDTO;
import com.cdc.blinddate.repository.BaseUserRepository;
import com.cdc.blinddate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Program: blinddate
 * @Description: 接口的实现
 * @Author: Mr.Hogan
 * @Create: 2018-08-05 17:24
 **/

@Service
public class UserServiceFacedImpl implements UserServiceFaced {

    private final UserRepository userRepository;
    private final BaseUserRepository baseUserRepository;

    @Autowired
    public UserServiceFacedImpl(final UserRepository userRepository,
                                BaseUserRepository baseUserRepository) {
        this.userRepository = userRepository;
        this.baseUserRepository = baseUserRepository;
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public TokenDTO authenticate(AuthenticateCommand authenticateCommand) {
        String username = authenticateCommand.getUsername();
//        String password = authenticateCommand.getPassword();

        UserSingIn userSingIn = userRepository.findByUsername(username);

        if (userSingIn==null) {
            System.out.println("查无此人");

            return null;
        } else {
            TokenDTO tokenDTO = new TokenDTO();
            tokenDTO.setUserId(userSingIn.getId());
            tokenDTO.setName(userSingIn.getUsername());

            return tokenDTO;
        }

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public RegisterDto signUp(RegisterCommand registerCommand) {
        BaseUser baseUser = new BaseUser();
        baseUser.setUsername(registerCommand.getName());
        baseUser.setPassword(registerCommand.getPassword());
        baseUser.setSex((registerCommand.getSex()));
        baseUser.setEmail(registerCommand.getEmail());
        baseUserRepository.save(baseUser);

        RegisterDto registerDto = new RegisterDto();
        registerDto.setUsername(registerCommand.getName());
        registerDto.setSex(registerCommand.getSex());

        return registerDto;
    }
}
