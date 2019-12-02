import React from 'react';
import './App.css';
import Header from './libs/Header/Header';
import ProfilePage from './libs/Content/ProfilePage/ProfilePage';
import Nav from './libs/Nav/Nav';
import Messages from './libs/Content/Messages/Messages';
import {BrowserRouter, Route} from 'react-router-dom';

const App = () => {
  return (
    <BrowserRouter>
      <div className='app-wrapper'>

        <Header />
        <Nav />
        <div className='content-wrapper'>
          <Route path='/profile'  component={ProfilePage} />
          <Route path='/messages' component={Messages} />
        </div>

      </div>
    </BrowserRouter>
  );
}



export default App;
