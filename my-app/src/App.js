import React from 'react';
import './App.css';
import Header from './libs/Header.js';
import Content from './libs/Content';
import Nav from './libs/Nav';

const App = () => {
  return (
    <div className='App'>

      <Header />
      <Nav />
      <Content />
      
    </div>
  );
}



export default App;
