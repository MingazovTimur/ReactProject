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
            avaSrc={props.state.avaSrc} /> 
            <Profile />
            <FriendList 
            state={props.state} /> 
            <Posts 
            state={props.state}
            dispatch={props.dispatch} />
        </div>
    );
}

export default ProfilePage;