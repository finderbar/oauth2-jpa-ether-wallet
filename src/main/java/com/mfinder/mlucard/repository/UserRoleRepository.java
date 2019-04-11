package com.mfinder.mlucard.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfinder.mlucard.domain.OAuthRole;

/**
 * @author thein
 * @createdAt Apr 7, 2019
 */
@Repository("userRoleRepo")
public interface UserRoleRepository extends JpaRepository<OAuthRole, Long> {
//	@Query("select r.name " + "from User u,Role r,UserRole ur "
//			+ "where  u.id=?1 " + "and ur.userId = u.id "
//			+ "and ur.roleId = r.id")
	//List<String> findRoleByUserId(Long id);
}
