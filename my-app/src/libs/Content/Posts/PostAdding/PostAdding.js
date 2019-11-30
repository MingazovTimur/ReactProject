import Ava from '../../Ava/Ava.js';
import React from 'react';
import style from './PostAdding.module.css';


const PostAdding = () => {
    return (
        <div className={style.postAdding}>
            <Ava />
            <textarea name='area'>Здесь можно создать свой пост</textarea>
            <button>Done</button>
        </div>
    );
}

export default PostAdding;