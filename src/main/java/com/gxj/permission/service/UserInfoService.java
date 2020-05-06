package com.gxj.permission.service;

import com.gxj.permission.bean.UserInfo;

public interface UserInfoService {

    public UserInfo findByUsername(String username);

}
