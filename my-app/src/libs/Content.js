import Ava from './Ava';
import ContentFill from './ContentFill';
import React from 'react';
import style from './styleLibs/Content.module.css';



const Content = () => {
    return (
        <div className={style.content}>
            Контент блок (АВА + Контент Филл) + Нужно добавить Описание пользователя, Посты и прочее
            <Ava /> <ContentFill />
        </div>
    );
}

export default Content;