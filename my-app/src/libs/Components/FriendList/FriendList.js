import React from 'react';
import style from './FriendList.module.css';
import UserIcon from '../UserIcon/UserIcon';


const Posts = (props) => {
    return (
        <div className={style.friendList}>
            <UserIcon userIconSrc={props.userIconSrc} /> 
            <UserIcon userIconSrc={props.userIconSrc} />
            <UserIcon userIconSrc={props.userIconSrc} />
            <UserIcon userIconSrc={props.userIconSrc} />
            <UserIcon userIconSrc={props.userIconSrc} />
            <UserIcon userIconSrc={props.userIconSrc} />
        </div>
    );
}

export default Posts;