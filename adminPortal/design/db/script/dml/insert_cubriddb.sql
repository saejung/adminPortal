INSERT INTO TB_USER(USER_ID, PASSWORD, AUTHORITY, USER_NM, EMAIL, TEL_NO, EMP_NO, GENDER) 
VALUES ('user', '1234', 'ROLE_USER', '일반사용자', 'user@test.com', '010-1234-5678', 'D001', 0)
	,	('admin', '1111', 'ROLE_ADMIN', '관리자', 'admin@test.com', '010-1111-1111', 'D002', 1);