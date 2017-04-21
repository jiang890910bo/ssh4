package com.jiangbo.ssh4.service;

import com.jiangbo.ssh4.po.Account;
import com.jiangbo.ssh4.po.AccountExample;

import java.util.List;

/**
 * Created by Jiangbo Cheng on 2017/4/9.
 */
public interface AccountService {

    List<Account> selectByExample(AccountExample example);

    int save(Account account);

    int update(Account account);
}
