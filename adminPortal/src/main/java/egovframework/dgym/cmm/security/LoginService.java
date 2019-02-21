package egovframework.dgym.cmm.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import egovframework.dgym.let.admin.user.dao.UserDAO;
import egovframework.dgym.let.admin.user.vo.UserVO;

public class LoginService implements UserDetailsService{
	private static final Logger logger = LoggerFactory.getLogger(LoginService.class);
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		
		logger.debug("loadUserByUsername: username=" + userId);
		
		UserVO userVO = null;
		try{
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("userId", userId);
			
			userVO = userDAO.getUser(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(userVO == null){
			throw new UsernameNotFoundException(userId);
		}
		
		List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
		roles.add(new SimpleGrantedAuthority(userVO.getAuthority().toString()));
		
		UserDetails user = new CustomUser(userVO.getUserId(), userVO.getUserPwd(), roles, userVO.getUserNm());
		
		return user;
	}
}
