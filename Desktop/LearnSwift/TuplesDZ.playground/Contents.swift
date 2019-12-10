let statTimur = (otzhimaniya: 24, prisedaniya: 75, podtyagivaniya: 12)

print(statTimur.otzhimaniya, statTimur.prisedaniya, statTimur.podtyagivaniya)
print("Otzhimaniya \(statTimur.0)")
print("Prisedaniya \(statTimur.prisedaniya)")
print("Podtyagivanya \(statTimur.2)")

var statLiana = (otzhimaniya: 2, prisedaniya: 200, podtyagivaniya: 0)

//statLiana.otzhimaniya = statTimur.otzhimaniya
//statLiana.prisedaniya = statTimur.prisedaniya
//statLiana.podtyagivaniya = statTimur.podtyagivaniya

let raznica = (otzhimaniya:statTimur.0-statLiana.0, prisedaniya: statTimur.1-statLiana.1, podtyagivaniya: statTimur.2-statLiana.2)

print("Raznica mejdu Timurom&Lianoy: otzhimaniya \(raznica.0) prisedaniya \(raznica.prisedaniya) podtyagivaniya \(raznica.2)")
