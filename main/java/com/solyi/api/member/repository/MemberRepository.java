package com.solyi.api.member.repository;

import com.solyi.api.member.domain.*;

/**
 * packageName: com.solyi.api.common.repository
 * fileName        : MemberRepository.java
 * author          : solyikwon
 * date            : 2022-02-11
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-11         solyikwon      최초 생성
 **/
public interface MemberRepository {

    String calc(CalcDTO calc);

    String bmi(BmiDTO bmi);

    String grade(GradeDTO grade);

    String login(LoginDTO login);

    String member(MemberDTO member);
}
