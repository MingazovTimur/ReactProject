import Ava from '../../Components/Ava/Ava';
import Profile from '../../Components/Profile/Profile';
import React from 'react';
import style from './ProfilePage.module.css';
import Posts from '../../Components/Posts/Posts';
import FriendList from '../../Components/FriendList/FriendList';



const ProfilePage = (props) => {


    return (
        <div className={style.profilePage}>
            <Ava 
            avaSrc={props.avaSrc} /> 
            <Profile />
            <FriendList 
            userIconSrc={props.userIconSrc}
            userIconName={props.userIconName} /> 
            <Posts 
            userIconName={props.userIconName}
            newPostData={props.newPostData}
            postsData={props.postsData} 
            userIconSrc={props.userIconSrc}
            dispatch={props.dispatch} />
        </div>
    );
}

export default ProfilePage;