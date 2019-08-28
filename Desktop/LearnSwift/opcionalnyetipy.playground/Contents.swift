
var apples :Int? = 5


apples = 2

/*if apples == nil {
    print("nil apples")
} else {
   let a = apples! + 2
    print(a)
}
*/


if var number = apples {
    number = number + 2
    print(number)
} else {
      print("nil apples")
}

let age = "60"

var ageInt = Int(age)


var key :Int? = 2


if let number2 = key {
    print("key = \(number2)")
} else {
    print("key  = nil")
}


let one = "50"
let two = "30aaa"
let three :Int? = 5
let four :Int? = 0
let fife :Int! = 10


// force unwrapping with string value
if Int(one)! != nil {
    print("one = \(Int(one)!)")
} else {
    print("one = nil")
}
let IntOne = Int(one)!


//optinial binding with string value
if var checkTwo = Int(two) {
    print("two = \(Int(two))")
} else {
    print("two = nil")
}


//force unwrapping with int? value
if three == nil {
    print("three = nil")
} else {
    print("three = \(three!)")
}

let IntThree = three!

//optinial binding with int? value

if var checkFour = four {
    print("Four = \(four!)")
} else {
    print("Four = nil")
}

let IntFour = four!

if fife != nil {
    print("fife = \(fife!)")
} else {
    print("fife = nil")
}
let IntFife = fife!

var SummInt = (IntOne + IntThree + IntFour + IntFife)
print(SummInt)

var value :Int! = nil
var emae : (Message: String?, ErrorMessage: String?)
emae.Message = "nice"
emae.ErrorMessage = "shiet"
value = 301
if value > 200 && value <= 300 {
    print(emae.Message)
} else {
    print("Oh my its \(emae.ErrorMessage!)")
}
