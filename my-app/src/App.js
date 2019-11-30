import React from 'react';
import './App.css';
import Header from './libs/Header/Header';
import Content from './libs/Content/Content';
import Nav from './libs/Nav/Nav';

const App = () => {
  return (
    <div className='app-wrapper'>

      <Header />
      <Nav />
      <Content />

    </div>
  );
}



export default App;
