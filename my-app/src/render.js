import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import * as serviceWorker from './serviceWorker';
import {addNewPost, sendMessage, changeNewPostData} from './Redux/state'


let rerenderTree = (state) => {
ReactDOM.render(<App 
    state={state} 
    addPost={addNewPost} 
    sendMessage={sendMessage}
    changeNewPostData={changeNewPostData}/>, 
document.getElementById('root'));
}


export default rerenderTree;


serviceWorker.unregister();

