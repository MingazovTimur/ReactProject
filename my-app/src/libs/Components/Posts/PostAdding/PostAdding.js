import UserIcon from '../../UserIcon/UserIcon.js';
import React from 'react';
import style from './PostAdding.module.css';


const PostAdding = (props) => {
    return (
        <div className={style.postAdding}>
            <UserIcon />
            <textarea name='area'>
               {props.value}
            </textarea>
            <button>Done</button>
        </div>
    );
}

export default PostAdding;