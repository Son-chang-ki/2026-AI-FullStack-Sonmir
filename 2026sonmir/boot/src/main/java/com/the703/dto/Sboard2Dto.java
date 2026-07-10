package com.the703.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@Getter @Setter  @ToString
@NoArgsConstructor
@AllArgsConstructor
public class Sboard2Dto {
	private int id;
	private int appUserId;
	private String btitle;
	private String bcontent;
	private String bpass;
	private String bfile;
	private int bhit;
	private String bip;
	private String createdAt;

}


/*
SQL> desc  sboard2;
 이름                                      널?      유형
 ----------------------------------------- -------- ----------------------------
 ID                                        NOT NULL NUMBER
 APP_USER_ID                               NOT NULL NUMBER
 BTITLE                                    NOT NULL VARCHAR2(1000)
 BCONTENT                                  NOT NULL CLOB
 BPASS                                     NOT NULL VARCHAR2(255)
 BFILE                                              VARCHAR2(255)
 BHIT                                               NUMBER
 BIP                                       NOT NULL VARCHAR2(255)
 CREATED_AT                                         DATE
 
=========================================================================================
 CREATE TABLE sboard2 (
ID                  NUMBER NOT NULL,               -- 게시글 고유 ID (PK)
APP_USER_ID         NUMBER NOT NULL,               -- 작성자 유저 ID
BTITLE              VARCHAR2(1000) NOT NULL,       -- 게시글 제목 (견적 요청명)
BCONTENT            CLOB NOT NULL,                 -- 게시글 내용 (OCR 추출 비정형 텍스트 원본)
BPASS               VARCHAR2(255) NOT NULL,        -- 게시글 비밀번호
BFILE               VARCHAR2(255),                 -- 업로드한 명세서/도면 파일명
BHIT                NUMBER DEFAULT 0,              -- 조회수
BIP                 VARCHAR2(255) NOT NULL,        -- 작성자 IP 주소
CREATED_AT          DATE DEFAULT SYSDATE,          -- 작성일시

-- [AI 자동견적 확장 컬럼]
AI_PREDICTED_PRICE  NUMBER,                        -- OpenAI가 산출한 단일 가견적 금액
ESTIMATE_STATUS     VARCHAR2(20) DEFAULT 'PENDING',-- 견적 진행 상태 (PENDING, MATCHED, FAILED)
WEBHOOK_TOKEN       VARCHAR2(100),                 -- 협력사 외부 응답 매칭용 고유 UUID 토큰

CONSTRAINT pk_sboard2 PRIMARY KEY (ID)
);

SQL> desc  sboard2;
이름                 널?       유형             
------------------ -------- -------------- 
ID                 NOT NULL NUMBER         -- 게시글 고유 ID (PK)
APP_USER_ID        NOT NULL NUMBER         -- 작성자 유저 ID
BTITLE             NOT NULL VARCHAR2(1000) -- 게시글 제목 (견적 요청명)
BCONTENT           NOT NULL CLOB           -- 게시글 내용 (OCR 추출 비정형 텍스트 원본)
BPASS              NOT NULL VARCHAR2(255)  -- 게시글 비밀번호
BFILE                       VARCHAR2(255)  -- 업로드한 명세서/도면 파일명
BHIT                        NUMBER         -- 조회수
BIP                NOT NULL VARCHAR2(255)  -- 작성자 IP 주소
CREATED_AT                  DATE           -- 작성일시
AI_PREDICTED_PRICE          NUMBER         -- OpenAI가 산출한 단일 가견적 금액
ESTIMATE_STATUS             VARCHAR2(20)   -- 견적 진행 상태 (PENDING, MATCHED, FAILED)
WEBHOOK_TOKEN               VARCHAR2(100)  -- 협력사 외부 응답 매칭용 고유 UUID 토큰

*/