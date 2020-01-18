/**
 * 
 */
package com.zhaoyan.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhaoyan
 *
 * 2020年1月18日
 */
@Controller
public class IndexController {

	
	@RequestMapping({"/","index"})
	public String showIndex() {
		
		
		return "index";
	}
	
	
}
