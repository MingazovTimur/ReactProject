import React from 'react';
import style from './Dialogs.module.css';
import Dialog from './Dialog/Dialog';



const Dialogs = (props) => {


    let dialogsElements = props.dialogsData.map(d => <Dialog
            id={d.id}
            user={d.user}
            userIconSrc={props.userIconSrc} />)

    return (
        
        <div className={style.dialogs}>
            {dialogsElements}
        </div>
    );
}

export default Dialogs;