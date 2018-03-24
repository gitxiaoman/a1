package org.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssm.model.User;
import org.ssm.service.UserService;

@Controller
public class UserController {
	
	@Autowired //依赖注入   spring扫描的原因
	private UserService userService ;
	
	@RequestMapping("/showRegister")
	public String showRegister(){
		return "register" ;
	}
	
	@RequestMapping("/register")
	public String register(User user,Model model){
		userService.register(user) ;
		return "success" ;
	}
	

}
