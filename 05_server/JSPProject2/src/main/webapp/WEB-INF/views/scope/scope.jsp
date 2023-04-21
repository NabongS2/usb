<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sevrlet/JSP 내장 객체와 범위</title>
</head>
<body>
    <h1>Sevrlet/JSP 내장 객체와 범위</h1>

    <pre>
        Sevrlet/JSP에는 4종류에 범위를 갖는 내장 객체가 존재
        -> 각 종류마다 영향을 끼치는 범위가 다름

        1. page (pageContext) : 현재 페이지 (한 페이지)
            -> 현재 Sevrlet / JSP에서만 사용 가능

        2. request : 요청 받은 페이지(Sevrlet/JSP)와
                    이를 위임 받은 페이지(Sevrlet/JSP)에서 사용 가능
                    (최소 2페이지 이상)

        3. session : 현재 사이트에 접속한 브라우저 당 1개씩 생성
                    브라우저가 종료되거나 session이 만료 될 때 까지 유효

        4. application : 하나의 웹 애플리케이션 마다 1개씩 생성되는 객체
                        서버 켜질 떄 생성되어 종료될 때 없어짐

        *********************************
        ***** 내장 객체의 우선 순위 *****
        *********************************

        page > request > session > application
        
        EL로 각 scope에 있는 값을 얻어올 수 있다!

        방법 1) \${범위이름Scope.속성명}
                    pageScope
                    requestScope
                    sessionScope
                    applicationScope

        방법 2) \${속성명}
            -> 각 범위에 세팅된 속성 중 속성명이 일치하는 경우
            우선순위가 높은 scope의 속성 값이 얻어와짐
    </pre>

    <ul>
        <li>
            page scope <br>
            <%
                // pageContext : page scope 객체
                pageContext.setAttribute("pageValue",5);

                pageContext.setAttribute("str","page 범위에 세팅된 문자열");
            %>

            pageValue : ${pageValue} <%-- 5 --%> 
            <br>
            pageValue : ${pageScope.pageValue} <%-- 5 --%> 
        </li>
        <br>
        <li>
            request scope <br>
            message : ${requestScope.message} <%-- request scope에 저장된 메시지 입니다. --%>
        </li>

        <br>
        <li>
            session scope <br>
            message : ${sessionScope.sessionValue} <%-- 999 --%>
        </li>

        <br>
        <li>
            application scope <br>
            appValue : ${applicationScope.appValue} <%-- 10000 --%>
        </li>
    </ul>

    <hr>

    <h3>우선 순위 확인</h3>

    <h4>각각의 범위에 세팅된 str</h4>
    ${pageScope.str} <br>
    ${requestScope.str} <br>
    ${sessionScope.str} <br>
    ${applicationScope.str} <br>

    <h4>\${확인} : ${str}</h4> <%-- ${확인} : page 범위에 세팅된 문자열 --%>

    <hr>

    <h3>
        <a href="scopeCheck">내장 객체별 생명 주기 확인</a>
    </h3>
</body>
</html>