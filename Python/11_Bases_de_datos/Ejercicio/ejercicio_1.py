""" Enunciado del ejercicio:

En este ejercicio tendréis que crear una tabla llamada Alumnos que constará de tres columnas: la columna id de tipo entero, la columna nombre que será de tipo texto y la columna apellido que también será de tipo texto.

Una vez creada la tabla, tenéis que insertarle datos, como mínimo tenéis que insertar 8 alumnos a la tabla.

Por último, tienes que realizar una búsqueda de un alumno por nombre y mostrar los datos por consola."""

import sqlite3 

db_conn = sqlite3.connect('ejer1.db')
db_cur = db_conn.cursor()

db_cur.execute("CREATE TABLE Alumnos2(Id INT, Nombre TEXT, Apellido TEXT)")

db_cur.execute("INSERT INTO Alumnos2 VALUES(1, 'Yeison', 'Montano')")
db_cur.execute("INSERT INTO Alumnos2 VALUES(1, 'Victor', 'Montano')")
db_cur.execute("INSERT INTO Alumnos2 VALUES(1, 'Cindy', 'Perlaza')")
db_cur.execute("INSERT INTO Alumnos2 VALUES(1, 'David', 'Valencia')")
db_cur.execute("INSERT INTO Alumnos2 VALUES(1, 'Ivan', 'Perlaza')")
db_cur.execute("INSERT INTO Alumnos2 VALUES(1, 'Elena', 'Giron')")
db_cur.execute("INSERT INTO Alumnos2 VALUES(1, 'Alberto', 'Montano')")
db_cur.execute("INSERT INTO Alumnos2 VALUES(1, 'Maria', 'Grueso')")

db_conn.commit()

db_cur.execute("SELECT * FROM Alumnos2 WHERE Nombre ='David'")

filas = db_cur.fetchall()

print(filas)

db_conn.close()