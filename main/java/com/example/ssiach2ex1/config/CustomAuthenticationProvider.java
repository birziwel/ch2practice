package com.example.ssiach2ex1.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.naming.AuthenticationException;

import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider {
   /* @Autowired
    private UserDetailsService userDetailsService;
    @Override
    public Authentication authenticate(Authentication authentication)
         throws AuthenticationException
      {
        String username=authentication.getName();
        String password=String.valueOf(authentication.getCredentials());
        var u=userDetailsService.loadUserByUsername("aman");
        String n=u.getUsername();
        String p=u.getPassword();
        if(n.equals(username)&&
            p.equals(password)){
                return new UsernamePasswordAuthenticationToken(username, password,Arrays.asList());
            }
        else{
            throw new AuthenticationCredentialsNotFoundException(
                "Error in Authontication");
        }
        // authentication logic here
    }

    @Override
    public boolean supports(Class<?> authenticationType) {
        return UsernamePasswordAuthenticationToken.class
            .isAssignableFrom(authenticationType);
    }*/

}
