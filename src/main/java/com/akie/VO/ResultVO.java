package com.akie.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @auther Akie
 * @date 2019/7/28 13:57
 */
@Data
public class ResultVO<T> {

    /** 错误码 */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 具体内容 */
    private T data;

}
