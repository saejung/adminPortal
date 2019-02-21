
package egovframework.dgym.let.admin.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminMainController {
	
	@RequestMapping(value = "/admin/main", method = RequestMethod.GET)
	public ModelAndView Main(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
		System.out.println("adminMain");
		
		ModelAndView mav = new ModelAndView(".DGYM/admin/main");
		
		/*Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		CustomUser customUser = (CustomUser)auth.getPrincipal();
		
		mav.addObject("userId", customUser.getUsername());*/
		return mav;
	}	
}
