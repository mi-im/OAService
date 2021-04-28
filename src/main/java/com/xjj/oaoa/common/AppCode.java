package com.xjj.oaoa.common;

import lombok.Getter;

/**
 * @name: xjj
 * @date: 2021/4/27 17:05
 */

@Getter
public enum AppCode implements StatusCode {

    APP_ERROR(2000, "业务异常"), PRICE_ERROR(2001, "价格异常");


    private int code;
    private String msg;

    AppCode(int code, String msg){
        this.code = code;
        this.msg = msg;
    }


   /* @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getMsg() {
        return null;
    }*/
}
