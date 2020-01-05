import React from 'react';
import './App.css';
import Header from './libs/Header/Header';
import ProfilePage from './libs/Content/ProfilePage/ProfilePage';
import Nav from './libs/Nav/Nav';
import MessagesPage from './libs/Content/MessagesPage/MessagesPage';
import {BrowserRouter, Route} from 'react-router-dom';
import NewsPage from './libs/Content/NewsPage/NewsPage';
import MusicPage from './libs/Content/MusicPage/MusicPage';
import SettingPage from './libs/Content/SettingPage/SettingPage';


const App = 
(props) => {

  return (
    <BrowserRouter>
      <div className='app-wrapper'>

        <Header />
        <Nav />
        <div className='content-wrapper'>
          <Route path='/profile' render={() => <ProfilePage
            state={props.state.profilePage}
            dispatch={props.dispatch} />} />

          <Route path='/messages' render={() => <MessagesPage 
            state={props.state.messagesPage}
            dispatch={props.dispatch} />} />

          <Route path='/news' render={() => <NewsPage />} />
          <Route path='/music' render={() => <MusicPage />} />
          <Route path='/settings' render={() => <SettingPage />} />
        </div>

      </div>
    </BrowserRouter>
  );
}



export default App;
