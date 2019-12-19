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
            userIconName={props.state.userIconName}
            newPostData={props.state.profilePage.newPostData}
            postsData={props.state.profilePage.postsData}
            userIconSrc={props.state.userIconSrc}
            avaSrc={props.state.avaSrc}
            dispatch={props.dispatch} />} />

          <Route path='/messages' render={() => <MessagesPage 
            userIconSrc={props.state.userIconSrc}
            dialogsData={props.state.messagesPage.dialogsData}
            messagesData={props.state.messagesPage.messagesData}
            newMessageData={props.state.messagesPage.newMessageData}
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
