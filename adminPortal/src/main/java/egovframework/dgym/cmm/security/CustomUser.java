package egovframework.dgym.cmm.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CustomUser extends User{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6470727771522695712L;
	private String name;
	
	
	public CustomUser(String username, String password, Collection<GrantedAuthority> authorities, String _name) {
		
		super(username, password, true, true, true, true, authorities);
		
		setName(_name);
	}
	
	public CustomUser(String username, String password, boolean enabled, 
						boolean accountNonExpired, boolean credentialsNonExpired, 
						boolean accountNonLocked, Collection<GrantedAuthority> authorities, 
						String _name) {
		
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		
		setName(_name);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String _name) {
		name = _name;
	}
}
