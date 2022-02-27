package com.solyi.api.member.service;

import com.solyi.api.member.domain.*;

/**
 * packageName: com.solyi.api.common.service
 * fileName        : MemberService.java
 * author          : solyikwon
 * date            : 2022-02-11
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-11         solyikwon      최초 생성
 **/
public interface MemberService {

    String calc(CalcDTO calc);

    String bmi(BmiDTO bmi);

    String member(MemberDTO member);

    String grade(GradeDTO grade);

    String login(LoginDTO login);

}
