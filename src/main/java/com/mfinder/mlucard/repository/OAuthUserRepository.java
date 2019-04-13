package com.mfinder.mlucard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfinder.mlucard.domain.OAuthUser;

/**
 * @author thein
 * @createdAt Mar 16, 2019
 */

@Repository("userRepo")
public interface OAuthUserRepository extends JpaRepository<OAuthUser, Long> {}
