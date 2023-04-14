# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  \<22\>/\<23\>)
Autor/a: \<Claudia Oviedo Govantes\>   uvus:\<VJR5418\>

Este proyecto trabaja con datos de empleos relacionados con la ingenieria de datos.


## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. Debe estar estructurado en los siguentes paquetes
  * **fp.\<jobs\>**: Paquete que contiene el tipo principal del proyecto "Job".
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
* **\<Private>**: de tipo \<Boolean\>, representa si la compañía es privada y no estatal.
* **\<Easy Apply>**: de tipo \<Boolean\>, representa si la applicación al empleo es sencilla.
* **\<Sector>**: de tipo \<Sector(Enum)\>, representa el sector en el que se ubica.
* **\<Job Skills>>**: de tipo \<List<String<\>, representa las habilidades necesarias para el desempeño del empleo.
* **\<Street>**: de tipo \<String\>, representa la calle donde se sitúa la compañía.
* **\<Nif>**: de tipo \<String\>, representa el nif (numero de identificación) de la empresa.
* **\<Women>**: de tipo \<Double\>, representa el porcentaje de hombres contratados.
* **\<Men>**: de tipo \<Double\>, representa el porcentaje de mujeres contratadas.

## Tipos implementados

Los tipos que se han implementado en este proyecto son los siguientes.

### Tipo Job

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
-_EmpresaR_, de tipo Record, consultable

---Derivadas---
- _Tamaño_, de tipo \<Tamaño\>, consultable. Deriva del número de empleados. 
Puede tomar los valores PEQUEÑA, MEDIANA, GRAN.
-_FormatoCorto()_: devuelve el nombre de la empresa, el año de la fundación y el rating de la misma.

---Auxiliares---
_EmpresaR_, de tipo \<record\>, consultable. Se calcula a partir de la dirección, el nif y el porcentaje
de hombres y mujeres que componen la plantilla.

**Constructores**: 

- C1: crea un objeto de tipo partida a partir de los siguientes parámetros. String empresa, Integer empleados, 
String ciudad, LocalDate fundacion, Double puntuacion, Boolean esPrivada, Boolean facilSolicitud.
- C2: es un constructor a partir de string que contiene valores para todas los atributos. 
Se implementan distintos tipos de parseos.

**Restricciones**:
 
- R1: Impide que el nombre de la empresa esté vacío.
- R2: impide que el número de empleados sea igual o menor que cero.

**Criterio de igualdad**: dos objetos Job serán iguales cuando 
las propiedades: ciudad, company, facilSolicitud, empleados, fundacion, esPrivada y puntuacion sean iguales.

**Criterio de ordenación**: por ciudad, empresa, fundacion y empleados.

**Otras operaciones**:
-_formateoEnum(String s): permite el parseo de string a enum.
-_toString()_: devuelve la representación como cadena del objeto.
-_hashCode(): devuelve el código hash del objeto.
-_getParidad(Personal p)_: devuelve true si el porcentaje de mujeres contratadas es igual o superior al 
cuarenta por ciento.


#### Tipos auxiliares
	Tipo EmpresaR, record. Se calcula a partir del nombre de la calle, el nif y el porcentaje de hombres 
	y mujeres que componen la plantilla. Este tipo queda de la siguiente forma 
	EmpresaR(String calle, String nif, Double hombres, Double mujeres).

### Factoría - Factoria Job
	Clase de factoría para construir objetos de tipo Job.

- _leerEmpleo_:recibe como parámetro una cadena con el formato de las líneas del fichero CSV, 
y devuelve un objeto del tipo Job a partir de esa cadena. Emplea el constructor a partir de String.
-	_leerEmpleos_:recibe como parámetro una cadena que contiene el nombre y ruta del fichero CSV, 
y devuelve una lista de objetos del tipo Job. También utiliza el constructor a partir de String.

### Tipo Contenedor - Jobs
Clase contenedora de los objetos de tipo Job.

**Propiedades**:
- _empleos_, de tipo \<List\>, consultable y modificable.

**Constructores**: 
-C1: Constructor por defecto. Crea un objeto de tipo Jobs sin ningun empleo almacenado.
-C2: Constructor con un parámetro de tipo Collection<Job>. Crea un objeto de tipo Jobs 
con los empleos incluidos en la colección dada como parámetro.

**Criterio de igualdad**:Dos Jobs son iguales si lo es su propiedad empleo, es decir
si contienen los mismos objetos de tipo Job.

**Representación como cadena**: Imprime por pantalla el atributo empleos asi como el número de objetos
del contenedor. 

**Otras operaciones**:
 
-	_getNumeroEmpleos()_: devuelve el número de objetos de tipo Job del contenedor.
-  _anadirEmpleo(Job j)_: añade el Job j al contenedor.
-  _añadirColeccion(Collection<Job> c)_: añade la colleción c al contenedor.
-  _eliminarEmpleo(Job j)_: elimina el empleo j de la colección.
-  _existeEmpresaEnCiudad(String ciudad)_: devuelve tru si existe algun empleo en la ciudad pasada por parámetro.
-  _getMediaPuntuacionEmpresa(String empresa)_: retorna la puntuación media de la empresa pasada por parámetro.
-  _getGrandesEmpresas()_: devuelve un conjunto con las empresas de mas de 500 empleados.
-  _getEmpleosPorCompañias()_:retorna un diccionario que agrupa empleos por compañías.
-  _getNumeroEmpleosPorSector()_: devueve un diccionario que cuenta el número de empleos por sectores.


