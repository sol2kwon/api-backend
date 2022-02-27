package com.solyi.api.member.domain;

import com.solyi.api.member.service.MemberService;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.solyi.api.member.domain
 * fileName        : CalcDTO.java
 * author          : solyikwon
 * date            : 2022-02-25
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-25         solyikwon      최초 생성
 **/
@Data
@Component
public class CalcDTO {
    private int num1;
    private int num2;
    private String opcode;

}
