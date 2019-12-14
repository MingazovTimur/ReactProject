import UserIcon from '../../UserIcon/UserIcon.js';
import React from 'react';
import style from './PostAdding.module.css';


const PostAdding = (props) => {

    let newPostElement = React.createRef();

    let addPost = () => {
        props.addPost();
    }

    

    let onChangePost = () => {
        let text = newPostElement.current.value;
        props.changeNewPostData(text);
    }

    return (
        <div className={style.postAdding}>
            <UserIcon userIconSrc={props.userIconSrc}/>
            <textarea 
                ref={newPostElement}
                value={props.newPostData}
                onChange={onChangePost}/>
               
            <button onClick={addPost}>Done</button>
        </div>
    );
}

export default PostAdding;