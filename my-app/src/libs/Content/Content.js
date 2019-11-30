import Ava from './Ava/Ava';
import Profile from './Profile/Profile';
import React from 'react';
import style from './Content.module.css';
import Posts from './Posts/Posts';
import FriendList from './FriendList/FriendList';



const Content = () => {
    return (
        <div className={style.content}>
            <Ava /> <Profile />
            <FriendList /> <Posts />
        </div>
    );
}

export default Content;