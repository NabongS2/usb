-- 한 줄 주석

/* 
 * 범위주석
 */ 

ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;
-- ctrl + enter : 선택한 SQL 실행

-- 사용자 계정 생성
CREATE USER kh_lnh IDENTIFIED BY "oracle_lnh123A";
-- "" 안에 있는 것은 대소문자 구분 안하면 둘 다 인식

-- 사용자 계정에 권한 부여
GRANT RESOURCE, CONNECT TO kh_lnh;

-- 객체가 생성 될 수 있는 공간 할당량 지정
ALTER USER kh_lnh DEFAULT TABLESPACE SYSTEM QUOTA UNLIMITED ON SYSTEM;


