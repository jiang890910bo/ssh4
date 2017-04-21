package com.jiangbo.ssh4.po;

public class OperateLogWithBLOBs extends OperateLog {
    private String content;

    private String reason;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}