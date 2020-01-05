const ADD_POST = 'ADD-POST';

const CHANGE_NEW_POST_DATA = 'CHANGE-NEW-POST-DATA';

export const AddPostActionCreator = () => ({type: ADD_POST});

export const ChangeNewPostDataActionCreator = (text) => ({type: CHANGE_NEW_POST_DATA, text: text});

let initialState = {
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

}

const profileReducer = (state = initialState, action) => {
    switch(action.type){
        case ADD_POST:
            let newPost = {
                id: 3,
                fill: state.newPostData,
                likes: 0
            };
            state.postsData.unshift(newPost);
            state.newPostData = '';
            return state;

        case CHANGE_NEW_POST_DATA:
            state.newPostData = action.text;
            return state;

        default:
            return state;
    }
} 

export default profileReducer;