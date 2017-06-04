package org.slsale.controller.user;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.slsale.pojo.user.User;
import org.slsale.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	private Logger logger=Logger.getLogger(UserController.class);
	
	@Resource
	private UserService userService;
	@RequestMapping("/index.html")
	public String index(){
		logger.debug("UserController Wellcome SLSaleSystem!");
		return "index";
	}
	@RequestMapping("/login.html")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/dologin.html")
	public ModelAndView dologin(User user ){
		logger.debug("dologin====>loginCode:" +user.getLoginCode()
					+"----password:"+user.getPassword());
		try {
			user=userService.getLoginUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("loginsuccess");
	}
	
	@RequestMapping("/exit.html")
	public String exit(){
		return "exit";
	}
	@RequestMapping("/register.html")
	public String register(){
		return "register";
	}
	@RequestMapping("/doregister.html")
	public ModelAndView doRegister(User user){
		try {
			int f=userService.addUser(user);
			if(f>0){
				user=userService.getLoginUser(user);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("regsuccess");
	}
	

}
