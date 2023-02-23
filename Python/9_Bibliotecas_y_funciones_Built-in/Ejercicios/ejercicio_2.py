"""Enunciado del ejercicio:

En este segundo ejercicio, tenéis que crear una aplicación que obtendrá los elementos impares de una lista pasada por parámetro con filter y realizará una suma de todos estos elementos obtenidos mediante reduce."""

from functools import reduce

def Ejercicio2(lista):
  result = list(filter((lambda x: x % 2), lista))
  print(result)
  result = reduce((lambda x, y: x + y), result)
  print(result)
  

lista = list(range(100))

Ejercicio2(lista)