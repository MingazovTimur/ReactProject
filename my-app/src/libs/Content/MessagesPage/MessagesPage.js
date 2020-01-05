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
                state={props.state} />
                <Messages 
                state={props.state}
                dispatch={props.dispatch} />
            </div>
        </BrowserRouter>
    );
}

export default MessagesPage;