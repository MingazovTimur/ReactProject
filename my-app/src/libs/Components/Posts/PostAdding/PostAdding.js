import UserIcon from '../../UserIcon/UserIcon.js';
import React from 'react';
import style from './PostAdding.module.css';
import { AddPostActionCreator, ChangeNewPostDataActionCreator } from '../../../../redux/profile-reducer';


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
                value={props.newPostData}
                ref={newPostElement}
                placeholder='Здесь можно создать свой пост'
                onChange={onChangePost}/>
               
            <button onClick={addPost}>Done</button>
        </div>
    );
}

export default PostAdding;