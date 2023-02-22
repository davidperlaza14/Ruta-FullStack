import time

hora = time.strftime('%H')
minutos = time.strftime('%M')
print("Son las", hora + ":" + minutos)


if int(hora) >= 19:
  print("Es hora de irse a casa")

else:
  print("Quedan {} horas y {} minutos para irnos para la casa".format(18- int(hora), 59-int(minutos)))