package egovframework.dgym.let.admin.user.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import egovframework.dgym.let.admin.user.vo.UserVO;

@Repository
public interface UserDAO {

	public UserVO getUser(HashMap<String, Object> map) throws Exception;
	public int insertUser(HashMap<String, Object> map) throws Exception;

}
