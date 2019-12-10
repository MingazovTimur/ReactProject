//DRY

func calculateMoney (wallet:[Int], Type:Int? = nil) -> (Sum:Int, Count: Int) {
    
    var sum = 0
    var count = 0
    
    for value in wallet {
        if (Type == nil) || //если Type = nil, то будет выполнятся подсчет всего, без ограничения по Type (|| - или (следующая строка)
            (value == Type!) { //Если Type не равен нилу, то будет выполнятся функция по Type, то есть считаться будут только те значения, которые заданы
        sum += value
        count += 1
        }
    }
    return (sum, count)
}

//Выше создана функция, ниже она используется с конкретным массивом и заданным тайпом

let wallet = [10, 10, 1000, 200, 1000, 5000, 100, 100]

let sotki = calculateMoney(wallet: wallet, Type: 100) //Type = 100 соответственно идет подсчет только соток
let full  = calculateMoney(wallet: wallet, Type: nil) //Type = nil, значит считаются все элементы массива, без фильтрации по Type



func sayHi () -> () {
    print("hi")
}

sayHi()

func doSomething(whatToDo :() -> ()) {
    whatToDo()
}

doSomething(whatToDo: sayHi)
doSomething(whatToDo: sayHi)


//domashka 1
//создать 3 функции с различными юникодами внутри и вывести в одном принте

func monkey() -> String {   //создал функцию, которая возвращает эмодзи
    return "\u{1F435}"
}

func    dog() -> String {  //создал функцию, которая возвращает эмодзи
    return "\u{1F436}"
}

func    glaza() -> String {  //создал функцию, которая возвращает эмодзи
    return "\u{1F440}"
}


print("\(monkey()) looking at the \(monkey()) with such eyes \(glaza())")

//part2
//Шахматная доска, создать функцию, которая возвращает по координатам цвет клетки, черная или белая

func doska (Hor: String, Ver: Int) -> String {
    let abc = ["A" : 1, "B" : 2, "C" : 3, "D" : 4, "E" : 5, "F" : 6, "G" : 7, "H" : 8]
    if abc[Hor]! % 2 == Ver % 2 {
        return "Black"
    }
    return "White"
}

let color = doska(Hor: "H", Ver: 7)
print(color)



//part3
//Создайте функцию, которая принимает массив, а возвращает массив в обратном порядке. Можете создать еще одну, которая принимает последовательность и возвращает массив в обратном порядке. Чтобы не дублировать код, сделайте так, чтобы функция с последовательностью вызывала первую.

func naoborot (Array: [Int]) -> [Int] {
    var ishod = [Int] ()
    for i in Array {
        ishod.insert(i, at: 0)
    }
    return ishod
}

var array = [1, 2, 3]

let vivod = naoborot(Array: array)
print(vivod)


//3,2

func createArray (items: Int...) -> [Int] {
    return naoborot(Array: items)
}

var ar = createArray(items: 2, 1, 0)
print(ar)



//part 4
//Разберитесь с inout самостоятельно и выполните задание номер 3 так, чтобы функция не возвращала перевернутый массив, но меняла элементы в существующем. Что будет если убрать inout?

print("\(array) this is our array")

func reverse (array: inout [Int]) {
    for i in array {
        array.insert(i, at: 0)
    }
}
//4 задание неудачно


//5. Создайте функцию, которая принимает строку, убирает из нее все знаки препинания, делает все гласные большими буквами, согласные маленькими, а цифры меняет на соответствующие слова (9 -> nine и тд)

func cleaning (Stroka: String) -> (String){
    let complete = Stroka.lowercased()
    var newString = ""
    for char in complete {
        let i = String(char)
        switch i {
        case ",", ".", "?", "!", "(", ")":
            newString += ""
        case "a", "e", "u", "o", "i", "y":
            newString += i.uppercased()
        case "q", "w", "r", "t", "p", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m":
            newString += i
        case "9":
            newString += "nine"
        case "8":
            newString += "eight"
        case "7":
            newString += "seven"
        case "6":
            newString += "six"
        case "5":
            newString += "five"
        case "4":
            newString += "four"
        case "3":
            newString += "three"
        case "2":
            newString += "two"
        case "1":
            newString += "one"
        case "0":
            newString += "zero"
        default:
            newString += " "
        }
    }
    return newString
}


let text = "Black Sabbath were an English rock band, formed in Birmingham in 1968, by guitarist and main songwriter Tony Iommi, bassist and main lyricist Geezer Butler, drummer Bill Ward, and singer Ozzy Osbourne. Black Sabbath are often cited as pioneers of heavy metal music.[1] The band helped define the genre with releases such as Black Sabbath (1970), Paranoid (1970), and Master of Reality (1971). The band had multiple line-up changes, with Iommi being the only constant member throughout its history."

let cleanedText = cleaning(Stroka: text)

print(cleanedText)
