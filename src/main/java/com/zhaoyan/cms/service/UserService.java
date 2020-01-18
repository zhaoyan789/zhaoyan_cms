/**
 * 
 */
package com.zhaoyan.cms.service;

import javax.validation.Valid;

import com.zhaoyan.cms.pojo.User;

/**
 * @author zhaoyan
 *
 * 2020年1月18日
 */

public interface UserService {

	/**
	 * 数据库检查用户名的重复性
	 * @param username
	 * @return
	 */
	User findUserByName(String username);

	/**
	 * 用户的注册
	 * @param user
	 * @return
	 */
	Integer register( User user );

	/**
	 * 用户的登陆
	 * @param user
	 * @return
	 */
	User login(User user);

	
	
	
}
