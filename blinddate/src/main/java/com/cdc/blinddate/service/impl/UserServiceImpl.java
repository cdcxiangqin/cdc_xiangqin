package com.cdc.blinddate.service.impl;

import com.cdc.blinddate.entity.User;
import com.cdc.blinddate.mapper.UserMapper;
import com.cdc.blinddate.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author 纪佳鸿
 * @since 2018-08-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	
}
