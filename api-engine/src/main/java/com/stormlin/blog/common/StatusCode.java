package com.stormlin.blog.common;

/**
 * 包含部分请求响应状态码的静态类
 */
public class StatusCode {

    /* 200 系列状态码 */
    public static final String OK = "200";
    public static final String Created = "201";

    /* 300 系列状态码 */
    public static final String MovedPermanently = "301";

    /* 400 系列状态码 */
    public static final String BadRequest = "400";
    public static final String Unauthorized = "401";
    public static final String Forbidden = "403";
    public static final String NotFound = "404";
    public static final String RequestedRangeNotSatisfiable = "416";

    /* 500 系列状态码 */
    public static final String InternalServerError = "500";
    public static final String NotImplemnted = "501";

}
