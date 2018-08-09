package com.cdc.blinddate.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cdc.blinddate.entity.User;
import com.cdc.blinddate.mapper.UserMapper;
import com.cdc.blinddate.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

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

    @Override
    public User login(Map<String, String> params) {
        User user=null;
        String username=params.get("username");
        String password=params.get("password");
        Wrapper<User> wrapper=new EntityWrapper<User>();
        wrapper.eq("username",username);
        wrapper.eq("password",password);
        user=this.selectOne(wrapper);
        if(null!=user){
            user.setLastLoginTime(new Date());
            this.updateById(user);
            user.setPassword(null);
        }
        return user;
    }

    @Override
    public List<User> getUserList(User user){
        List<User> list=null;
        Wrapper<User> wrapper=new EntityWrapper<User>();
        if(user!=null){
            String sex=user.getSex();
            wrapper.notIn("sex",sex);
        }
        list=this.selectList(wrapper);
        list.forEach(u -> u.setPassword(null));
        return list;
    }

    @Override
    public User getUser(Map<String, String> params) {
        User user=null;
        Wrapper<User> wrapper=new EntityWrapper<User>();
        String username=params.get("username");
        if(null!=username){
            wrapper.eq("username",username);
            user=this.selectOne(wrapper);
            if(null!=user){
                user.setPassword(null);
            }
        }
        return null;
    }
}
