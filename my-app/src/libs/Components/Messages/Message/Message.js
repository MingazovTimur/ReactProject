import React from 'react';
import style from './Message.module.css';



const Message = (props) => {

    let sender;
    if(props.senderClass === "mainSender") {
        sender=style.mainSender
    }else{
        sender=style.otherSender
    }

    return (
        <div className={style.message + ' ' + sender}>
            {props.message}
        </div>
    );
}

export default Message;