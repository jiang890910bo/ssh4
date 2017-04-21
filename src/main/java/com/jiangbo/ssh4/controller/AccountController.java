package com.jiangbo.ssh4.controller;

import com.jiangbo.ssh4.po.Account;
import com.jiangbo.ssh4.service.AccountService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by Jiangbo Cheng on 2017/4/9.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    AccountService accountService;

    @RequestMapping("/getAllList")
    @ResponseBody
    public List<Account> getAllList(@RequestParam(name="username", defaultValue = "123", required = true)String username){
        return accountService.selectByExample(null);
    }


    @RequestMapping("/add")
    @ResponseBody
    public Integer add(){
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
        logger.fatal("fatal message");
        System.out.println("Hello World!");


        Account account = new Account();
        account.setName("测试添加账号");
        account.setUserName("测试添加账号");
        account.setEmail("测试添加账号@163.com");
        account.setPassWord("123457");
        account.setSex(1);
        account.setCreateTime(new Date());
        account.setUpdateTime(new Date());
        account.setRemark("");
        account.setStatus(2);
        account.setStaffId(1);
        account.setRootId(10004);
        account.setDepId(1);
        return accountService.save(account);
    }
}
