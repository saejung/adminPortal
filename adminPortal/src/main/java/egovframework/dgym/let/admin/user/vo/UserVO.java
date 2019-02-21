package egovframework.dgym.let.admin.user.vo;

public class UserVO {
	
	private String userId;
	private String userPwd;
	private String authority;
	private String userNm;
	private String email;
	private String telNo;
	private String empNo;
	private char gender;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String _userId) {
		userId = _userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String _userPwd) {
		userPwd = _userPwd;
	}

	public String getAuthority() {
		return authority;
	}
	
	public void setAuthority(String _authority) {
		authority = _authority;
	}
	
	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String _userNm) {
		userNm = _userNm;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String _email) {
		email = _email;
	}
	
	public String getTelNo() {
		return telNo;
	}
	
	public void setTelNo(String _telNo) {
		telNo = _telNo;
	}
	
	public String getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(String _empNo) {
		empNo = _empNo;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char _gender) {
		gender = _gender;
	}
	
	
}
