package com.cdc.blinddate.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cdc.blinddate.entity.User;
import com.cdc.blinddate.mapper.UserMapper;
import com.cdc.blinddate.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cdc.blinddate.util.FileUtil;
import com.cdc.blinddate.util.JsonUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
    public User register(Map<String, String> params) {
        User user=null;
        String username=params.get("username");
        Wrapper<User> wrapper=new EntityWrapper<User>();
        wrapper.eq("username",username);
        user=this.selectOne(wrapper);
        if(null!=user)
            return null;
        user=new User();
        String password=params.get("password");
        String name=params.get("name");
        String sex=params.get("sex");
        String uuid=UUID.randomUUID().toString().replace("-","");
        user.setId(uuid);
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setSex(sex);
        user.setCreateTime(new Date());
        user.setStatus("1");
        user.setActivity(0L);
        user.setPopularity(0L);
        boolean isSuccess=this.insert(user);
        if(isSuccess==true){
            user=this.selectOne(wrapper);
            return user;
        }else{
            return null;
        }
    }

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
            user.setActivity(user.getActivity()+1);
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
                user.setPopularity(user.getPopularity()+1);
                this.updateById(user);
            }
        }
        return user;
    }

    @Override
    public User modifyUser(Map<String, String> params) {
        User user=null;
        user=(User)JsonUtil.mapToObject(params,User.class);
        //将不可被传值修改的字段赋值为null
//        user.setUsername(null);
        user.setPassword(null);
        user.setName(null);
        user.setSex(null);
        user.setAge(null);
        user.setZodiac(null);
        user.setConstellation(null);
        user.setHeadAddress(null);
        user.setCreateTime(null);
        user.setLastLoginTime(null);
        user.setStatus(null);
        user.setActivity(null);
        user.setPopularity(null);

        boolean updateResult=this.updateById(user);
        if(true==updateResult){
            user=this.selectById(user.getId());
        }else{
            user=null;
        }
        return user;
    }

    @Override
    public String uploadHeadImg(MultipartFile file,User user,String baseDir,String relativeDir) {
//        String contentType=file.getContentType();
        String fileName=file.getOriginalFilename();
        String uuid=UUID.randomUUID().toString().replace("-","");
        fileName=uuid+fileName.substring(fileName.lastIndexOf('.'));
        String fullDir=baseDir+relativeDir;
        String relativePath=null;
        try {
            FileUtil.uploadFile(file.getBytes(),fullDir,fileName);
            relativePath=relativeDir+fileName;
            //在这里保存成功后可以把user里面以前保存的图片删掉或者其他操作
            user.setHeadAddress(relativePath);
            this.updateById(user);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return relativePath;
    }
}
