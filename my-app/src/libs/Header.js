import logo from './../logo.svg';
import React from 'react';
import style from './styleLibs/Header.module.css';


const Header = () => {
    return (
        <header className={style.header}>
            <img src={logo} alt={"logo"} />
            Header
        </header>
    );
}

export default Header;