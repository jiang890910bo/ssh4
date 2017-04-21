package com.jiangbo.ssh4.service;

import com.jiangbo.ssh4.po.OperateLog;
import com.jiangbo.ssh4.po.OperateLogWithBLOBs;

/**
 * Created by Jiangbo Cheng on 2017/4/18.
 */
public interface OperateLogService {

    int save(OperateLogWithBLOBs operateLog);
}
