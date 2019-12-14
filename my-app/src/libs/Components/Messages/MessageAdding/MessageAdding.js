import React from 'react';
import style from './MessageAdding.module.css';


const MessageAdding = (props) => {

    let newMessageElement = React.createRef();

    let addMessage = () => {
        props.sendMessage();
    }

    let onChangeMessage = () => {
        let text = newMessageElement.current.value;
        props.changeNewMessageData(text);
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