package com.mfinder.mlucard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfinder.mlucard.domain.OAuthRole;

/**
 * @author thein
 * @createdAt Apr 7, 2019
 */
@Repository("userRoleRepo")
public interface OAuthUserRoleRepository extends JpaRepository<OAuthRole, Long> {}
