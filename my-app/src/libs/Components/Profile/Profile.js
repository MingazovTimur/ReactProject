import React from 'react';
import style from './Profile.module.css';
import UserName from './UserName/UserName';
import UserInfo  from './UserInfo/UserInfo';


const Profile = () => {
    return (
        <div className={style.profile}>
            <UserName /> <UserInfo />
        </div>
    );
}

export default Profile;