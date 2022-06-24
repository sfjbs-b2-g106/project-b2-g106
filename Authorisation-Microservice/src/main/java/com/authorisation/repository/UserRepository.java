package com.authorisation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authorisation.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
