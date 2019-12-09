import React from 'react';
import style from './Dialog.module.css';
import {NavLink} from 'react-router-dom';


const Dialog = (props) => {
    const Path = '/messages/' + props.id;

    
    return (       
        <div className={style.dialog}>
            <NavLink to={Path} activeClassName={style.active} className={style.dialogInner}>{props.user}</NavLink>
        </div>
    );
}

export default Dialog;