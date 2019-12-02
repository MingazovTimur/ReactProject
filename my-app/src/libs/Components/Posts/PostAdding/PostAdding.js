import Ava from '../../Ava/Ava.js';
import React from 'react';
import style from './PostAdding.module.css';


const PostAdding = (props) => {
    return (
        <div className={style.postAdding}>
            <Ava />
            <textarea name='area'>
               {props.value}
            </textarea>
            <button>Done</button>
        </div>
    );
}

export default PostAdding;