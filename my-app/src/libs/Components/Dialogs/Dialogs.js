import React from 'react';
import style from './Dialogs.module.css';
import Dialog from './Dialog/Dialog';



const Dialogs = (props) => {


    let dialogsElements = props.state.dialogsData.map(d => <Dialog
            id={d.id}
            userIconSrc={props.state.userIconSrc} 
            user={d.user} />)

    return (
        
        <div className={style.dialogs}>
            {dialogsElements}
        </div>
    );
}

export default Dialogs;