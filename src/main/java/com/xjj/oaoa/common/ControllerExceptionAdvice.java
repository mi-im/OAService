package com.xjj.oaoa.common;


import com.xjj.oaoa.Exception.APIException;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @name: xjj
 * @date: 2021/4/27 16:13
 *
 * 捕获controller层的异常并返回包装体
 *
 */


@RestControllerAdvice
public class ControllerExceptionAdvice {

    


    /**
     *  用于捕获参数化校验中的异常
     * @param e
     * @return
     */
    @ExceptionHandler({BindException.class})
    public ResultVo validExceptionHandler(BindException e){

        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);

        return new ResultVo(ResultCode.VALIDATE_ERROR, objectError.getDefaultMessage());

    }



    @ExceptionHandler({APIException.class})
    public ResultVo APIExceptionHandler(APIException e){
        //

        return new ResultVo(e.getCode(), e.getMsg(), e.getMessage());
    }



}
