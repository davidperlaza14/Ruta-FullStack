

class Vehiculo:
  # La clase Vehiculo es un modelo para crear objetos. Un objeto creado a partir de la clase Vehiculo
# tendrá los atributos (color, ruedas, puertas) y los métodos (__init__ y __str__)
  
  def __init__(self, color, ruedas, puertas):
    self.color = color
    self.ruedas = ruedas
    self.puertas = puertas
  
  def __str__(self):
    return "Color {}, {} ruedas".format(self.color, self.ruedas, self.puertas)
    
class Coche(Vehiculo):
  def __init__(self, color, ruedas, puertas,velocidad, cilindrada):
    self.color = color
    self.ruedas = ruedas
    self.puertas = puertas
    self.velocidad = velocidad
    self.cilindrada = cilindrada
    
  def __str__(self):
    return "Color {}, {}km/h, {} ruedas, {} puertas, {}cc".format(self.color, self.velocidad, self.ruedas, self.puertas, self.cilindrada)
    

# Creando un nuevo objeto de la clase Coche, e imprimiéndolo.
c = Coche("Negro", 4, 4, 432, 1200)
print(c)