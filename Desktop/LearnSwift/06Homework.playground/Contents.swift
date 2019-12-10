
//creating constants
let number1 = "2"
let number2 = "wow"
let number3 = "5qe"
let number4 = "13"
let number5 = "-3"
//создаем переменную в которую будем выводить исходные данные
var output = ""
// и переменную с общей суммой
var sum = 0

//Проверяем и вводим данные
var n1 = Int(number1) ?? 0
var n2 = Int(number2) ?? 0
var n3 = Int(number3) ?? 0
var n4 = Int(number4) ?? 0
var n5 = Int(number5) ?? 0

sum = n1 + n2 + n3 + n4 + n5
//интерполяция строк
output = "\(n1) + \(n2) + \(n3) + \(n4) + \(n5) = \(sum)"
print(output)


//теперь сделаем так чтобы если значение было нил, то выходил нил, а не 0

var string1 = Int(number1) != nil ? number1 : "nil"
var string2 = Int(number2) != nil ? number2 : "nil"
var string3 = Int(number3) != nil ? number3 : "nil"
var string4 = Int(number4) != nil ? number4 : "nil"
var string5 = Int(number5) != nil ? number5 : "nil"

var output2 = string1 + " + " + string2 + " + " + string3 + " + " + string4 + " + " + string5 + " = " + "\(sum)"
print(output2)


var emoji1 :Character = "\u{1F436}"
var emoji2 :Character = "\u{1F435}"
var emoji3 :Character = "\u{1F371}"
var emoji4 :Character = "\u{1F369}"
var emoji5 :Character = "\u{1F440}"

var MyFavoriteEmoji = "\u{1F436} \u{1F435} \u{1F371} \u{1F369} \u{1F440}"

MyFavoriteEmoji.count

//Из вышенаписаанного можно понять, что чэректоры (символы записанные в юникоде) считаются за 1 символ

// poslednee zadanie
let alphabet          = "abcdefgijklmnopqrstuvwxyz"
let symbol :Character = "e"
var count = 0

for levelnow in alphabet {
    count += 1
    if levelnow == symbol {
        print("\(symbol) in alphabet is \(count) fo count")
    }
}

//задание было посчитать порядковый номер конкретной буквы в алфавите, собсна с подсказочкой, мы справились
