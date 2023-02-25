import tkinter
from tkinter import ttk

window = tkinter.Tk()

window.columnconfigure(0, weight=1)
window.columnconfigure(0, weight=3)


## Usuario
username_label = ttk.Label(window, text="Username:")
username_label.grid(column=0, row=0, sticky=tkinter.W, padx=5, pady=5)

username_entry = ttk.Entry(window)
username_entry.grid(column=1, row=0, sticky=tkinter.E, padx=5, pady=5)


password_label = ttk.Label(window, text="password:")
password_label.grid(column=0, row=1, sticky=tkinter.W, padx=5, pady=5)

password_entry = ttk.Entry(window, show="*")
password_entry.grid(column=1, row=1, sticky=tkinter.E, padx=5, pady=5)


## Boton
login_button = ttk.Button(window, text="login")
login_button.grid(column=1, row=3, sticky=tkinter.E, padx=5, pady=5)





window.mainloop()
























# window = tkinter.Tk()

# label1 = tkinter.Label(window, text="label1", bg="yellow", fg="blue")
# label1.pack(ipadx=45, ipady=15, fill='x')
# # label_saludo.pack(ipadx=30, ipady=30, expand=True)


# label2 = tkinter.Label(window, text="label2", bg="purple", fg="white")
# label2.pack(ipadx=45, ipady=15, fill='x')
# # label_adios.pack(fill='both', expand=True)

# label3= tkinter.Label(window, text="label3", bg="blue", fg="white")
# label3.pack(ipadx=45, ipady=15, fill='x')

# label4= tkinter.Label(window, text="label4", bg="red", fg="white")
# label4.pack(ipadx=50, ipady=15, side='left')

# label5= tkinter.Label(window, text="label5", bg="yellow", fg="black")
# label5.pack(ipadx=50, ipady=15, side='left')

# label6= tkinter.Label(window, text="label6", bg="green", fg="white")
# label6.pack(ipadx=50, ipady=15, side='left')
