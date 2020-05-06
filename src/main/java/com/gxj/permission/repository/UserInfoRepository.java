package com.gxj.permission.repository;

import com.gxj.permission.bean.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {

    public UserInfo findByUsername(String username);
}
