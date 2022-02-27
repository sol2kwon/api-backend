package com.solyi.api.member.controller;

import com.solyi.api.member.domain.*;
import com.solyi.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * packageName: com.solyi.api.common.controller
 * fileName        : MemberController.java
 * author          : solyikwon
 * date            : 2022-02-11
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-11         solyikwon      최초 생성
 **/

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
    public class MemberController {
    private final MemberService service;

    @PostMapping("/calc")
    public String calc(@RequestBody CalcDTO calc){
        System.out.println("리액트에서 넘어온 숫자: "+calc.getNum1());
        System.out.println("리액트에서 넘어온 숫자: "+calc.getNum2());
        System.out.println("리액트에서 넘어온 기호: "+calc.getOpcode());
    return service.calc(calc);
    }
    @PostMapping("/bmi")
    public String bmi(@RequestBody BmiDTO bmi){
        return  service.bmi(bmi);
    }
    @PostMapping("/member")
    public String member(@RequestBody MemberDTO member){
        return  service.member(member);
    }

   @PostMapping ("/grade")
    public String grade(@RequestBody GradeDTO grade) {
        return service.grade(grade);
    }
 @PostMapping("/login")
    public String login(@RequestBody LoginDTO login){
        return service.login(login);
    }
/*
    @GetMapping("/login")
    public String getBmi(@RequestBody MemberDTO meber) {
        System.out.println("리액트에서 넘어온 이름:" + name);
        System.out.println("리액트에서 넘어온 키:" + height);
        System.out.println("리액트에서 넘어온 몸무게:" + weight);
        return "BMI 는 정상";
    }*/
}