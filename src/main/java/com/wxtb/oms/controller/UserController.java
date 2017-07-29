package com.wxtb.oms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wxtb.oms.dao.UserMapper;
import com.wxtb.oms.model.User;

@Controller
@RequestMapping(value = "/user")
public class UserController {


	@Autowired
	private UserMapper userMapper;

    /**
     * 用户登出
     * 
     * @param session
     * @return
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String logout(HttpSession session) {
    		User user = userMapper.selectByPrimaryKey(1);
    		if(user != null) {
    			System.out.println(user.getUserCode());
    		}

    		return "index";
    }

}
