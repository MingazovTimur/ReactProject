let number = [3, 4, 5, 6, 54, 61, 4, 1, 2, 3, 6, 7, 91, 2]

func filterArray(array: [Int], condition: (Int) -> Bool) -> [Int] {
    var result :[Int] = []
    for i in array {
        if condition(i) {
            result.append(i)
        }
    }
    return result
}

/*func ChetnieChisla(i: Int) -> Bool {
    return i % 2 == 0
}

filterArray(array: number, condition: ChetnieChisla)
*/


filterArray(array: number, condition: {(i: Int) -> Bool in
    return i % 2 == 0
})


let a =
filterArray(array: number, condition: {i in i % 3 == 0})


let a1 =
filterArray(array: number, condition: {$0 % 3 == 0})


let a2 =
filterArray(array: number) {$0 > 10}

let array = [1, 2, 3]
let a3 =
    filterArray(array: number) {i in
        for value
            in array {
            if value == i {
            return true
            }
        }
        return false
}


var dict = [Int:Bool]()

for value in array {
    dict[value] = true
}

dict

let a4 = filterArray(array: number){i in
    return dict[i] == true
}


// домашка
// создать функцию ничего не принимающую и не возвращающую, а так же создать клоужерс к этой функции, тоже ничего не принимающий и не возвращающий, в теле функции создать цикл от 1 до 10 с выводом значений от 1 до 10, после выхода из цикла вызывать клоужерс, где тоже был бы принт


func test (clouser: () -> ()){
    var sum = 0
    for i in 1...10 {
       sum += i
        print(i)
    }
    print("Сумма чисел от 1 до 10 = \(sum)")
    clouser()
}

test(clouser: {print("darova")})


//part2
//разобраться с sort, рассортировать один инт массив по нарастанию и убыванию

var intArray = [41, 2, 3, 5, 1, 31]
intArray.sorted(by: >)
intArray.sorted(by: <)

//part 3
//Написать функцию, которая принимает массив интов и клоужер и эта функция должна возвращать инт число, сам клоужер принимает 2 инта и возращает булевое в самой функции вы должны создать опшинал переменную и создать цикл, в этом цикле пройти по массиву интов, и сравнивать свою опшинал с каждым элементов этого массива способом передачи ее в клоужер, если возращает да, то значение опшинала вносим в массив, если нет, то пропускаем, возвращаем в итоге опшинал переменную, в первом случае вернуть МАКСИМАЛЬНОЕ значение, во втором случае вернуть МИНИМАЛЬНОЕ

let eeBoyArray = [1, 3, 5, 21, 77, 192]

func ValueInArray (Array: [Int], condition: (Int, Int?) -> (Bool)) -> Int? {
    var value :Int? = nil
    for i in Array {
        if condition(i, value) {
            value = i
        }
    }
    return value
}

//развернутая версия (нахождение большего элемента массива)
let maxValue =
ValueInArray(Array: eeBoyArray) { (a, b) -> (Bool) in
    if b == nil {
        return true
    }
    return a > b!
}


//По максимуму сокращенная версия (нахождение меньшего элемента массива) (отличие лишь в знаке сравнения)
let minValue =
    ValueInArray(Array: eeBoyArray) {$1 == nil || $0 < $1!}

// Тимур - ты гребаный гений
//4. Создайте произвольную строку. Преобразуйте ее в массив букв. Используя метод массивов sorted отсортируйте строку так, чтобы вначале шли гласные в алфавитном порядке, потом согласные, потом цифры, а потом символы

let stroka = "abcdiaduaytrwsdaweqesdasdd"

var arrayStrok = [String]()

for i in stroka {
    arrayStrok.append(String(i))
}

arrayStrok
func sort(s: String) -> Int{
    switch s.lowercased() {
    case "a", "e", "y", "u", "i", "o":
        return 1
    case "a"..."z":
        return 2
    default:
        return 3
    }
}


let sorted =
    arrayStrok.sorted{
        switch (sort(s: $0), sort(s: $1)){
        case let (x,y) where y > x: return true
        case let (x,y) where y < x: return false
        default: return $0.lowercased() <= $1.lowercased()
        }
}
