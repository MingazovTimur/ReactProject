import React from 'react';
import style from './Messages.module.css';
import Message from './Message/Message';



const Messages = (props) => {
    
    let messagesElements = [
        props.messagesData.map( m =>  <Message message={m.message} />)
    ]

    return (
        <div className={style.messages}>
            {messagesElements}
        </div>
    );
}

export default Messages;