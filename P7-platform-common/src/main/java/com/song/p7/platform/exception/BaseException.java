package com.song.p7.platform.exception;

import com.song.p7.platform.utils.APIErrorCode;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 自定义异常基类
 * @Date 2020/5/18 22:31
 * @Created by Jeremy
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BaseException extends Exception {
    public Integer code;
    public String errorMessage;

    public BaseException(APIErrorCode errorCode) {
        super();
        this.code = errorCode.getCode();
        this.errorMessage = errorCode.getDescription();
    }

    /***
     * 生成由errorCode,errorMessage组成的Map对象
     * @return
     */
    public Map toMap() {
        Map result = new HashMap();
        if(this.code != null) {
            result.put("errorCode", this.code);
        }
        if(this.errorMessage != null) {
            result.put("errorMessage", this.errorMessage);
        }
        return result;
    }
}
