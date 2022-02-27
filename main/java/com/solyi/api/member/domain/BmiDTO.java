package com.solyi.api.member.domain;

import com.solyi.api.member.service.MemberService;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.solyi.api.member.domain
 * fileName        : BmiDTO.java
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
public class BmiDTO {
    private double height;
    private double weight;
    private String name;


}
