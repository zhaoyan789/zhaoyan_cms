/**
 * 
 */
package com.zhaoyan.cms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhaoyan.cms.constant.CmsConstant;
import com.zhaoyan.cms.pojo.User;
import com.zhaoyan.cms.service.UserService;

/**
 * @author zhaoyan
 *
 * 2020年1月18日
 */
@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 访问注册页面
	 * @return
	 */
	@RequestMapping("toRegister")
	public String toRegister(Model m) {
		
		m.addAttribute("user",new User());
		
		return "register";
	}
	
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	
	@RequestMapping("register")
	public String register(@Valid @ModelAttribute("user") User user ,BindingResult br) {
		
		if(br.hasErrors()) {
			return "register";
		}
		Integer num = userService.register(user);
		
		if(num > 0) {
			return "redirect:login";
		}
		
		return "register";
	}
	
	
	@RequestMapping("checkUser")
	@ResponseBody
	public Boolean checkUser(String username) {
		
		User user = userService.findUserByName(username);
		
		
		return (user == null );
	}
	
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String login(Model m) {
		
		m.addAttribute("user", new User());
		
		return "login";
	}
	
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public String login(@Valid @ModelAttribute("user") User user ,BindingResult br ,Model m) {
		
		if(br.hasErrors()) {
			return "login";
		}
		
		User one = userService.login(user);
		
		if(one != null) {
			
			m.addAttribute(CmsConstant.USER_KEY, one);
			
			return "redirect:/";
			
		}
	
		return "login";
	}
	
}
