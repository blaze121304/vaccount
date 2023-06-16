package com.hecto.vaccount.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "VaccountModifyHistory")
@Data
public class VaccountModifyHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String mchtTrdNo;   //상점주문번호-pk
    private String mchtId;              //상점아이디
    private String ver;                 //전문버전
    private String method;              //결제수단
    private String bizType;             //업무 구분코드
    private String encCd;               //암호화 구분코드
    private String trdDt;               //요청일자
    private String trdTm;               //요청시간
    private String mobileYn;            //OS 구분 (Y:모바일웹/앱 N:PC또는 그외)                                (Optional)
    private String osType;              //A:Android, I:IOS, W:windows, M:Mac, E:기타, 공백:확인불가           (Optional)
    private String pktHash;             //hash데이터 SHA256 방식으로 생성한 해쉬값
    private String bankCd;              //은행코드 [PG가상계좌 은행코드] 참고
    private String vAcntNo;             //가상계좌번호 [AES암호화]
    private String expireDate;          //입금만료일시
    private String trdAmt;              //거래금액    [AES암호화]
    private String acntType;            //계좌구분


}
