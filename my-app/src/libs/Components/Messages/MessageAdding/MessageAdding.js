import React from 'react';
import style from './MessageAdding.module.css';
import { SendMessageActionCreator, ChangeNewMessageDataActionCreator } from '../../../../Redux/state';


const MessageAdding = (props) => {

    let newMessageElement = React.createRef();

    let addMessage = () => {
        props.dispatch(SendMessageActionCreator());
    }

    let onChangeMessage = () => {
        let text = newMessageElement.current.value;
        props.dispatch(ChangeNewMessageDataActionCreator(text));
    }

    return (
        <div className={style.messageAdding}>
            <textarea 
            ref={newMessageElement} 
            value={props.newMessageData}
            onChange={onChangeMessage} />

            <button onClick={addMessage}>Send-></button>
        </div>
    );
}

export default MessageAdding;