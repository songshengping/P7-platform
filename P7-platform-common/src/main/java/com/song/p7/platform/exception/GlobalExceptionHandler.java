package com.song.p7.platform.exception;

import com.song.p7.platform.utils.APIErrorCode;
import com.song.p7.platform.utils.APIResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description 全局捕获自定义异常,并统一返回格式
 * @Date 2020/5/18 23:50
 * @Created by Jeremy
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 通用的异常处理
     * */
    @ExceptionHandler(GeneralException.class)
    public APIResponse<String> handleGeneralException(GeneralException ex) {
        return exceptionMessage(ex, APIErrorCode.UNKNOWN_ERROR);
    }

    /**
     * 统一异常信息处理方法
     * */
    private @ResponseBody APIResponse exceptionMessage(BaseException ex, APIErrorCode defaultErrorCode) {
        if(ex.code == null) {
            return new APIResponse<>(defaultErrorCode, ex.toMap());
        }else {
            if(APIErrorCode.convertEnumByCode(ex.code) == null) {
                return new APIResponse<>(defaultErrorCode, ex.toMap());
            }
            return new APIResponse<>(APIErrorCode.convertEnumByCode(ex.code), ex.errorMessage);
        }
    }
}
