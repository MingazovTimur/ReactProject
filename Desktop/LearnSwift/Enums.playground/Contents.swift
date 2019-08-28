// speed value = meters in hour
enum Actions {
    case Run(meters:Int, speed:Int)
    case Walk(meters: Int)
    case Turn(Directions: Directions)
    case Stop
    
    enum Directions: String {
        case Left  = "Left!"
        case Right = "Right!"
    }
}



var action = Actions.Run(meters: 10, speed: 2)
action = .Stop
action = .Turn(Directions: .Left)
action = .Walk(meters: 102)
action = .Run(meters: 21, speed: 3)
action = .Turn(Directions: .Right)
switch action {
case .Stop:
    print("Stop")
//case .Walk(let meters): print("Proshel \(meters) metrov")
case .Walk(let meters) where meters > 100:
    print("Proshel dlinnuyu progulku v \(meters) metrov")
case .Walk(let meters):
    print("Proshel korotkuyu progulku v \(meters) metrov")
case .Run(let m, let s):
    print("Bezhit \(m) meterov so skorostyu \(s)")
case .Turn(let dir) where dir == .Left:
    print("Povorot nalevo")
case .Turn(let dir) where dir == .Right:
    print("Povorot napravo")
default: break
}

print(Actions.Directions.Left.rawValue)


//domashka
//pervoe zadanie priblijennoe k realnosti v novom playgrounde
