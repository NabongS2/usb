// 계산 버튼 클릭 시 
// input 태그에 작성된 값을 모두 읽어와 합한 결과를 alert로 출력

document.getElementById("calc").addEventListener("click",()=>{
    const inList = document.getElementsByClassName("in");
    // let num1 = inList[0].value;
    // let num2 = inList[1].value;
    let sum = 0; // 합계 저장용 변수

    /*
    for(let i=0; i<inList.length; i++){
        // console.log(inList[i].value);
        sum += Number(inList[i].value);
    }
    // alert(Number(num1)+Number(num2));
    */
    
    for(let input of list){
        sum +=Number(input.value);
    }
    
    alert(sum); 
});

// 추가 버튼이 클릭 되었을 때
// .container 요소의 마지막 자식으로
// <div class="row">
//      <input type="number" class="in">
//</div>
// 위 요소 만들어서 추가하기

document.getElementById("add").addEventListener("click",()=>{
    // 요소 만들기 : document.ceateElement("태그명")
    // 요소 제거하기 : 요소.remove();

    // 요소의 클래스 목록 확인하기 : 요소.classList
    // 요소에 class 추가 : 요소.classList.add("클래스명")
    // 요소에 class 제거 : 요소.classList.remove("클래스명")

    // 요소에 속성, 값 추가 : 요소.setAttribute("속성명","값");
    // 요소에 속성 제거 : 요소.removeAttribute("속성명");

    // 부모요소.prepend(자식요소)
    // 부모 요소의 첫 번째 자식으로 자식 요소를 추가

    // 부모요소.append(자식요소)
    // 부모 요소의 마지막 자식으로 자식 요소를 추가(덧붙이기)

    // A.after(B) : A의 다음 요소로 B를 추가
    // A.before(B) : A의 이전 요소로 B를 추가

    // -----------------------------------
    // div 요소 만들기
    const div = document.createElement("div");
    div.classList.add("row"); // div에 row 클래스 추가

    // -----------------------------------
    // input 요소 만들기
    const input = document.createElement("input");
    input.classList.add("in"); // input에 in 클래스 추가
    input.setAttribute("type","number");

    // span 요소 만들기
    const span = document.createElement("span");
    span.classList.add("remove-row");

    // span에 &times 내용추가
    span.innerHTML="&times;";

    // 만들어진 span 요소에 이벤트 리스너 추가
    span.addEventListener("click",e=>{
        // 클릭된 요소의 부모 요소를 삭제 == row 삭제
        e.target.parentElement.remove();
    })

    // -----------------------------------
    // div의 자식으로 input 추가
    // div.append(input);
    div.prepend(input);
    div.append(span);

    // -----------------------------------
    // .container의 마지막 자식으로 div 추가
    document.querySelector(".container").append(div);
    
});

// 삭제 버튼 동작 테스트

// 클래스가 remove-row인 요소 중 첫 번째 요소
document.querySelector(".remove-row").addEventListener('click', e => {
    console.log(e.target); // 이벤트가 발생한 요소(x버튼)

    console.log(e.target.parentElement);

    // 이벤트가 발생한 요소의 부모 요소를 제거(remove())
    e.target.parentElement.remove();
});