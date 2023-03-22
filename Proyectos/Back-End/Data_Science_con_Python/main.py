import pandas as pd
from string import ascii_uppercase as alfabeto
import pickle
todas_tablas = pd.read_html('https://en.wikipedia.org/wiki/2022_FIFA_World_Cup')


# print(todas_tablas[9].columns[1])
dict_tablas = {}
for letra, i in zip(alfabeto, range(9, 65, 7)):
  df = todas_tablas[i]
  df.rename(columns={df.columns[1]:'Team'}, inplace=True)
  df.pop('Qualification')
  dict_tablas[f'Grupo {letra}'] = df
print(dict_tablas['Grupo H'])

# with open('dict_table.txt', 'wb') as output: 
#   pickle.dump(dict_tablas, output)
