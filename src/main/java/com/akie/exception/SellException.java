package com.akie.exception;

import com.akie.enums.ResultEnum;
import lombok.Getter;

/**
 * @auther Akie
 * @date 2019/7/31 21:28
 */
@Getter
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
