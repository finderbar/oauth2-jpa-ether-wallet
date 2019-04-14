package com.mfinder.mlucard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mfinder.mlucard.domain.User;


/**
 * @author thein
 * @createdAt Mar 16, 2019
 */

@Repository("userRepo")
public interface AuthUserRepository extends JpaRepository<User, Long> {
	@Query("SELECT DISTINCT u FROM User u WHERE u.userName = :username")
	User findByUsername(@Param("username") String username);
}
