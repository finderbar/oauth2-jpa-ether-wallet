package com.mfinder.mlucard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mfinder.mlucard.domain.OAuthClient;

/**
 * @author thein
 * @createdAt Apr 13, 2019
 */
public interface OAuthClientRepository extends JpaRepository<OAuthClient, Long>{}
