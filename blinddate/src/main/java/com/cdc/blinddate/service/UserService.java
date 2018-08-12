package com.cdc.blinddate.service;

import com.cdc.blinddate.entity.User;
import com.baomidou.mybatisplus.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author 纪佳鸿
 * @since 2018-08-03
 */
public interface UserService extends IService<User> {
	public User register(Map<String,String> params);

	public User login(Map<String,String> params);

	public List<User> getUserList(User user);

	public User getUser(Map<String,String> params);

	public User modifyUser(Map<String,String> params);

	public String uploadHeadImg(MultipartFile file,User user,String baseDir,String relativeDir);
}
