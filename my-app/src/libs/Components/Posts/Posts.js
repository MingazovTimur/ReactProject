import Post from './Post/Post.js'
import React from 'react';
import style from './Posts.module.css';
import PostAdding from './PostAdding/PostAdding.js';


const Posts = () => {
    return (
        <div className={style.posts}>
            <PostAdding 
                value='Здесь можно создать свой пост' />
            <Post 
                message="Hello, it's first post of this project" 
                likes='5'/>
            <Post 
                message="Oh, man. This is second post, here we go!"
                likes='9'/>
        </div>
    );
}

export default Posts;