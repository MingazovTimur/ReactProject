import UserIcon from '../../UserIcon/UserIcon.js';
import React from 'react';
import style from './PostAdding.module.css';
import { AddPostActionCreator, ChangeNewPostDataActionCreator } from '../../../../Redux/state.js';


const PostAdding = (props) => {

    let newPostElement = React.createRef();

    let addPost = () => {
        props.dispatch(AddPostActionCreator());
    }

    

    let onChangePost = () => {
        let text = newPostElement.current.value;
        props.dispatch(ChangeNewPostDataActionCreator(text));
    }

    return (
        <div className={style.postAdding}>
            <UserIcon 
            userIconSrc={props.userIconSrc}
            userIconName={props.userIconName} />
            <textarea 
                ref={newPostElement}
                value={props.newPostData}
                onChange={onChangePost}/>
               
            <button onClick={addPost}>Done</button>
        </div>
    );
}

export default PostAdding;