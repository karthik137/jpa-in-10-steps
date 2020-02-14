package com.in28minutes.jpa.jpain10steps.service;

import com.in28minutes.jpa.jpain10steps.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Takes Entity class and its primary key
public interface UserRepository extends JpaRepository<User, Long> {




}
