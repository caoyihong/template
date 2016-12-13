package com.caoyihong.template.service;


import com.caoyihong.template.entity.UserInfo;

/**
 * Created by caoyihong on 16-12-13.
 */
public interface IUserService {

    public void insertUser(UserInfo userInfo);

    public UserInfo getUserById(Long userId);
}
