package com.jiangbo.ssh4.mapper;

import com.jiangbo.ssh4.po.OperateLog;
import com.jiangbo.ssh4.po.OperateLogExample;
import com.jiangbo.ssh4.po.OperateLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperateLogMapper {
    long countByExample(OperateLogExample example);

    int deleteByExample(OperateLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OperateLogWithBLOBs record);

    int insertSelective(OperateLogWithBLOBs record);

    List<OperateLogWithBLOBs> selectByExampleWithBLOBs(OperateLogExample example);

    List<OperateLog> selectByExample(OperateLogExample example);

    OperateLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OperateLogWithBLOBs record, @Param("example") OperateLogExample example);

    int updateByExampleWithBLOBs(@Param("record") OperateLogWithBLOBs record, @Param("example") OperateLogExample example);

    int updateByExample(@Param("record") OperateLog record, @Param("example") OperateLogExample example);

    int updateByPrimaryKeySelective(OperateLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OperateLogWithBLOBs record);

    int updateByPrimaryKey(OperateLog record);
}