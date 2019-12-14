import Ava from '../../Components/Ava/Ava';
import Profile from '../../Components/Profile/Profile';
import React from 'react';
import style from './ProfilePage.module.css';
import Posts from '../../Components/Posts/Posts';
import FriendList from '../../Components/FriendList/FriendList';



const ProfilePage = (props) => {


    return (
        <div className={style.profilePage}>
            <Ava avaSrc={props.avaSrc} /> <Profile />
            <FriendList userIconSrc={props.userIconSrc} /> 
            <Posts 
            newPostData={props.newPostData}
            changeNewPostData={props.changeNewPostData}
            postsData={props.postsData} 
            userIconSrc={props.userIconSrc}
            addPost={props.addPost}/>
        </div>
    );
}

export default ProfilePage;