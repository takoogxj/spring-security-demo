package com.gxj.permission.bean;

import javax.persistence.*;

/***
 * 用户实体类，存储用户名及密码
 */
@Entity//持久化配置
public class UserInfo {

    @Id
    @GeneratedValue//主键自增
    private long uid;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
