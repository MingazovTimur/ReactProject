
import Ava from '../../Ava/Ava.js';
import React from 'react';
import style from './Post.module.css';



const Post = (props) => {
    return (
        <div className={style.post}>
            <Ava />
            <p>
            {props.message}
            </p>
            <span>
            {props.likes + " likes"}
            </span>
        </div>
    );
}

export default Post;