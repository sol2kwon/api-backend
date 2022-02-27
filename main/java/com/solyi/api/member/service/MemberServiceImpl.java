package com.solyi.api.member.service;

import com.solyi.api.member.domain.*;
import com.solyi.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.IllegalFormatCodePointException;

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
    public String bmi(BmiDTO bmi) {
        double bmi1 = bmi.getWeight() / (bmi.getHeight() * bmi.getHeight()) * 10000;
        String s = "";
        if (bmi1 >= 35) {
            s = "고도비만";
        } else if (bmi1 >= 30) {
            s = "중(重)도 비만 (2단계 비만)";
        } else if (bmi1 >= 25) {
            s = "경도 비만 (1단계 비만)";
        } else if (bmi1 >= 23) {
            s = "과체중";
        } else if (bmi1 >= 18.5) {
            s = "정상";
        } else {
            s = "저체중";
        }
        String re = String.format(bmi.getName() + " " + s);
        System.out.println(re);
        return re;
    }


    @Override
    public String member(MemberDTO member) {
        return repository.member(member);
    }

    @Override
    public String grade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String res = (avg >= 60) ? "합격" : "불합격";
        String rr = String.format(
                " * 이름: %s\n" +
                        " * > 국어: %d점 \n" +
                        " * > 영어: %d점 \n" +
                        " * > 수학: %d점 \n" +
                        " * 총점: %d점 \n" +
                        " * 평균(정수): %d점 \n" +
                        " * 합격여부: %s \n", grade.getName(), grade.getKor(), grade.getEng(), grade.getMath(), total, avg, res);
        System.out.println(rr);
        return rr;
    }

    @Override
    public String login(LoginDTO login) {
        String id = login.getId();
        String pw = login.getPw();
        String res = "";


        if (id.equals("AAA") & pw.equals("AAA")) {
            res = String.format("아이디 비밀번호 일치 %s 님 로그인 성공", login.getNa());
        }else {
            res = String.format("아이디 비밀번호 불일치 %s 님 로그인 실패", login.getNa());
        }
   String ress = String.format("%s",res);
        System.out.println(ress);
    return ress;
}}

