// 좋아요 버튼이 클릭 되었을 때
const boardLike = document.getElementById("boardLike");

boardLike.addEventListener("click", e=>{
    // 로그인 여부 검사
    if(loginMemberNo==""){
        alert("로그인 후 이용해주세요.");
        return;
    }

    let check; // 기존에 좋아요 X(빈하트) : 0, 
               //        좋아요 0(꽉찬 하트) : 1
    // contains("클래스명") : 클래스가 있으면 true, 없으면 false
    if(e.target.classList.contains("fa-regular")){
        check = 0; // 좋아요 X(빈하트) : 0, 
    } else{
        check = 1; // 좋아요 0(꽉찬 하트) : 1
    }

    // ajax로 서버로 제출할 파라미터를 모아둔 JS 객체
    const data = {"boardNo":boardNo,
                "memberNo":loginMemberNo,
                "check":check
                };
    // ajax 코드 작성
    fetch("/board/like", {
        method : "POST",
        headers : {"Content-Type" : "application/json"}, // 우리가 지금 보낼 거는 json이야
        body : JSON.stringify(data)
    })
    .then(response=>response.text()) // 응답 객체를 필요한 형태로 파싱하여 리턴
    .then(count =>{

        console.log("count : "+count);

        if(count == -1){ // INSERT, DELETE 실패 시
            console.log("좋아요 처리 실패");
            return;
        }

        // toggle() : 클래스가 있으면 없애고, 없으면 추가하고
        e.target.classList.toggle("fa-regular");
        e.target.classList.toggle("fa-solid");

        e.target.nextElementSibling.innerText = count;

    }) // 파싱한 데이터를 받아서 처리하는 코드 작성
    .catch(err=>{
        console.log("예외 발생");
        console.log(err);
    }) // 예외 발생 시 처리하는 부분

});