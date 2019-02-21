package egovframework.dgym.let.admin.user.dao.impl;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import egovframework.dgym.cmm.base.BaseMapper;
import egovframework.dgym.let.admin.user.dao.UserDAO;
import egovframework.dgym.let.admin.user.vo.UserVO;

@Repository
public class UserDAOImpl extends BaseMapper implements UserDAO {

	@Override
	public UserVO getUser(HashMap<String, Object> map) throws Exception {
		return selectOne("DGYM.User.selectUser", map);
	}

	@Override
	public int insertUser(HashMap<String, Object> map) throws Exception {
		return insert("DGYM.User.insertUser", map);
	}
}
