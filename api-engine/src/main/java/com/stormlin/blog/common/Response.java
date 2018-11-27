package com.stormlin.blog.common;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Response {

    // 返回的状态码
//    private String code;
    // 返回的消息本身
    private String body;

//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString;
        try {
            jsonString = mapper.writeValueAsString(this);
        } catch (Exception e) {
            jsonString = null;
        }
        return jsonString;
    }

}
