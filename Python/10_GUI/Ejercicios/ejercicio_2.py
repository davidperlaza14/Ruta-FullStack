""" Enunciado del ejercicio:

En este segundo ejercicio, tendréis que crear una interfaz sencilla la cual debe de contener una lista de elementos seleccionables, también debe de tener un label con el texto que queráis."""

from tkinter import *

# Creación de un cuadro de lista con una etiqueta.
master = Tk()

elemento = StringVar()
listbox = Listbox(master)
for item in ["Pepe","Juan", "Perlaza", "Ivan", "Andres", "Yeison", "Victor", "Cindy", "Maria"]:listbox.insert(END, item)
listbox.pack()
label = Label(text="Algunos nombres")
label.pack()
master.mainloop()