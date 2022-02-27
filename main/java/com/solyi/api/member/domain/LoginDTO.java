package com.solyi.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.solyi.api.member.domain
 * fileName        : LoginDTO.java
 * author          : solyikwon
 * date            : 2022-02-27
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-27         solyikwon      최초 생성
 **/
@Data
@Component
public class LoginDTO {
    private String id;
    private String pw;
    private String na;

}
