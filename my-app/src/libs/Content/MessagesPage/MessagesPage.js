import React from 'react';
import style from './MessagesPage.module.css';
import Dialogs from '../../Components/Dialogs/Dialogs';
import Messages from '../../Components/Messages/Messages';
import {BrowserRouter} from 'react-router-dom';



const MessagesPage = (props) => {
    return (
        <BrowserRouter>
            <div className={style.messagesPage}>
                <Dialogs  
                dialogsData={props.dialogsData} 
                userIconSrc={props.userIconSrc} />
                <Messages 
                messagesData={props.messagesData}
                sendMessage={props.sendMessage} />
            </div>
        </BrowserRouter>
    );
}

export default MessagesPage;