package egovframework.dgym.let.admin.user.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.dgym.let.admin.user.dao.UserDAO;
import egovframework.dgym.let.admin.user.service.UserService;
import egovframework.dgym.let.admin.user.vo.UserVO;

@Service("userDaoService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public UserVO getUser(HashMap<String, Object> map) throws Exception {
		
		UserVO user = userDAO.getUser(map);
		
		return user;
	}

	@Override
	public int insertUser(HashMap<String, Object> map) throws Exception {
		return userDAO.insertUser(map);
	}

}
