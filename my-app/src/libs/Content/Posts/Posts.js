import Post from './Post/Post.js'
import React from 'react';
import style from './Posts.module.css';
import PostAdding from './PostAdding/PostAdding.js';


const Posts = () => {
    return (
        <div className={style.posts}>
            <PostAdding />
            <Post />
            <Post />

        </div>
    );
}

export default Posts;