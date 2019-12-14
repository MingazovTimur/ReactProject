import Post from './Post/Post.js'
import React from 'react';
import style from './Posts.module.css';
import PostAdding from './PostAdding/PostAdding.js';


const Posts = (props) => {

    let postsElement = props.postsData.map( 
        p => <Post 
        fill={p.fill}  
        likes={p.likes} 
        userIconSrc={props.userIconSrc}/>)

    return (
        <div className={style.posts}>
            <PostAdding 
                newPostData={props.newPostData}
                changeNewPostData={props.changeNewPostData}
                userIconSrc={props.userIconSrc} 
                addPost={props.addPost} />
            {postsElement}
        </div>
    );
}

export default Posts;