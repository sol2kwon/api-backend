package com.solyi.api.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName: com.solyi.api.common.controller
 * fileName        : CommonController.java
 * author          : solyikwon
 * date            : 2022-02-11
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-11         solyikwon      최초 생성
 **/
@RestController
public class CommonController {
    @GetMapping("/")
public String now(){
        return new SimpleDateFormat("yyyy-MM-dd hh:dd:ss").format(new Date());
    }
}
