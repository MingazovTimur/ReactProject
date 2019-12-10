let year = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 32]

for i in year {
    print(i)
}

let names = ["January" , "February", "March", "April", "May", "June", "July", "August", "Septembet", "October", "November", "December"]


for y in names{
    print(y)
}

//Создаем массив тьюплов, где будет название месяца + кол-во дней и выводим название месяца и кол-во дней в нем, а так же делаем это но наоборот

let monthes = [(names[0], year[0]), (names[1], year[1]),(names[2], year[2]),(names[3], year[3]),(names[4], year[4]),(names[5], year[5]),(names[6], year[6]), (names[7], year[7]), (names[8], year[8]), (names[9], year[9]), (names[10], year[10]), (names[11], year[11]) ]

for y in monthes {
    print("\(y.0) = \(y.1)")
}

var date = monthes.count

for _ in monthes {
   date >= 0; date -= 1
    print("\(monthes[date])")
}


// посчитать кол-во дней от начала года до дня рождения, используя массив с кол-вом дней в месяцах
let day = 9
let month = 2
var leftdays = 0

for Count in 1...year.count {
    if month > Count {
        leftdays += year[Count - 1]
    }
}
leftdays += day - 1

// кароуче задание намбер два

let a = "12"
let b = "que"
let c = "8"
let d = "5"
let e = "euy"

var array = [Int(a), Int(b), Int(c), Int(d), Int(e)]

//форсе анврэппинг

var sum = 0

for i in 0...array.count - 1 {
    array[i] != nil ? (sum += array[i]!) : (sum += 0)

}

print("Sums all of this is in force unwrapping \(sum)")


//optional binding
var sum1 = 0

for index in array {
    if let str = index {
        sum1 += str
    }
}
print("Sums all of this in optional binding \(sum1)")

//и ещё один более простой способ форс анвраппинга

var sum2 = 0

for index in array {
    if index != nil {
        sum2 += index!
    }
}
print("vot eta rezultat prostogo orce unwrapping = \(sum2)")


//posledniy sposob s ??

var sum4 = 0

for index in array{
    let c = index ?? 0
    sum4 += c
}

print("Последнее задание с ?? = \(sum4)")


// последнее задание, вывести чэректеры из строки алфавита в отдельный массив, чтобы значения были задом наперед
let alhabet = "abcdefghijklmnopqrstuvwxyz"
var array1 = [String] ()
    
for char in alhabet {
    array1.insert(String(char), at: 0)
}
print(array1)
