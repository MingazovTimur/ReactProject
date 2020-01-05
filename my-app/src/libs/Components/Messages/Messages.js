import React from 'react';
import style from './Messages.module.css';
import Message from './Message/Message';
import MessageAdding from './MessageAdding/MessageAdding';



const Messages = (props) => {
    
    let messagesElements = 
        props.state.messagesData.map( m =>  <Message 
            message={m.message}
            senderClass={m.senderClass} />)
    

    return (
        <div className={style.messages}>

            <p className={style.mainLabel}>Вы:</p>
            <p className={style.companionLabel}>Собеседник:</p>
            
            {messagesElements}

            <MessageAdding 
            newMessageData={props.state.newMessageData}
            dispatch={props.dispatch} />
            
        </div>
    );
}

export default Messages;