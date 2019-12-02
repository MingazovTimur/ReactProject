import React from 'react';
import style from './Nav.module.css';



const Nav = () => {
    return (
        <div className={style.nav}>
            Навигация:
            <div>
                <a href="/profile">Profile</a>
            </div>
            <div>
                <a href="/messages">Messages</a>
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