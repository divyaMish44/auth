package com.intuit.assignment.authentication.service;

import com.intuit.assignment.authentication.model.User;
import com.intuit.assignment.authentication.model.UserDetail;
import com.intuit.assignment.authentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    public void addUser(User user){

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByusername(username);
        if(user == null){
            throw new UsernameNotFoundException("User Not Found");
        }
        return new UserDetail(user);
    }
}
