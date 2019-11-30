import React from 'react';
import style from './UserInfo.module.css';


const UserInfo = () => {
    return (
        <div className={style.userInfo}>
            <ul>
                <li>День рождения:</li>
                <li>Телефона:</li>
                <li>Город:</li>
                <li>Профессия:</li>
            </ul>
        </div>
    );
}

export default UserInfo;