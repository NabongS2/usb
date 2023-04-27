const loginFrm = document.getElementById("loginFrm");

const memberEmail = document.querySelector("#loginFrm input[name='memberEmail']");
const memberPw = document.querySelector("#loginFrm input[name='memberPw']");

// 로그인 시도
loginFrm.addEventListener("submit",e =>{
    // alert("로그인");
    
    // form 태그 기본 이벤트 제거
    // e.preventDefault();

    // 이메일이 입력되지 않은 경우
    if(memberEmail.value.trim().length ==0){
        alert("이메일을 입력해주세요.");

        memberEmail.value="";
        memberEmail.focus(); // 이메일 input 태그에 초점을 맞춤

        e.preventDefault();
        return; // 제출 못하게 하기
    }
    // 비밀번호가 입력되지 않은 경우
    if(memberPw.value.trim().length ==0){
        alert("비밀번호를 입력해주세요.");

        memberPw.value="";
        memberPw.focus(); // 비밀번호 input 태그에 초점을 맞춤

        e.preventDefault();
        return; // 제출 못하게 하기
    }
})