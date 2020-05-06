package com.gxj.permission.init;

import com.gxj.permission.bean.Role;
import com.gxj.permission.bean.UserInfo;
import com.gxj.permission.repository.UserInfoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;


@Service
public class DataInit {

    @Resource
    UserInfoRepository userInfoRepository;
    @PostConstruct//准备数据
    public void dataInit(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("taobao");
        userInfo.setPassword("123456");
        userInfo.setRole(Role.admin);
        userInfoRepository.save(userInfo);

        UserInfo userInfo2 = new UserInfo();
        userInfo2.setUsername("hahaha");
        userInfo2.setPassword("12345");
        userInfo2.setRole(Role.normal);
        userInfoRepository.save(userInfo2);
    }


}
