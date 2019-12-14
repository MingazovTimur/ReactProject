import React from 'react';
import style from './Dialog.module.css';
import {NavLink} from 'react-router-dom';
import SmallUserIcon from '../../SmallUserIcon/SmallUserIcon';


const Dialog = (props) => {
    const Path = '/messages/' + props.id;


    return (       
        <div className={style.dialog}>
            <SmallUserIcon userIconSrc={props.userIconSrc} />
            <NavLink to={Path}
                activeClassName={style.active}
                className={style.dialogInner}>
                {props.user}
            </NavLink>
        </div>
    );
}

export default Dialog;