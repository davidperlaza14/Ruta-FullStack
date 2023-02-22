from operaciones import *

a, b, c, d = (3, 5, 2, 2)

print("{} + {} = {}".format(a, b, suma(a, b)))
print("{} - {} = {}".format(b, d, resta(b, d)))
print("{} * {} = {}".format(b, b, multiplicar(b, b)))
print("{} / {} = {}".format(a, c, division(a, c)))