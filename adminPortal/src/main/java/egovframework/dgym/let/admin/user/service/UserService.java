package egovframework.dgym.let.admin.user.service;

import java.util.HashMap;

import egovframework.dgym.let.admin.user.vo.UserVO;

public interface UserService {
	public UserVO getUser(HashMap<String,Object> map) throws Exception;
	public int insertUser(HashMap<String, Object> map) throws Exception;
}
