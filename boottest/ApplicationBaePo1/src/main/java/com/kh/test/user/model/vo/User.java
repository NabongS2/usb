package com.kh.test.user.model.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/* -- TB_USER 테이블 생성 및 SEQ_UNO 시퀀스 생성

CREATE TABLE TB_USER(

USER_NO NUMBER PRIMARY KEY,

USER_ID VARCHAR2(50) UNIQUE NOT NULL,

USER_NAME VARCHAR2(50) NOT NULL,

USER_AGE NUMBER NOT NULL

); */
@Getter
@Setter
@ToString
public class User {
	private int userNo;
	private String userId;
	private String userName;
	private int userAge;
}
