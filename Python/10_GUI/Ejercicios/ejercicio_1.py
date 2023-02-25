""" Enunciado del ejercicio:

En este ejercicio tenéis que crear una lista de RadioButton que muestre la opción que se ha seleccionado y que contenga un botón de reinicio para que deje todo como al principio.

Al principio no tiene que haber una opción seleccionada."""

from tkinter import *

def seleccionar():
  '''El widget Radiobutton es un widget estándar de Tkinter que se utiliza para implementar una de muchas
  selecciones
  
  '''
  monitor.config(text="{}".format(opcion.get()))
  
def reset():
  opcion.set(None)
  monitor.config(text="")
  
  
# El siguiente código  está creando una GUI con una etiqueta y cuatro botones de opción.
root = Tk()
opcion = StringVar()
opcion.set(None)
Radiobutton(root, text="Click1", variable=opcion,
            value="Click1", command=seleccionar).pack(anchor=W)

Radiobutton(root, text="Click2", variable=opcion,
            value="Click2", command=seleccionar).pack(anchor=W)

Radiobutton(root, text="Click3", variable=opcion,
            value="Click3", command=seleccionar).pack(anchor=W)

Radiobutton(root, text="Click4", variable=opcion,
            value="Click4", command=seleccionar).pack(anchor=W)

monitor = Label(root)
monitor.pack()
Button(root, text="Reiniciar", command=reset).pack()



root.mainloop()