package com.springmasterclass.springsecurityclient.repository;

import com.springmasterclass.springsecurityclient.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepository extends
        JpaRepository<VerificationToken,Long> {

    VerificationToken findByToken(String token);
}
