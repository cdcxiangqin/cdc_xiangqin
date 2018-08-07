package com.cdc.blinddate.interfaces.user.internal;

import com.cdc.blinddate.entity.UserSingIn;

import com.cdc.blinddate.interfaces.user.command.AuthenticateCommand;
import com.cdc.blinddate.interfaces.user.facede.UserServiceFaced;
import com.cdc.blinddate.interfaces.user.facede.dto.TokenDTO;
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

    @Autowired
    public UserServiceFacedImpl(final UserRepository userRepository) {
        this.userRepository = userRepository;
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
}
