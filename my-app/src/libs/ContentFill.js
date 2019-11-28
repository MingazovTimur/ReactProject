import React from 'react';
import style from './styleLibs/ContentFill.module.css';


const ContentFill = () => {
    return (
        <div className={style.contentFill}>
            <h2>Наполнение части контента, здесь будет либо информация о пользователе, либо блок с постами, либо визуальная часть страницы с конентом</h2>
        </div>
    );
}

export default ContentFill;