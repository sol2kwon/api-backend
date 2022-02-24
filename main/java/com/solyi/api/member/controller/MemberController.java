package com.solyi.api.member.controller;

import com.solyi.api.member.domain.MemberDTO;
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
public class MemberController {
    private final MemberService service;

    @GetMapping("/member/bmi/{name}/{height}/{weight}")
    public String getBmi(@PathVariable String name, @PathVariable double height,@PathVariable double weight) {
        System.out.println("리액트에서 넘어온 이름:"+name);
        System.out.println("리액트에서 넘어온 키:"+height);
        System.out.println("리액트에서 넘어온 몸무게:"+weight);
        return "BMI 는 정상";}
}
