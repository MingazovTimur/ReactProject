import React from 'react';
import style from './Nav.module.css';



const Nav = () => {
    return (
        <div className={style.nav}>
            Навигация:
            <div>
                Profile
            </div>
            <div>
                Messages
            </div>
            <div>
                News 
            </div>
            <div>
                Music
            </div>
            <div>
                Settings
            </div>
        </div>
    );
}

export default Nav;