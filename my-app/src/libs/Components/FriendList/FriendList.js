import React from 'react';
import style from './FriendList.module.css';
import UserIcon from '../UserIcon/UserIcon';


const Posts = (props) => {
    return (
        <div className={style.friendList}>
            <UserIcon userIconSrc={props.state.userIconSrc} userIconName={props.state.userIconName} /> 
            <UserIcon userIconSrc={props.state.userIconSrc} userIconName={props.state.userIconName} />
            <UserIcon userIconSrc={props.state.userIconSrc} userIconName={props.state.userIconName} />
            <UserIcon userIconSrc={props.state.userIconSrc} userIconName={props.state.userIconName} />
            <UserIcon userIconSrc={props.state.userIconSrc} userIconName={props.state.userIconName} />
            <UserIcon userIconSrc={props.state.userIconSrc} userIconName={props.state.userIconName} />
        </div>
    );
}

export default Posts;