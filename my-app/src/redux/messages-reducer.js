const SEND_MESSAGE = 'SEND-MESSAGE';

const CHANGE_NEW_MESSAGE_DATA = 'CHANGE-NEW-MESSAGE-DATA';

export const SendMessageActionCreator = () => ({type: SEND_MESSAGE});

export const ChangeNewMessageDataActionCreator = (text) => ({type:CHANGE_NEW_MESSAGE_DATA, text: text});

let initialState = {
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

const messagesReducer = (state = initialState, action) => {
    switch(action.type){
        case SEND_MESSAGE:
            let newMessage = {
                id: 7,
                message: state.newMessageData,
                senderClass: 'mainSender'
            };
            state.messagesData.push(newMessage);
            state.newMessageData = '';
            return state;

        case CHANGE_NEW_MESSAGE_DATA:
            state.newMessageData = action.text;
            return state;
        
        default:
            return state;
    }
}

export default messagesReducer;