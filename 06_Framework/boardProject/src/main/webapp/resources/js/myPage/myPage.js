// 내 정보(수정) 페이지
const memberNickname = document.getElementById("memberNickname");
const memberTel = document.getElementById("memberTel");

const updateInfo = document.getElementById("updateInfo");
// 다른 데서는 null이 나와서 오류가 남으로 처리 해주기

// 내 정보 수정 form 태그가 존재 할 때 (내 정보 페이지)
if(updateInfo != null){

    // 전역 변수로 닉네임/전화번호를 저장
    initNickname = memberNickname.value;
    initTel = memberTel.value;

    // 닉네임 유효성 검사
    memberNickname.addEventListener("input",()=>{
        if(memberNickname.value == initNickname){ // 변경 전 닉네임과 입력 값이 같을 경우
            memberNickname.removeAttribute("style");
            return;
        }
        // 정규 표현식으로 유효성 검사
        const regEx = /^[가-힣\w\d]{2,10}$/;

        if(regEx.test(memberNickname.value)){ // 유효
            memberNickname.style.color = "green";
        } else { // 무효
            memberNickname.style.color = "red";
        }


    });
    // 전화번호 유효성 검사
    memberTel.addEventListener("input",()=>{
        const regEx = /^0(1[01679]|2|[3-6][1-5]|70)[1-9]\d{2,3}\d{4}$/;

        if(regEx.test(memberTel.value)){
            memberTel.style.color = "green";
        } else {
            memberTel.style.color = "red";
        }

    });

    // form 태그 제출 시 유효하지 않은 값이 있으면 제출 X
    updateInfo.addEventListener("submit",e=>{
        
        // 닉네임이 유효하지 않을 경우
        if(memberNickname.style.color=="red"){
            alert("닉네임이 유효하지 않습니다.");
            memberNickname.focus(); // 포커스 이동
            e.preventDefault(); // 기본 이벤트 제공
            return;
        }
        if(memberTel.style.color=="red"){
            alert("전화번호가 유효하지 않습니다.");
            memberTel.focus(); // 포커스 이동
            e.preventDefault(); // 기본 이벤트 제공
            return;
        }
    });

}

// 비밀번호 변경 제출 시
const changePwFrm = document.getElementById("changePwFrm");
const newPw = document.getElementById("newPw");
const newPwConfirm = document.getElementById("newPwConfirm");
const currentPw = document.getElementById("currentPw");


if(changePwFrm != null){ // 비밀 번호 변경 페이지인 경우
    
    changePwFrm.addEventListener("submit",e=>{
    
        // 현재 비밀번호 미작성 시 
        if(currentPw.value.trim() ==""){
            alert("현재 비밀번호 입력해주세요.");
            currentPw.focus();
            e.preventDefault();
            return;
        }

        // 비밀번호 유효성 검사
        const regEx = /^[a-zA-Z0-9\!\@\#\-\_]{6,20}$/;

        if(!regEx.test(newPw.value)){
            alert("유효하지 않은 비밀번호 형식입니다.");
            newPw.focus();
            e.preventDefault();
            return;
        } else {
            alert("유효한 비밀번호 형식입니다.");
        }

        // 비밀번호 == 비밀번호 확인
        if(newPw.value!==newPwConfirm.value){
            alert("비밀번호가 일치하지 않습니다.");
            newPwConfirm.focus();
            e.preventDefault();
            return;
        }

    });
}

const secessionFrm = document.getElementById("secessionFrm");

if(secessionFrm != null){
    const memberPw = document.getElementById("memberPw");
    const agree = document.getElementById("agree");
    
    secessionFrm.addEventListener("submit",e=>{
        if(memberPw.value.trim() == ""){ // 비밀번호 미작성
            alert("비밀번호를 작성해주세요.");
            e.preventDefault();
            memberPw.focus();
            return;
        }
        if(!agree.checked){
            alert("약관 동의 후 탈퇴 버튼을 눌러주세요.");
            e.preventDefault();
            agree.focus();
            return;
        }
        if(!confirm("정말 탈퇴 하시겠습니까?")){ // 취소 클릭 시
            alert("탈퇴 취소");
            e.preventDefault();
            return;
        }

    })

}