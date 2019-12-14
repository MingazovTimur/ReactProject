import React from 'react';
import style from './SmallUserIcon.module.css';

const SmallUserIcon = (props) => {
    return (
        <div className={style.smallUserIcon}>
            <img src={props.userIconSrc} alt='img' />
        </div>
    );
}

export default SmallUserIcon;