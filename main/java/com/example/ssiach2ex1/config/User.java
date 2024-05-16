package com.example.ssiach2ex1.config;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
@Entity
@Table
public class User implements UserDetails {
    @Id
    private final String username;
    private final String password;
    private final String authority;
    private String gender;
    public User(String username, String password,String authority){
        this.username=username;
        this.password=password;
        this.authority=authority;
    }
    @Override
    public String getUsername(){
        return username;
    }
    @Override
    public String getPassword(){
        return password;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return List.of(()->authority);
    }
    @Override
    public boolean isAccountNonExpired(){
        return true;
    }
    @Override
    public boolean isAccountNonLocked(){
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired(){
        return true;
    }
    @Override
    public boolean isEnabled(){
        return true;
    }
    public void setGender(String gender){
      this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
}
