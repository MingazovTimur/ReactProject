
import React from 'react';
import style from './Post.module.css';
import UserIcon from '../../UserIcon/UserIcon.js';



const Post = (props) => {
    return (
        <div className={style.post}>
            <UserIcon userIconSrc={props.userIconSrc}/>
            <p className={style.postText}>
            {props.fill}
            </p>
            <span className={style.likes}>
            {props.likes + " likes"}
            </span>
        </div>
    );
}

export default Post;