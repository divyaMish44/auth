package com.intuit.assignment.authentication.repository;

import com.intuit.assignment.authentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByusername(String username);
}
