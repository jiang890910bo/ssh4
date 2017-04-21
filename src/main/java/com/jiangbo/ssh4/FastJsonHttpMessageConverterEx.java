package com.jiangbo.ssh4;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created by Jiangbo Cheng on 2017/4/9.
 */
public class FastJsonHttpMessageConverterEx extends FastJsonHttpMessageConverter {

    @Override
    protected void writeInternal(Object obj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

        if (obj instanceof IllegalArgumentException ) {
            StringBuffer stringBuilder = new StringBuffer();
            IllegalArgumentException  exception = (IllegalArgumentException ) obj;
            String errorMessage = exception.getMessage();
            if (!StringUtils.isEmpty(errorMessage)) {
                if (errorMessage.contains("Exception:")) {
                    errorMessage = errorMessage.substring(errorMessage.lastIndexOf("Exception:"));
                }
                stringBuilder.append(errorMessage);
            } else {
                stringBuilder.append("缺少参数");
            }
            writeErrorMsg(stringBuilder.toString(), outputMessage);
        } if (obj instanceof Exception) {
            writeErrorMsg("系统内部错误！", outputMessage);
        } else {
            super.writeInternal(obj, outputMessage);
        }
    }

    private void writeErrorMsg(Serializable json, HttpOutputMessage outputMessage) throws IOException {
        JSONObject result = new JSONObject();
        result.put("apistatus", 0);
        result.put("errorMsg", json);
        super.writeInternal(result, outputMessage);
    }
}
