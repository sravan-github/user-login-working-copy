package com.user.userlogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.userlogin.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
