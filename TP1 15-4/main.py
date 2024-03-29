# 1) Leer su archivo csv utilizado.
# 2) De ser posible, elegir una columna que pueda servir como índice y setearla como tal.
# 3) Eliminar las filas duplicadas
# 4) Eliminar las filas con valores que no sirven (espacios vacíos y "NaN")
# 5) Escribir un nuevo archivo .csv con las modificaciones realizadas
# 6) Colocar en forma de tabla, las primeras 3000 filas  y luego, las ultimas 2000.
# Si su archivo csv no tiene una cantidad de datos que cumpla lo pedido,
# la tabla deberá tener las primeras 300 y las últimas 200.

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
print(len(dff))
dff.to_csv("nuevo.csv")
