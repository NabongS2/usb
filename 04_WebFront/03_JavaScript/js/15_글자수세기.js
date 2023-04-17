const text = document.getElementById("content");
const count = document.getElementById("count");
// text.addEventListener("keyup",()=>{
//     const length = text.value.length;
//     count.innerText=length;
//     if(length>100) count.classList.add("error");
//     if(length<100) count.classList.remove("error");
// });
text.addEventListener("ib nput",(e)=>{
    // input 이벤트 : 입력과 관련된 모든 행동
    // input, textarea 등 입력 가능한 요소에 값이 인식되면 인식 key
    // 마우스로 붙여넣기 하면 인식이 안됐는데 인식됨

    // e.target : 이벤트가 발생한 요소 (==#content)
    count.innerText=e.target.value.length;
    if(e.target.value.length>100) count.classList.add("error");
    else count.classList.remove("error");
    // count.classList.toggle("error");

    // 요소.classList.toggle("클래스명");
    // 요소에 클래스가 없으면 추가 (true 반환)
    // 요소에 클래스가 있으면 추가 (false 반환)
    
});