package com.jiangbo.ssh4.service.impl;

import com.jiangbo.ssh4.mapper.OperateLogMapper;
import com.jiangbo.ssh4.po.OperateLog;
import com.jiangbo.ssh4.po.OperateLogWithBLOBs;
import com.jiangbo.ssh4.service.OperateLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Jiangbo Cheng on 2017/4/18.
 */
@Transactional
@Service
public class OperateLogServiceImpl implements OperateLogService {

    @Resource
    OperateLogMapper operateLogMapper;

    public int save(OperateLogWithBLOBs operateLog) {
        return operateLogMapper.insert(operateLog);
    }

}
