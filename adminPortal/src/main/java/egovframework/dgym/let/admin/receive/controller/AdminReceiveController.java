package egovframework.dgym.let.admin.receive.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminReceiveController {
	
	@RequestMapping(value = "/admin/aa", method = RequestMethod.GET)
	public ModelAndView TilesTest(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
		System.out.println("tilesTest");
		
		ModelAndView mav = new ModelAndView(".DGYM/admin/receive/tilesTest/test");
		
		return mav;
	}
}
