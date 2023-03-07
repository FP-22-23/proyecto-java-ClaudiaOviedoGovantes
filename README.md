# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  \<22\>/\<23\>)
Autor/a: \<Claudia Oviedo Govantes\>   uvus:\<VJR5418\>

Este proyecto trabaja con datos de empleos relacionados con la ingenieria de datos.


## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. Debe estar estructurado en los siguentes paquetes
  * **fp.\<jobs\>**: Paquete que contiene el tipo principal del proyecto "DataScienceJob".
  * **fp.\<jobs>.test**: Paquete que contiene las funciones test del proyecto.
  * **fp.common**: Paquete que contiene los tipos auxiliares del proyecto.
  * **fp.utiles**: Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset proyecto.
    * **\<DataScience.csv\>**: Dataset que contiene los datos implementados en el proyecto.
    
## Estructura de *DataScience.csv*

El dataset original DATA SCIENTIST JOBS se puede obtener de la URL https://www.kaggle.com/datasets/andrewmvd/data-scientist-jobs. 
Originalmente tiene 17 columnas y cada fila contiene datos sobre un empleo como ingenierio de datos. 
El dataset usado en este proyecto tiene 11 columnas que se describen a continuación.

* **\<Company>**: de tipo \<String\>, representa el nombre de la compañía asociada al empleo.
* **\<Employees>**: de tipo \<Integer\>, representa el número de empleados de la empresa.
* **\<City>**: de tipo \<String\>, representa la ciudad en la que se localiza la empresa.
* **\<Foundation>**: de tipo \<LocalDate\>, representa la fecha de fundación.
* **\<Rating>**: de tipo \<Float\>, representa la puntuación sobre 5 que recibe la compañía.
* **\<Private>**: de tipo \<Boolean\>, representa si la compañía es privada y no del gobierno.
* **\<Easy Apply>**: de tipo \<Boolean\>, representa si la applicación al empleo es sencilla.
* **\<Sector>**: de tipo \<Sector(Enum)\>, representa el sector en el que se ubica.
* **\<Job Skills>>**: de tipo \<List<String<\>, representa las habilidades necesarias para el desempeño del empleo.
* **\<Women>**: de tipo \<Double\>, representa el porcentaje de hombres contratados.
* **\<Men>**: de tipo \<Double\>, representa el porcentaje de mujeres contratadas.

## Tipos implementados

Los tipos que se han implementado en este proyecto son los siguientes.

### Tipo DataScienceJob


**Propiedades**:
---Basicas---
- _Empresa_, de tipo \<String\>, consultable y modificable.
- _Empleados_, de tipo \<Integer\>, consultable. 
- _Ciudad_, de tipo \<String\>, consultable y modificable.
- _Fundacion_, de tipo \<LocalDate\>, consultable y modificable. 
- _Puntuacion_, de tipo \<Double\>, consultable y modificable
- _EsPrivada_, de tipo \<Boolean\>, consultable. 
- _FacilSolicitud_, de tipo \<Boolean\>, consultable y modificable.
- _Sector_, de tipo \<Sector\>, consultable. Puede tomar los valores INFORMATION_TECHNOLOGY, 
TOURISM, CONSUMER_SERVICES, FINANCE y MEDIA.
- _Habilidades_, de tipo \<List<String>\>, consultable.

---Derivadas---
- _Tamaño_, de tipo \<Tamaño\>, consultable. Deriva del número de empleados. 
Puede tomar los valores PEQUEÑA, MEDIANA, GRAN.

---Auxiliares---
_Personal_, de tipo \<Personal\>, consultable. Se calcula a partir del porcentaje
de hombres y mujeres que componen la plantilla.

**Constructores**: 

- C1: crea un objeto de tipo partida a partir de los siguientes parámetros. String empresa, Integer empleados, 
String ciudad, LocalDate fundacion, Double puntuacion, Boolean esPrivada, Boolean facilSolicitud.
- C2: es un constructor a partir de string que contiene valores para todas los atributos. Se implementan distintos tipos de parseos.

**Restricciones**:
 
- R1: Impide que el nombre de la empresa esté vacío.
- R2: impide que el número de empleados sea igual o menor que cero.

**Criterio de igualdad**: dos objetos DataScienceJob serán iguales cuando 
las propiedades: ciudad, company, facilSolicitud, empleados, fundacion, esPrivada y puntuacion sean iguales.

**Criterio de ordenación**: por ciudad, empresa, fundacion y empleados.

**Otras operaciones**:
-_formateoBooleano(String s)_: permite el parseo de string a boolean.
-_formateoEnum(String s): permite el parseo de string a enum.
-_toString()_: devuelve la representación como cadena del objeto.
-_hashCode(): devuelve el código hash del objeto.
-_getFormatoCorto(DataScienceJob)_: devuelve el nombre de la empresa, el año de la fundación y el rating de la misma.
-_getParidad(Personal p)_: devuelve true si el porcentaje de mujeres contratadas es igual o superior al 
cuarenta por ciento.


#### Tipos auxiliares
	Tipo Personal, record. Se calcula a partir del porcentaje de hombres y mujeres que componen la plantilla. 
	Este tipo queda de la siguiente forma Personal(float hombres, float mujeres).

### Factoría
Descripción breve de la factoría.

- _método 1_: Descripción del método 1.
-	_método 2_: Descripción del método 2.

### Tipo Contenedor

Descripción breve del tipo contenedor.

**Propiedades**:

- _propiedad1_, de tipo \<Tipo1\>, consultable. 
- _propiedad2_, de tipo \<Tipo2\>, consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: Descripción del constructor 1.
- C2: Descripción del constructor 2.
- ...

**Restricciones**:
 
- R1: Descripción de la restricción 1.
- R2: Descripción de la restricción 2.
- ...
- 
**Criterio de igualdad**: Describir el criterio de igualdad

**Criterio de ordenación**: Describir el criterio de ordenación (si lo hay).

**Otras operaciones**:
 
-	_método 1_: Descripción del método 1.
- ...
