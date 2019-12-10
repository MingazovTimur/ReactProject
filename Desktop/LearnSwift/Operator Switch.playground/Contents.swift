var age = 10
var name = "Alex"

let tuple = (name, age)

switch tuple {
case("Alex", let number) where number > 9 && number < 21:
    print("hi young Alex")
case("Alex", 60):
    print("hi Alex 60")
case("Alex", 55):
    print("hi Alex 55")
default: break
}

let point = (5,-5)

switch point {
case let (_,y) where y < 0:
    print(" y меньше нуля ")
default:
    print(" у больше нуля ")

}

let array :[CustomStringConvertible] = [5, 5.4, Float(5.4)]

switch array[0] {
case _ as Int:
    print("Int")
case _ as Float:
    print("Float")
case _ as Double:
    print("Double")
default: break
}


