package com.gxj.permission.service.impl;

import com.gxj.permission.bean.UserInfo;
import com.gxj.permission.repository.UserInfoRepository;
import com.gxj.permission.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUsername(String username) {
        return userInfoRepository.findByUsername(username);
    }
}
