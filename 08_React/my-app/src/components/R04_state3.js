import React, {useState} from "react";

const Id = ({handler}) => {

    // props로 전달한 값 중 Key가 handler인 요소의 value 반환
    // console.log(handler);
    // console.log(props.handler);

    return(
        <>
            <div className="wrapper">
                <label htmlFor="id">ID : </label>
                <input type="text" id="id" onChange={handler}/>
            </div>
        </>
            // 2) 전달 받은 값이 자식에 세팅

    );
};

const Pw = ({handler}) => {

    return(
        <>
            <div className="wrapper">
                <label htmlFor="pw">PW : </label>
                <input type="password" id="pw" onChange={handler}/>
            </div>
        </>
    );
};

// className -> 요소.className.add 실행

// 상태 끌어올리기
const StateLiftingUp = () => {

    const [id, setId] = useState('');
    const [pw, setPw] = useState('');

    // 1) 자식의 값을 바꿀 수 있는 함수를 전달 (변수를 바꾸는 함수)
    const idHandler = (e)=> { // id 값 변경 함수
        setId(e.target.value);
    }

    const pwHandler = (e) => { // pw 값 변경 함수
        setPw(e.target.value);
    }

    console.log("id : "+id);
    console.log("pw : "+pw);

    return(

            // 3) 다시 자식에서 세팅된 값이 부모로와서 수정
        <>
            <Id handler={idHandler}/>
            <Pw handler={pwHandler}/>

            <div className="wrapper">
                <button disabled={id.length === 0 || pw.length === 0}>Login</button>
            </div>
        </>
    );

}


export default StateLiftingUp;


