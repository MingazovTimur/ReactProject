//Part 1
//Создать строку с текстом больше 200 символов и вывести гласные, согласные цифры и остальное с помощью свитча в цикле

let stroka = "Hello, My name is Timur i'm 21 years old and i'm learn how to programming in swift with help Alex Skutarenko lessons. This time i'm working with notebooks and computers, love computer games, have dog Torin and very very good life."
stroka.count


var glasn = 0
var soglasn = 0
var cifr = 0
var symbol = 0


for i in stroka.lowercased() {
    
    switch i {
    case "a", "e", "i", "o", "u" : glasn += 1
    case "q", "w", "r", "t",  "y", "p", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m" : soglasn += 1
    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" : cifr += 1
    default: symbol += 1
    }
}

print("Glasnie in text = \(glasn)")
print("Soglasn in text = \(soglasn)")
print("Cifr in text = \(cifr)")
print("Symbols in text = \(symbol)")


//Part 2
//Создать свитч который выводит принимать возраст человека и выводить описание его возраста жизни

var age = 21
var name = "Timur"

var tuple = (name, age)

switch tuple {
case (_, 1...7):
    print("\(name) child now")
case (_, 7...16):
    print("\(name) podrostok now")
case (_, 21):
    print("\(name) brosil geroin")
case (_, 17...26):
    print("\(name) vizhivaet")
default:
    print("\(name) age not in identify")
}

//part 3
//Создать студента (фамилия имя отчество) и если его имя начинается на О или А, то обращаться к нему по имени, если же отчество начинается с В или Д то обращаться по отчеству, если же фамилия начинается на З или на Г, то обращаться по фамилии, если же ничего не совпадает, то обращаться по ФИО

let namee = "Liana"
let lastname = "Sirazetdinova"
let prename = "Dinarovna"

let fullName = (namee, lastname, prename)

switch fullName {
case let (a, _, _) where a.hasPrefix("A") || a.hasPrefix("O") == true:
    print("\(namee) hello")
case let (_, _, c) where c.hasPrefix("V") || c.hasPrefix("Q") == true:
    print("Hello \(prename)")
case let (_, b, _) where b.hasPrefix("Z") || b.hasPrefix("G") == true:
    print("Hello \(lastname)")
default:
    print("Hello \(lastname) \(namee) \(prename)")
}

// Морской boy

let ship1 = ("a", 5)

let point = ("a", 5)

        switch point {
        case ("a", 3), ("a", 4), ("b", 5):
            print("Ranil")
        case ("a", 5):
            print("ybil")
        default:
            print("mimo")
        }


