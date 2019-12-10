var str1 = "wow"

str1.isEmpty

str1 = "a"

str1.isEmpty

let char1 :Character = "x"

str1.append(char1)

let heart = "\u{1F496}"

var fun :Character = "ы"

fun = "ы\u{301}"


let a = "what is this? --> \(fun)"

a.count

if a == "aa" {
    
} else {
    print("not equal")
}

a.hasPrefix("what")
a.hasSuffix("ы\u{301}")
