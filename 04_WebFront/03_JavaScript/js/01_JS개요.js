// 이 파일 자체가 script 태그라고 생각

// 한 줄 주석
/* 범위 주석 */

function btnClick2(){
    alert("external 버튼이 클림됨");
}

function darkMode(){
    const body = document.querySelector("body");

    // ** JS는 카멜 표기법! **
    body.style.backgroundColor="black";
    body.style.color="white";
}

function lightMode(){
    const body = document.querySelector("body");

    // ** JS는 카멜 표기법! **
    body.style.backgroundColor="white";
    body.style.color="black";
}