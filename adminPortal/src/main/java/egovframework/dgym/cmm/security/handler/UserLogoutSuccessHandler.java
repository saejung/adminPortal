package egovframework.dgym.cmm.security.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

public class UserLogoutSuccessHandler implements LogoutSuccessHandler{
	
	private static final Logger logger = LoggerFactory.getLogger(UserLogoutSuccessHandler.class);

	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth)
			throws IOException, ServletException {
		
		logger.debug("UserLogoutSuccessHandler");
		
		response.sendRedirect(request.getContextPath() + "/admin/login");
	}
}
