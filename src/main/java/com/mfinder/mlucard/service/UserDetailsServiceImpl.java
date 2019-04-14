package com.mfinder.mlucard.service;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mfinder.mlucard.domain.User;
import com.mfinder.mlucard.domain.UserAuthority;
import com.mfinder.mlucard.dto.CustomGrantedAuthority;
import com.mfinder.mlucard.dto.CustomUserDetails;
import com.mfinder.mlucard.repository.AuthUserRepository;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private AuthUserRepository authUserRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User authUser = authUserRepo.findByUsername(username);
		if (authUser != null) {
			CustomUserDetails customUserDetails = new CustomUserDetails();
			customUserDetails.setUserName(authUser.getUserName());
			customUserDetails.setPassword(authUser.getPassword());
			Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
			for (UserAuthority authority : authUser.getUserAuthorities()) {
				authorities.add(new CustomGrantedAuthority(authority.getAuthority().getName()));
			}
			customUserDetails.setGrantedAuthorities(authorities);
			return customUserDetails;
		}
		
		throw new UsernameNotFoundException(username);
	}

}
