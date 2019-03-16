package com.mfinder.mlucard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfinder.mlucard.domain.Wallet;

/**
 * @author thein
 * @createdAt Mar 16, 2019
 */

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long>{

}
