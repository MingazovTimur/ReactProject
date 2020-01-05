import Post from './Post/Post.js'
import React from 'react';
import style from './Posts.module.css';
import PostAdding from './PostAdding/PostAdding.js';


const Posts = (props) => {

    let postsElement = props.state.postsData.map( 
        p => <Post 
        fill={p.fill}  
        likes={p.likes} 
        userIconSrc={props.state.mainIconSrc}
        userIconName={props.state.mainIconName} />)

    return (
        <div className={style.posts}>
            <PostAdding 
                userIconSrc={props.state.mainIconSrc}
                userIconName={props.state.mainIconName}
                newPostData={props.state.newPostData}
                dispatch={props.dispatch} />
            {postsElement}
        </div>
    );
}

export default Posts;