package com.caoyihong.template.service.impl;

import com.caoyihong.template.dao.UserInfoMapper;
import com.caoyihong.template.entity.UserInfo;
import com.caoyihong.template.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by caoyihong on 16-12-13.
 */
@Service
public class UserService implements IUserService{

    @Resource
    UserInfoMapper userInfoMapper;

    public void insertUser(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    public UserInfo getUserById(Long userId) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
        return userInfo;
    }
}
