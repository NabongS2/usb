/* DQL (Data Query Language) 데이터 검색 SELECT */
/* DML (Data Manipulation Language) 데이터 조작 INSERT UPDATE DELETE */
/* DDL (Data Definition Language) 데이터 정의 언어 CREATE ALTER DROP */
/* DCL (Data Control Language) 데이터 제어 GRANT REVOKE */
/* TCL (Transaction Control Language) 트랜젝션 제어 COMMIT ROLLBACK */


/* SELECT */
/* DQL (Data Query Language) 데이터 검색 SELECT */
/* DML (Data Manipulation Language) 데이터 조작 INSERT UPDATE DELETE */
SELECT 컬럼명
FROM 테이블명
WHERE 조건식;

-- 오늘 날짜 조회 SYSDATE
SELECT SYSDATE FROM DUAL;

-- WHERE AND, OR, NOT , = 같다, != <> 같지 않다. 

-- BETWEEN 컬럼 범위 지정
SELECT EMP_NAME , DEPT_CODE , SALARY 
FROM EMPLOYEE
WHERE SALARY BETWEEN 2000000 AND 30000000;

-- IN (값이 포함되면 TRUE)


/*  */


