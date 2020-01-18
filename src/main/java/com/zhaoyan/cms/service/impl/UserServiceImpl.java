/**
 * 
 */
package com.zhaoyan.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bot.utils.MsgEncrypt;
import com.zhaoyan.cms.mapper.UserMapper;
import com.zhaoyan.cms.pojo.User;
import com.zhaoyan.cms.service.UserService;

/**
 * @author zhaoyan
 *
 * 2020年1月18日
 */
@Service
public class UserServiceImpl implements UserService{

	
	@Autowired 
	private  UserMapper userMapper;

	@Override
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		return userMapper.findUserByName(username);
	}

	@Override
	public Integer register(User user) {
		// TODO Auto-generated method stub
		String msgEncrypt = MsgEncrypt.msgEncrypt(user.getPassword(), user.getUsername());
		
		user.setPassword(msgEncrypt);
		
		
		return userMapper.register(user);
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		
		String msgEncrypt = MsgEncrypt.msgEncrypt(user.getPassword(), user.getUsername());
		
		user.setPassword(msgEncrypt);
		
		return userMapper.login(user);
	}
	
	
}
