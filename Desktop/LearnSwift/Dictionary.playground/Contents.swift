//part 1
// Создать дикшнари-журнал с именами студентов(ключи) и их оценками за кр (значения)
var jurnal = ["Timur" : 5, "Liana" : 4, "Ruslan" : 3, "Maryam" : 4, "Vadim" : 4]

//Поменял оценки ученикам, которые пересдали
//Видим в консоли оценки, с которым они исправили (их значения)
jurnal.updateValue( 5, forKey: "Liana")
jurnal.updateValue( 5, forKey: "Maryam")

//Пришли 2 новых стундента Artem и Nastya нужно добавить их в дикшнари и их оценки за к/р

jurnal["Artem"] = 2
jurnal["Nastya"] = 5

jurnal

// Ушли двоё студентов, Artem и Ruslan
// видим в консоли их значения, оценки за к/р
jurnal.removeValue(forKey: "Artem")
jurnal.removeValue(forKey: "Ruslan")


jurnal

//Найти сумму всех оценок в группе

var sum = 0

for (name, ocenka) in jurnal {
    sum += ocenka
    print("\(name) получил(a) по контрольной работе \(ocenka)")
}

// Найти среднюю оценку за кр по группе

var averageSum :Double = 0

for (_, value) in jurnal {
    averageSum += Double(value) / Double(jurnal.count)
}
print("Средняя оценка по контрольной работе = \(averageSum)")


//part 2
//Создать дикшнари с названями месяцев и кол-вом дней в них

let monthes = ["January" : 31, "February" : 28, "March" : 31, "April" :30, "May" : 31, "June" : 30, "Jule" : 31, "August" :31, "September" : 30, "October" : 31, "November" : 30, "December" : 31]

//Вывести дикшнари с помощью тьюплеса в цикле
for (name, days) in monthes {
    print("In \(name) \(days) days")
}
//
print()
print()
print()


//Вывести дикшнари используя цикл ключей дикшнари
for i in monthes.keys {
    print("In \(i) \(monthes[i]!) days")
}

//part 3
//Создать дикшнари с помощью цикла в цикле, где ключ будет координата клетки в шахматной доске, а значение булевое, где тру - белая клетка, фальш - черная

