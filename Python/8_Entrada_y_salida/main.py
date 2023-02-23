"""  
Descripción:
Esta es la octava sesión, donde veremos cómo gestionar las entradas y salidas de un programa.

Puntos clave

- Formateo de una cadena

- Representaciones textuales de una clase

- Métodos en las cadenas de texto

- Manipulación de ficheros
"""


# - Formateo de una cadena

# numero = 5
# texto = "David"
# otro = 1.3

# print("El numero es %d  y el texto es %s y tiene %.2f" %(numero, texto, otro) )


# print("El numero es {}  y el texto es {} y tiene {}".format(numero, texto, otro))

# txt = f"El numero es {numero}  y el texto es {texto} y tiene {otro}"
# print(txt)

# print(type(numero))

# numtxt = str(numero)
# print(type(numtxt))


# print(repr(numtxt))
# print(numtxt)


# - Representaciones textuales de una clase

# class Juguete:
#   nombre = ""
#   precio = 0.0
  
#   def __init__(self, nombre, precio):
#     self.nombre = nombre
#     self.precio = precio
    
#   def __str__(self):
#     return f" Mi nombre es {self.nombre}  y mi precio {self.precio}"
  
# J1 = Juguete("POTATO", 15.3)
# J2 = Juguete("DINO", 10.6)

# print(J1)
# print(J2)
  
# import pprint

# pprint.pprint(dir(''))

# - Métodos en las cadenas de texto

# cadena = "     en un lugar de la manchA       "
# numero = '5a'

# print(cadena.capitalize())
# print(cadena.title())
# print(cadena.count('a'))
# print(cadena.upper())
# print(cadena.lower())
# print(numero.isdigit())
# print(numero.isalnum())
# print(cadena)
# print(cadena.strip())
# print(cadena.lstrip())
# print(cadena.rstrip())
# print(cadena.split())
# print(cadena.split('en'))
# print(cadena.endswith('en'))
# print(cadena.endswith(' '))


# - Manipulación de ficheros

# f = open('/etc/passwd', 'r')
# datos = f.read(32)
# datos = f.readline()
# datos = f.readlines()
# f.close()
# print(datos)


# r: lectura
# a: append
# w: write
# x: create

# t: text
# b: binary

# +


# def main():
  # '''Abre el archivo /etc/passwd, lee todas las líneas del archivo y las imprime
  
  # '''
#   usuarios = listaUsuarios()
#   print(usuarios)
  
  
# def listaUsuarios():
#   f = open('/etc/passwd', 'r')
#   datos = f.readlines()
#   f.close()
  
  
#   for linea in datos:
#     print(linea)
    
# if __name__ == "__main__":
#   main()




# f = open('mifichero.txt', 'a')
# f.write("datos\n")
# f.write("datos2\n")
# f.close()

# def escribe
# f = open('mifichero.txt', 'w')
# f.write("datos\n")
# f.write("datos2\n")
# f.close()



import pickle

class Juguete:
  nombre = ""
  precio = 0.0
  
  def __init__(self, nombre, precio):
    self.nombre = nombre
    self.precio = precio
  
  def getNombre(self):
    return self.nombre
    
  # def __str__(self):
  #   return f" Mi nombre es {self.nombre}  y mi precio {self.precio}"
  
f = open('datos.bin', 'rb')
potato = pickle.load(f)
f.close()


print(type(potato))
print(potato.getNombre(), 'precio: ', potato.precio)
  
  
# J1 = Juguete("POTATO", 15.3)
# f = open('datos.bin', 'wb')
# pickle.dump(J1, f)
# f.close()
# print(J1.getNombre())

# J2 = Juguete("DINO", 10.6)