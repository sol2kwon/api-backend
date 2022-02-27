package com.solyi.api.member.service;

import com.solyi.api.member.domain.*;
import com.solyi.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: com.solyi.api.common.service
 * fileName        : MemberServiceImpl.java
 * author          : solyikwon
 * date            : 2022-02-11
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-11         solyikwon      최초 생성
 **/
@Service
@RequiredArgsConstructor

public class MemberServiceImpl implements MemberService {
    private final MemberRepository repository;

    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        String op = calc.getOpcode();
        switch (op) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            case "%":
                res = a % b;
                break;
        }
        String r = String.format("%d %s %d = %d", a, op, b, res);
        System.out.println(r);
        return r;
    }

        @Override
        public String bmi (BmiDTO bmi){
        String c = bmi.getName();
        double d = bmi.getWeight();
        double e = bmi.getHeight();
        String re = String.format("이름: %s\n몸무게: %f\n키: %f",c,d,e);
            System.out.println(re);
        return re;
        }

        @Override
        public String member (MemberDTO member) {
            return repository.member(member);
        }

    @Override
    public String grade(GradeDTO grade) {
        String f = grade.getName();
        int g = grade.getKor();
        int h = grade.getEng();
        int i = grade.getMath();
        String res = String.format("이름: %s\n 국어: %d\n 영어:%d\n 수학:%d",f,g,h,i);
        System.out.println(res);
        return res;
    }

    @Override
    public String login(LoginDTO login) {
        String na= login.getNa();
        String id = login.getId();
        String pw = login.getPw();
        String ress = String.format("이름: %s\n아이디: %s\n비밀번호: %s\n",na,id,pw);
        System.out.println(ress);
        return ress;
    }
}


