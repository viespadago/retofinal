import React from 'react'

export const SubmitBtn = ({ method }) => {

    //fecth al back y nos devuelve
    return (
        <>
            <button onClick={ method }>UPDATE DATA</button>
        </>
    )
}
export default SubmitBtn;
