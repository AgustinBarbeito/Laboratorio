
# 7) Imprimir el data frame escrito en el nuevo archivo .csv
# 8) Colocar en forma de tabla las filas 1, 5, 12, 36.
# 9) Imprimir una lista con los nombres de todas las columnas.
# 10) Imprimir los datos de una columna a elección.

import pandas as pd
df = pd.read_csv("compras-covid-2021-06-30.csv")


dfindex=df.set_index("id")
dfsinduplicados=dfindex.drop_duplicates()
dfsinvacio=dfsinduplicados.dropna()
df1=dfsinvacio.iloc[0:300]
i1=len(dfsinvacio)-201
i2=len(dfsinvacio)-1
df2=dfsinvacio.iloc[i1:i2]
dff=pd.concat([df1,df2])
print(dff)
print(df1.iloc[[1,5,12,29,36]])
print(list(dfsinvacio.columns))
print(dfsinvacio['oferente_razon_social'])