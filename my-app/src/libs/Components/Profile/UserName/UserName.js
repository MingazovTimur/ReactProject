import React from 'react';
import style from './UserName.module.css';
import FirstName from './FirstName/FirstName';
import LastName from './LastName/LastName';



const UserName = () => {
    return (
        <div className={style.userName}>
            <h2><FirstName /> <LastName /></h2>
        </div>
    );
}

export default UserName;