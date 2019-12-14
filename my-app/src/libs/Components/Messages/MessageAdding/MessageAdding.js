import React from 'react';
import style from './MessageAdding.module.css';


const MessageAdding = (props) => {

    let newMessageElement = React.createRef();

    let addMessage = () => {
        let text = newMessageElement.current.value;
        props.sendMessage(text);
        text = '';
        
    }

    return (
        <div className={style.messageAdding}>
            <textarea ref={newMessageElement}>
               1
            </textarea>
            <button onClick={addMessage}>Send-></button>
        </div>
    );
}

export default MessageAdding;