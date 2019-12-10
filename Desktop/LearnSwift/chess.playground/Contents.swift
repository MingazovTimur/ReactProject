import UIKit

enum figures {
    enum colour: String {
        case white  = "White"
        case black  = "Black"
    }
    enum name: String {
        case king   = "King"
        case queen  = "Queen"
        case bishop = "Bishop"
        case knight = "Knight"
        case rook   = "Rook"
        case pawn   = "Pawn"
    }
    enum horPosition: Character {
        case a = "A"
        case b = "B"
        case c = "C"
        case d = "D"
        case e = "E"
        case f = "F"
        case g = "G"
        case h = "H"
    }
    enum vertPostion: Int {
        case one   = 1
        case two   = 2
        case three = 3
        case four  = 4
        case five  = 5
        case six   = 6
        case seven = 7
        case eight = 8
    }
}

typealias Chess = (colour: figures.colour, name: figures.name, HorPos: figures.horPosition, VerPos: figures.vertPostion)

let whiteKing  = Chess(.white, .king,  .e, .five)
let blackQueen = Chess(.black, .queen, .e, .six)

let realFigure = [whiteKing, blackQueen]

for i in realFigure {
    print("Figure \(i.colour.rawValue) \(i.name.rawValue) on the position  \(i.HorPos.rawValue) \(i.VerPos.rawValue)")
}

let whiteCell = "\u{25a0}"
let blackCell = "\u{25a1}"
let whiteKingFigure = "\u{2654}"
let blackQueenFigure = "\u{265b}"
