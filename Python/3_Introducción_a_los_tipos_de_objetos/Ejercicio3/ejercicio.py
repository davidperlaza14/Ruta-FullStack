peso = float(input("¿Cuál es tu peso en kg? "))
estatura = float(input("¿Cuál es tu estatura en metros?"))
imc = round((peso) /( estatura)**2, 2 )
print("Tu índice de masa corporal es " + str(imc))