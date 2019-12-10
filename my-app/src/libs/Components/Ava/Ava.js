import React from 'react';
import style from './Ava.module.css';

const Ava = (props) => {
    return (
        <div className={style.ava}>
            <img src={props.avaSrc} alt='img' />
        </div>
    );
}

export default Ava;