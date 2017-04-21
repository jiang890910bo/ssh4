package com.jiangbo.ssh4.service.impl;

import com.jiangbo.ssh4.mapper.AccountMapper;
import com.jiangbo.ssh4.mapper.OperateLogMapper;
import com.jiangbo.ssh4.po.Account;
import com.jiangbo.ssh4.po.AccountExample;
import com.jiangbo.ssh4.po.OperateLog;
import com.jiangbo.ssh4.po.OperateLogWithBLOBs;
import com.jiangbo.ssh4.service.AccountService;
import com.jiangbo.ssh4.service.OperateLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Jiangbo Cheng on 2017/4/9.
 */

//@Transactional
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    AccountMapper accountMapper;

    @Resource
    OperateLogService operateLogService;


    public List<Account> selectByExample(AccountExample example) {
        return accountMapper.selectByExample(new AccountExample());
    }

    public int update(Account account) {
        account.setUpdateTime(new Date());
        return accountMapper.updateByPrimaryKey(account);
    }

    public int save(Account account) {
        int result = accountMapper.insert(account);

        /*OperateLogWithBLOBs operateLog = new OperateLogWithBLOBs();
        operateLog.setUserName("test");
        operateLog.setLogType(-1);
        operateLog.setOperateTime(new Date());
        operateLog.setContent("测试添加transaction");
        operateLogService.save(operateLog);*/

        throw new RuntimeException("test");
    }
}
