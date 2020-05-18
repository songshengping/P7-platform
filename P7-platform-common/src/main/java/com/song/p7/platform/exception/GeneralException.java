package com.song.p7.platform.exception;

import com.song.p7.platform.utils.APIErrorCode;
import lombok.NoArgsConstructor;

/**
 * @Description TODO
 * @Date 2020/5/18 22:35
 * @Created by Jeremy
 */
@NoArgsConstructor
public class GeneralException extends BaseException{
    public GeneralException(APIErrorCode errorCode) {
        super(errorCode);
    }

    public GeneralException(Integer code, String errorMessage) {
        super(code, errorMessage);
    }
}
