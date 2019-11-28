import logo from './../logo.svg';
import React from 'react';

const Header = () => {
    return (
        <div className="header">
            <img className="header-logo" src={logo} alt="logo" />
            <p>Header</p>
        </div>
    );
}

export default Header;