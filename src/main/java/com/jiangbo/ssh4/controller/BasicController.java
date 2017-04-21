/*
package com.jiangbo.ssh4.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.transaction.interceptor.RollbackRuleAttribute;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

*/
/**
 * Created by Jiangbo Cheng on 2017/4/9.
 *//*

public class BasicController {

    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    public Object exceptionHandle(HttpServletRequest request, Exception e) throws Exception{
        //if(logger.isDebugEnabled()) {
        e.printStackTrace();
        //}

//        ApiLogger.error("Controller¥¶¿Ì“Ï≥£",e);
*/
/*        JSONObject resp = new JSONObject();
        resp.put("apistatus",0);
        resp.put("result",HttpUtil.returnErrorApistatus(ErrorCode.Fee_Exception).toJSONString());*//*

        */
/*if(e instanceof CommonException){
            JSONObject error = new JSONObject();
            JSONObject result = new JSONObject();
            result.put("apistatus", 0);
            RequestContext.getRequestContext().getResult().setApistatus(1);
//            RequestContext.getRequestContext().getResult().setApistatus(0);
            error.put("error_code",11004);
            error.put("error_zh_CN",e.getMessage());
            result.put("result",error);
            return result;

        }*//*

        */
/*if(e instanceof MissingServletRequestParameterException){
            JSONObject error = new JSONObject();
            JSONObject result = new JSONObject();
            result.put("apistatus",0);
            RequestContext.getRequestContext().getResult().setApistatus(0);
            error.put("error_code",10002);
            error.put("error_zh_CN",e.getMessage());
            result.put("result",error);
            return result;
        }*//*

        return HttpUtil.returnErrorApistatus(ErrorCode.Fee_Exception);
    }


}
*/
