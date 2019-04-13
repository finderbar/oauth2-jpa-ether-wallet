package com.mfinder.mlucard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mfinder.mlucard.repository.OAuthUserRepository;
import com.mfinder.mlucard.repository.OAuthUserRoleRepository;

@Service("cmtuserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
	private final OAuthUserRepository userRepo;
	private final OAuthUserRoleRepository userRoleRepo;

	@Autowired(required = true)
	public CustomUserDetailsService(OAuthUserRepository userRepo, OAuthUserRoleRepository userRoleRepo) {
		this.userRepo = userRepo;
		this.userRoleRepo = userRoleRepo;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
	}
}
