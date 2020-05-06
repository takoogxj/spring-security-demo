package com.gxj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)//拦截注解了@PreAuthrize的请求
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /*@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //基于内存方式构建两个账户
        auth.inMemoryAuthentication()
                .withUser("guxiaojie")
                .password(passwordEncoder().encode("123456"))
                .roles("admin");
        auth.inMemoryAuthentication()
                .withUser("guest")
                .password(passwordEncoder().encode("123456"))
                .roles("normal");
    }*/
    //基于数据库方式的话将以上代码须注释，以免出现冲突

    @Bean //注入加密方式
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
