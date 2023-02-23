# Introducción a la biblioteca estándar de Python y funciones Built-in

# import _thread
# import time

# def horaActual(nombre_thread, tiemp_de_espera):
#   count = 0
#   while count < 5:
#     time.sleep(tiemp_de_espera)
#     count += 1
#     print(f"Hilo: {nombre_thread} - {time.ctime(time.time())}")

# _thread.start_new_thread(horaActual, ("thread_uno", 1))
# _thread.start_new_thread(horaActual, ("thread_dos", 3))

# # time.sleep(1)
# while True:
#   pass

# import logging


# logging.basicConfig(level=logging.DEBUG)
# logging.debug("pruebas de debug")
# logging.info("Arrancando Programa")
# logging.warning("hace calor")
# logging.error("test")
# logging.critical("adios")

# numeros = [1,2,3,4,5,6,7,8,9,10]

# def mifuncion(x):
#   if x %2 == 0:
#     return True
#   return False


# result = filter(lambda x: x %2 == 0, numeros)
# print(list(result))
# result = filter(mifuncion, numeros)
# print(list(result))


# from getpass import getpass

# user = input("Username: ")
# passwd = getpass("passwd: ")

# print(user, passwd)



secreto = 50

valor = 0

while valor != secreto:
  valor = int(input("Introduce un numero: "))
  
  if valor > secreto:
    print("My alto")
    continue
  
  if valor < secreto:
    print("Muy bajo")
    continue
  

print("Acertaste!")
  
  