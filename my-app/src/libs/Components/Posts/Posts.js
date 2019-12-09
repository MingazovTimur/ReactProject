import Post from './Post/Post.js'
import React from 'react';
import style from './Posts.module.css';
import PostAdding from './PostAdding/PostAdding.js';


const Posts = (props) => {

    let postsElement = props.postsData.map( 
        p => <Post fill={p.fill} likes={p.likes} />
        )

    return (
        <div className={style.posts}>
            <PostAdding 
                value='Здесь можно создать свой пост' />
            {postsElement}
        </div>
    );
}

export default Posts;