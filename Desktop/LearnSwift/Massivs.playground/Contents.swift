let constArray = ["a" , "b" , "c" , "d"]

constArray.count

var array = [String] ()

if array.count == 0 {

}

array += constArray

array += ["e"]

array.append("f")


var array2 = array

array
array2

array[0] = "LEL"

array2


array

array.insert("---->", at: 1)

array

array.remove(at: 1)

array


let test  = [Int](repeating: 100, count: 10)
let money = [100, 1, 5, 20, 1, 50, 1, 1, 20]

var sum = 0

for i in 0..<money.count {
    print("index \(i) value = \(money[i])")
    sum += money[i]
}

sum = 0
// Но можно сделать ещё проще, просто создав цикл такого формата

var index = 0
for i in money {
    print("Index \(index) , value = \(i)")
    sum += i
    index += 1
}

sum


for (ind, val) in money.enumerated() {
    print("index = \(ind) , value = \(val)")
}
