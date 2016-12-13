package com.caoyihong.template.controller;

import com.caoyihong.template.entity.UserInfo;
import com.caoyihong.template.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by caoyihong on 16-12-13.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/showUser")
    public String showUserList(HttpServletRequest request, Model model){
        Long userId = Long.parseLong(request.getParameter("userId"));
        UserInfo userInfo = userService.getUserById(userId);
        model.addAttribute("user", userInfo);
        return "showUser";
    }
}
