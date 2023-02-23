""" Enunciado del ejercicio:

En este ejercicio, tendréis que crear un archivo py donde creéis un archivo txt, lo abráis y escribáis dentro del archivo. Para ello, tendréis que acceder dos veces al archivo creado."""

file = open('mi_primer_arvhivo.txt', 'w')
file.write('¡Primer archivo!\n')
file.close()


file = open('mi_primer_arvhivo.txt', 'r+')
file.readline()
file.write('Esta es la segunda vez que escribo.\n')

file.seek(0)
print(file.read())
file.close()