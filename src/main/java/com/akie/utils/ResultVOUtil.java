package com.akie.utils;

import com.akie.VO.ResultVO;

/**
 * @auther Akie
 * @date 2019/7/28 21:30
 */
public class ResultVOUtil {

    public static ResultVO success (Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
