import React from 'react';
import style from './FriendList.module.css';
import UserIcon from '../UserIcon/UserIcon';


const Posts = () => {
    return (
        <div className={style.friendList}>
            <UserIcon /> 
            <UserIcon />
            <UserIcon />
            <UserIcon />
            <UserIcon />
            <UserIcon />
        </div>
    );
}

export default Posts;