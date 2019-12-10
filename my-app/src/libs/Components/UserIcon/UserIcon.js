import React from 'react';
import style from './UserIcon.module.css';

const UserIcon = (props) => {
    return (
        <div className={style.userIcon}>
            <img src={props.userIconSrc} alt='img' />
            Юзер
        </div>
    );
}

export default UserIcon;