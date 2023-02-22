# FUNCIONES

# def nombre():
#   print("David")

# nombre()


# def mifuncion():
#   print("Nombre")
#   print("Mas lineas")
  
#   for i in range(1, 6):
#     print(i)


# print("Antes")

# mifuncion()

# print("Despues")


# Parametros

# def mifuncion(nombre):
#   print("Hola", nombre)


# def suma(a, b):
#   print(a + b)


# mifuncion("David")
# suma(5, 4) 

# def matematicas(a, b):
#   def suma(a, b):
#     print(a + b)
    
#   def resta(a, b):
#     print(a - b)
    
#   suma(a, b)
#   resta(a, b)
  
# matematicas(5, 3)



# *args

# def suma(*args):
#     resultado = 0
    
#     for arg in args:
#       resultado += arg
      
#     print(resultado)

# suma(4,5,6,7,7,4,3,5)

# **kwargs

# def suma(**kwargs):
#     for key, value in kwargs.items():
#       print(key, "=", value)
      
# suma(a = "piso", b = "rojo")



# def suma(**kwargs):
#   if kwargs['coche']  == 'bonito':
#     print("Tu coche es bonito")
      
# suma(coche='bonito')


# def suma(**kwargs):
#   if 'coche' in kwargs and ['coche']  == 'bonito':
#     print("Tu coche es bonito")
      
# suma(coche='bonito')




# return

# def suma(a,b):
#   return a + b

# result = suma(2,4)
# print(result)


def opera(a,b):
  return a + b, a - b,a * b,a / b,

suma, resta, multi, divi= opera(2,4)
print(suma)
print(resta)
print(multi)
print(divi)