package com.solyi.api.member.service;

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
    String Membershiplist();
    String MembershipIf();
    String Shipmentlist();
    String Sendemaill();
    String Accumulated();
    String calc();
    String bmi();
    String grade();

}
