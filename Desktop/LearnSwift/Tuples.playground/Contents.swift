/*let d = true

if d {
    print("hi!")
}else{
    print("bye!")
}
*/
//Tuples

let exampleTuple = (1, "Timur", "Programmer", 99.99)
let (howmuch, name, whois, level) = exampleTuple
howmuch
name
whois
level

//print("This is the \(howmuch) of the best \(whois) \(name) level \(level)")

exampleTuple.0
exampleTuple.1

let tuple = (index:1, phrase:"Hello", registred: true, latency: 2.4)
tuple.phrase
tuple.index
tuple.latency




let a = (x:1,y:2)
var b = (x:4,y:7)
b=a
print("\(b.x) \(b.y)")
