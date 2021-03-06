package com.ajay.userservice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ajay.dao.UserDao;
import com.ajay.model.UserRole;


public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(final String username)
               throws UsernameNotFoundException {

		com.ajay.model.Users user = userDao.findByUserName(username);
		List<GrantedAuthority> authorities = buildUserAuthority(user.getUserRole());
		return buildUserForAuthentication(user, authorities);


	}
	// Converts com.mkyong.users.model.User user to
		// org.springframework.security.core.userdetails.User
		private UserDetails buildUserForAuthentication(com.ajay.model.Users user,
			List<GrantedAuthority> authorities) {
			return new User(user.getEnabled(), user.getPassword(), Boolean.parseBoolean(user.getEnabled()), true, true, true, authorities);		
			}

		private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {

			Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

			// Build user's authorities
			for (UserRole userRole : userRoles) {
				setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
			}

			List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

			return Result;
		}

		public UserDao getUserDao() {
			return userDao;
		}

		public void setUserDao(UserDao userDao) {
			this.userDao = userDao;
		}
}
