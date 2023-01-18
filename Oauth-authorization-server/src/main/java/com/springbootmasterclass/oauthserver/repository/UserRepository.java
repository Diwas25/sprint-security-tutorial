package com.springbootmasterclass.oauthserver.repository;


import com.springbootmasterclass.oauthserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
}
