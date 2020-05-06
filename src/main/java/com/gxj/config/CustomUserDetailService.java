package com.gxj.config;

import com.gxj.permission.bean.UserInfo;
import com.gxj.permission.service.UserInfoService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class CustomUserDetailService implements UserDetailsService {

    @Resource
    UserInfoService userInfoService;
    @Resource
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println("CustomUserDetailService.loadUserByUsername()");

        UserInfo userInfo = userInfoService.findByUsername(s);
        if(userInfo==null){
            throw  new UsernameNotFoundException("NOT FOUND");
        }

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_"+userInfo.getRole().name()));
        User user = new User(userInfo.getUsername(),passwordEncoder.encode(userInfo.getPassword()),authorities);
        return user;
    }
}
