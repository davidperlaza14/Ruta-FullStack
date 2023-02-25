import sqlite3


def main():
  username= input("Nombre de usuario: ")
  password = input("Contrasena: ")
  
  if verifica_credenciales(username, password):
    print("Login correcto")
  
  else:
    print("Login incorrecto")
  
def verifica_credenciales(username, password):
  conn = sqlite3.connect('miaplicacion.db')
  cursor = conn.cursor()

  query = f"SELECT * FROM users WHERE username='{username}' AND passworrd='{password}'"

  rows = cursor.execute(query)
  data = rows.fetchone()
  print("data es", type(data))

  cursor.close()
  conn.close()
  
  if data == None:
    return False

  return True
  
  
if __name__ == "__main__":
  main()


# conn = sqlite3.connect('miaplicacion.db')
# cursor = conn.cursor()


# rows = cursor.execute('SELECT * FROM users WHERE username= "dstiven"')
# for row in rows:
#   print(row)




# cursor.close()
# conn.close()