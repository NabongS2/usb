import React, { useState } from 'react';

const InputPrint = () => {
    
    const [text, setText] = useState('');
    const [inputText, setinputText] = useState('');
    return(
        <>
            <input type="text" onChange={e=> setinputText(e.target.value)}></input>
            <button onClick={()=>{setText(inputText)}}>보내기</button>
            <div className='text-div'>{text}</div>
        </>
    )
}

export default InputPrint;