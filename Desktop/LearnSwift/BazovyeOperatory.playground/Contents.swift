/*
0...6
0..<5

let i = 5
for i in 0...5 {
    print("\(i)")
}
 */
// узнать и вывести на экран сколько секунд прошло с первого января до 09.02

//Всё будем измерять в секундах

let minute = 60
let hour = minute * 60
let day = 24 * hour
let age = 364 * day
let months = (Jan: 31 * day, Feb : 28 * day, March : 31 * day, April : 30 * day, Maj : 31 * day, June : 30 * day, Jule : 31 * day, Aug: 31 * day, September: 30 * day, October : 31 * day, November : 30 * day, December : 30 * day)

let number = (21 * age) + (months.0) + (9 * day) + (6 * hour) + (31 * minute)
print(number)

// узнать в каком квартале родился и вывести на экран

let mothn = 11
let date = 9

if mothn >= 1 && mothn <= 3 {
    print("HES BORN IF FIRST Q")
} else if mothn >= 4 && mothn <= 6 {
    print("Hes BORN IN SECAND q")
} else if mothn >= 7 && mothn <= 9 {
    print("His born in 3q")
}else if mothn >= 10 && mothn <= 12{
    print("HIS BORN IN LAST Q")
}

//узнать какая из ячеек на шахматной доске белая, а какая черна

let doska = (x : 3, y : 8)
if (doska.x + doska.y) % 2 == 0 {
    print("Kletka is white")
} else {
    print("Kletka is black")
}
