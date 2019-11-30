import Ava from '../Ava/Ava';
import React from 'react';
import style from './FriendList.module.css';


const Posts = () => {
    return (
        <div className={style.friendList}>
            <Ava /> <Ava /> <Ava />
            <Ava /> <Ava /> <Ava />
        </div>
    );
}

export default Posts;