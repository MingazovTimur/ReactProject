import React from 'react';
import style from './Dialogs.module.css';
import Dialog from './Dialog/Dialog';



const Dialogs = (prop) => {


    let dialogsElements = prop.dialogsData.map (d =>  <Dialog id={d.id} user={d.user} />)

    return (
        
        <div className={style.dialogs}>
            {dialogsElements}
        </div>
    );
}

export default Dialogs;