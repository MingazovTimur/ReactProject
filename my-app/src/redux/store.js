import profileReducer from "./profile-reducer";
import messagesReducer from "./messages-reducer";


let store = {
    

    _state:{
    
        userIconName: 'Юзер',
        userIconSrc:'https://www.meme-arsenal.com/memes/55da8b744d5190f8f7835d5581ba2a80.jpg',
        avaSrc:'https://www.meme-arsenal.com/memes/55da8b744d5190f8f7835d5581ba2a80.jpg',
    
        profilePage: {
            postsData: [
                {id: 1, fill:"Hello, it's first post of this project", likes: '5'},
                {id: 2, fill:"Oh, man. This is second post, here we go!", likes: '9'}
            ],
    
            newPostData: '',

            userIconName: 'Юзер',
            mainIconName: 'Леонид',
            avaSrc:'https://www.meme-arsenal.com/memes/55da8b744d5190f8f7835d5581ba2a80.jpg',
            userIconSrc:'https://веселун.рф/photopricoly/1/655234584.jpg',
            mainIconSrc:'https://www.meme-arsenal.com/memes/55da8b744d5190f8f7835d5581ba2a80.jpg'
        },
        
    
        messagesPage: {
            messagesData: [
                {id:1, message:'Hi,man', senderClass:'mainSender'},
                {id:2, message:'Its a long way to learn react to that level, than give u possible to find a work like programmer', senderClass:'otherSender'},
                {id:3, message:'Yep, i confirm', senderClass:'mainSender'},
                {id:4, message:'And what u gonna do?', senderClass:'otherSender'},
                {id:5, message:'I\'am gonna teach, man', senderClass:'mainSender'},
                {id:6, message:'u cool, bro', senderClass:'otherSender'}
            
            ],
            
            dialogsData: [
                {user:'Леонид Анатольевич',  id:'1'},
                {user:'Лиана Динаровна',   id:'2'},
                {user:'Торин Гимлевич',   id:'3'},
                {user:'Алексей Тимурович', id:'4'},
                {user:'Фродо Беггинс',  id:'5'},
                {user:'Бильбо Небеггинс',  id:'6'}
            ],
    
            newMessageData: '',

            userIconName: 'Юзер',
            mainIconName: 'Вы',
            userIconSrc:'https://веселун.рф/photopricoly/1/655234584.jpg',
            mainIconSrc:'https://www.meme-arsenal.com/memes/55da8b744d5190f8f7835d5581ba2a80.jpg'
        }
    },

    getState() {
        return this._state;
    },

    
    dispatch(action) {
        this._state.profilePage  = profileReducer(this._state.profilePage, action);
        this._state.messagesPage = messagesReducer(this._state.messagesPage, action);

        this._rerenderTree(this._state);
    },

    Subscribe(observer) {
        this._rerenderTree = observer;
    },

    _rerenderTree() {
    
    }  
}

export default store;