import Post from './Post/Post.js'
import React from 'react';
import style from './Posts.module.css';
import PostAdding from './PostAdding/PostAdding.js';


const Posts = (props) => {

    let postsElement = props.postsData.map( 
        p => <Post 
        fill={p.fill}  
        likes={p.likes} 
        userIconSrc={props.userIconSrc}
        userIconName={props.userIconName} />)

    return (
        <div className={style.posts}>
            <PostAdding 
                userIconName={props.userIconName}
                newPostData={props.newPostData}
                dispatch={props.dispatch}
                userIconSrc={props.userIconSrc}  />
            {postsElement}
        </div>
    );
}

export default Posts;