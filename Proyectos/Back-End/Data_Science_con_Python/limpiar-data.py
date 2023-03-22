import pandas as pd
# import sys

# Limpiando data
df_data_historica = pd.read_csv('fifa_worldcup_missing_data.csv')
df_fixture = pd.read_csv('fifa_worldcup_fixture.csv')
df_missing = pd.read_csv('fifa_worldcup_missing_data.csv')

# Limpiando df_fixture
df_fixture['home'] = df_fixture['home'].str.strip()
df_fixture['away'] = df_fixture['away'].str.strip()


""" Limpiando df_missing_data y  agregando a df_data_historica"""

# print(df_missing[df_missing['home'].isnull()])
df_data_historica = pd.concat([df_data_historica, df_missing], ignore_index=True)
df_data_historica.drop_duplicates(inplace=True)
df_data_historica.sort_values('year', inplace=True)
# print(df_data_historica)


"""Limpiando df_data_historica"""
index_eliminar = df_data_historica[df_data_historica['home'].str.contains('Sweden') & df_data_historica['away'].str.contains('Austria')]
# df_data_historica = df_data_historica.drop(index = index_eliminar, inplace=True) 

# print(df_data_historica[df_data_historica['score'].str.contains('[^\d-]')])

df_data_historica['home'] = df_data_historica['home'].str.strip()
df_data_historica['away'] = df_data_historica['away'].str.strip()

df_data_historica[['HomeGoals', 'AwayGoals']] = df_data_historica['score'].str.split('–', expand=True)
df_data_historica.drop('score', axis=1, inplace=True)

df_data_historica.rename(columns={'home':'HomeTeam', 'away':'AwayTeam', 'year':'Year'}, inplace=True)

print(df_data_historica.dtypes)