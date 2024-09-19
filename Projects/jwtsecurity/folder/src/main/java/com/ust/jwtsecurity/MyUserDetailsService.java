package com.ust.jwtsecurity;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public User loadUserByUsername(String userName) throws UsernameNotFoundException {



        System.out.println(userName);

        return new org.springframework.security.core.userdetails.User("foo","foo",new ArrayList<>());

    }



}