package com.akie.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @auther Akie
 * @date 2019/8/4 20:33
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class weixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code){
        log.info("进入auth方法。。。。");
        log.info("code={}",code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx8d265226aa667d75&secret=24cea323bdb7ad4bc31d97eadc4947a2&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url,String.class);
        log.info("response={}",response);
    }
}
