package com.example.springSecurity.learnSec.service;

import com.example.springSecurity.learnSec.Repo.userRepo;
import com.example.springSecurity.learnSec.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.cert.Extension;
import java.util.Optional;

@Service
public class userdetailsService implements UserDetailsService {


    @Autowired
    private userRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        user user = userRepo.findByname(username);
        if (user == null)
            new UsernameNotFoundException("User not found");

            return new customuserDetails(user);

    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        //return new BCryptPasswordEncoder();
        return new BCryptPasswordEncoder(); // with new spring security 5
    }

}
