package com.xjj.oaoa.Exception;


import com.xjj.oaoa.common.StatusCode;

/**
 * @name: xjj
 * @date: 2021/3/5 13:35
 */
public class WfException extends RuntimeException {

    private int code;

    private String msg;

    public WfException(StatusCode statusCode, String message) {

        super(message);

        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();



    }
}
