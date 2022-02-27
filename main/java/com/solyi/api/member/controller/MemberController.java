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


}