/**
 * 
 */
package com.zhaoyan.cms.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.zhaoyan.cms.pojo.User;

/**
 * @author zhaoyan
 *
 * 2020年1月18日
 */

public interface UserMapper {

	/**
	 * @param username
	 * @return
	 */
	@Select("SELECT `username`,`password` FROM cms_user WHERE username = #{value} ")
	User findUserByName(String username);

	/**
	 * @param user
	 * @return
	 */
	@Insert("INSERT INTO cms_user(username,`password`) VALUES (#{username},#{password}) ")
	Integer register(User user);

	/**
	 * @param user
	 * @return
	 */
	@Select("SELECT `username`,`password` FROM cms_user WHERE username = #{username} AND password = #{password}")
	User login(User user);

}
