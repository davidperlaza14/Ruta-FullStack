# Esta es la sexta sesión, donde veremos una introducción sobre la programación orientada a objetos, sus métodos y atributos.

# class Dino:
#   encendido = True
  
  
#   def enciende():
#     pass
  
# d1 = Dino()
# d1.encendido = False
# print(d1.encendido)



# class Dino:
#   _encendido = True
  
#   def enciende(self):
#     self._encendido = True
    
#   def apaga(self):
#     self._encendido = False
    
#   def isEncendido(self):
#     return self._encendido
    
  
  
# d1 = Dino()
# d1.apaga()
# print(d1.isEncendido())

# ==========================
# CLASES ESTATICAS

# class Estatica:
#   numero = 1
  
#   def incrementa():
#     Estatica.numero += 1
    

# Estatica.incrementa()
# print(Estatica.numero)

# Estatica.incrementa()
# print(Estatica.numero)

# Estatica.incrementa()
# print(Estatica.numero)

# Estatica.incrementa()
# print(Estatica.numero)


# ============================


# class Juguete:
#   _encendido = True
  
#   def enciende(self):
#     print("Enciende el aparato")
#     self._encendido = True
    
#   def apaga(self):
#     print("Apaga el aparato")
#     self._encendido = False
    
#   def isEncendido(self):
#     return self._encendido
  

# class Potato(Juguete):  
#   def quitarOreja(self):
#     pass
  
  # def ponerOreja(self):
  #   pass
  
  
# class Dino(Juguete):
#   color = None
#   nombre= None
  
#   def __init__(self, nombre):
#     self.color = "VERDE"
#     self.nombre = nombre
#     # print("Estoy en el constructor")
  
#   def __del__(self):
#     print("Estoy en el destructor", self.__class__)
    
#   def verEscamas(self):
#     pass
  
# p = Potato()
# p.enciende()
# print(p.isEncendido())
# p.apaga()
# print(p.isEncendido())


# p = Dino("Minidino")

# print(p.color)
# print(p.nombre)
# del(p)
# p.enciende()
# print(p.isEncendido())
# p.apaga()
# print(p.isEncendido())


# class Juguete:
#   _encendido = True
  
#   def __init__(self, x):
#     print("Estoy en la clase Juguete, en su constructor", x)
  
#   def enciende(self):
#     print("Enciende el aparato")
#     self._encendido = True
    
#   def apaga(self):
#     print("Apaga el aparato")
#     self._encendido = False
    
#   def isEncendido(self):
#     return self._encendido
    
#   def ponerOreja(self):
#     pass
  
  
# class Dino(Juguete):
#   color = None
#   nombre= None
  
#   def __init__(self, nombre):
#     super().__init__(nombre)
#     print("Estoy en el constructor de la clase Dino()")
    
#   def verEscamas(self):
#     pass

# p = Dino("Minidino")

# print(p.color)
# print(p.nombre)
# del(p)


# Clase abstractas

# from abc import ABC, abstractclassmethod

# class Animal(ABC):
#   @abstractclassmethod
#   def sonido(self):
#     pass

# class Perro(Animal):
#   def sonido(self):
#     print("Guao")
    
# class Gato(Animal):
#   def sonido(self):
#     print("MIao")
    
    
# p = Perro()
# p.sonido()

# p = Gato()
# p.sonido()


# class Coche:
#   motor = Motor()
#   carroceria = Ruedas()

# class Motor:
#   pass

# class Carroceria:
#   pass

# class Ventanas:
#   pass

