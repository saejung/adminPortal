package egovframework.dgym.let.admin.user.controller;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import egovframework.dgym.cmm.security.ShaEncoder;
import egovframework.dgym.let.admin.user.service.UserService;

@Controller
public class AdminUserController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminUserController.class);
	
	@Resource(name="shaEncoder")
	private ShaEncoder encoder;
	
	@Resource(name="userDaoService")
	private UserService userService;
	
	@RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	public ModelAndView userLogin(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
		System.out.println("adminLogin");		
		return new ModelAndView(".admin/login");
	}
	
	@RequestMapping(value = "/admin/tt", method = RequestMethod.GET)
	public ModelAndView userSignin(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
		System.out.println("adminSignin");		
		return new ModelAndView(".DGYM/admin/user/signin");
	}
	
	@RequestMapping(value = "/admin/user/insertUser" , method = RequestMethod.POST)
	public String insertUser(@RequestParam("userId") String userId, 
									@RequestParam("userPwd") String userPwd, 
									@RequestParam("authority") String authority,
									@RequestParam("userNm") String userNm) throws Exception
	{
		String dbpw = encoder.saltEncoding(userPwd, userId);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("userId", userId);
		paramMap.put("userPwd", dbpw);
		paramMap.put("userId", userId);
		paramMap.put("authority", authority);
		paramMap.put("userNm", userNm);
		
		int result = userService.insertUser(paramMap);
		logger.info("result ===> {}", result);
		
		return ".admin/login";
	}
}
