const ADD_POST = 'ADD-POST';

const CHANGE_NEW_POST_DATA = 'CHANGE-NEW-POST-DATA';

const SEND_MESSAGE = 'SEND-MESSAGE';

const CHANGE_NEW_MESSAGE_DATA = 'CHANGE-NEW-MESSAGE-DATA';

export const AddPostActionCreator = () => ({type: ADD_POST});

export const ChangeNewPostDataActionCreator = (text) => ({type: CHANGE_NEW_POST_DATA, text: text});

export const SendMessageActionCreator = () => ({type: SEND_MESSAGE});

export const ChangeNewMessageDataActionCreator = (text) => ({type:CHANGE_NEW_MESSAGE_DATA, text: text});

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
    
            newPostData: 'Здесь можно создать свой пост'
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
    
            newMessageData: "Введите сообщение..."
        }
    },

    getState() {
        return this._state;
    },

    ChangeNewPostData(text) {
        this._state.profilePage.newPostData = text;
        this._rerenderTree(this._state);
    },

    ChangeNewMessageData(text) {
        this._state.messagesPage.newMessageData = text;
        this._rerenderTree(this._state);
    },

    AddNewPost() {
        let newPost = {
            id: 3,
            fill: this._state.profilePage.newPostData,
            likes: 0
        };
        this._state.profilePage.postsData.unshift(newPost);
        this._state.profilePage.newPostData = '';
        this._rerenderTree(this._state);
    },

    SendMessage() {
        let newMessage = {
            id: 7,
            message: this._state.messagesPage.newMessageData,
            senderClass: 'mainSender'
        };
        this._state.messagesPage.messagesData.push(newMessage);
        this._state.messagesPage.newMessageData = '';
        this._rerenderTree(this._state);
    },

    dispatch(action) {
        if(action.type === ADD_POST){
            let newPost = {
                id: 3,
                fill: this._state.profilePage.newPostData,
                likes: 0
            };
            this._state.profilePage.postsData.unshift(newPost);
            this._state.profilePage.newPostData = '';
            this._rerenderTree(this._state);

        } else if(action.type === CHANGE_NEW_POST_DATA){
            this._state.profilePage.newPostData = action.text;
            this._rerenderTree(this._state);

        } else if(action.type === SEND_MESSAGE){
            let newMessage = {
                id: 7,
                message: this._state.messagesPage.newMessageData,
                senderClass: 'mainSender'
            };
            this._state.messagesPage.messagesData.push(newMessage);
            this._state.messagesPage.newMessageData = '';
            this._rerenderTree(this._state);

        } else if(action.type === CHANGE_NEW_MESSAGE_DATA){
            this._state.messagesPage.newMessageData = action.text;
            this._rerenderTree(this._state);
        }
    },


    Subscribe(observer) {
        this._rerenderTree = observer;
    },

    _rerenderTree() {
    
    }
    
}




export default store;