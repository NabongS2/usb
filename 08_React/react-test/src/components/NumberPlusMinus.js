import React, {useState} from 'react';


const NumberPlusMinus = () => {

    let [number, setNumber] = useState(0);

    return(
        <>
            <div>                
                <button className='cyan' onClick={ ()=> setNumber(number-1)}>-</button>
                <h3>{number}</h3>
                <button className='magenta' onClick={()=> setNumber(number+1)}>+</button>            
            </div>
        </>
    );
}

export default NumberPlusMinus;