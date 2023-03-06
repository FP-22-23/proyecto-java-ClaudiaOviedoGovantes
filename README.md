# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  \<XX\>/\<YY\>)
Autor/a: \<nombre del autor\>   uvus:\<uvus del autor\>

Aquí debes añadir la descripción del dataset y un enunciado del dominio del proyecto.


## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. Debe estar estructurado en los siguentes paquetes
  * **fp.\<jobs\>**: Paquete que contiene el tipo principal del proyecto "DataScienceJob".
  * **fp.\<jobs>.test**: Paquete que contiene las funciones test del proyecto.
  * **fp.common**: Paquete que contiene los tipos auxiliares del proyecto.
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset proyecto.
    * **\<DataScience.csv\>**: Dataset que contiene los datos implementados en el proyecto.
    
## Estructura de *DataScience.csv*

Aquí debes describir la estructura del dataset explicando qué representan los datos que contiene y la descripción de cada una de las columnas. Incluye también la URL del dataset original.

El dataset está compuesto por \<11\> columnas, con la siguiente descripción:

* **\<Company>**: de tipo \<String\>, representa el nombre de la compañía asociada al empleo.
* **\<Employees>**: de tipo \<Integer\>, representa el número de empleados de la empresa.
* **\<City>**: de tipo \<String\>, representa la ciudad en la que se localiza la empresa.
* **\<Foundation>**: de tipo \<LocalDate\>, representa la fecha de fundación.
* **\<Rating>**: de tipo \<Float\>, representa la puntuación sobre 5 que recibe la compañía.
* **\<Private>**: de tipo \<Boolean\>, representa si la compañía es privada y no del gobierno.
* **\<Easy Apply>**: de tipo \<Boolean\>, representa si la applicación al empleo es sencilla.
* **\<Sector>**: de tipo \<Sector(Enum)\>, representa el sector en el que se ubica.
* **\<Job Skills>>**: de tipo \<List<String<\>, representa las habilidades necesitadas para el desempeño del empleo.
* **\<Women>**: de tipo \<Double\>, representa el porcentaje de hombres contratados.
* **\<Men>**: de tipo \<Double\>, representa el porcentaje de mujeres contratadas.

## Tipos implementados

Describe aquí los tipos que usas en tu proyecto.

### Tipo DataScienceJob
Descripción breve del tipo base.

**Propiedades**:

- _Company_, de tipo \<String\>, consultable y modificable.
- _Employee_, de tipo \<Integer\>, consultable. 
- _City_, de tipo \<String\>, consultable y modificable.
- _Foundation_, de tipo \<LocalDate\>, consultable y modificable. 
- _Rating_, de tipo \<Double\>, consultable y modificable
- _Private_, de tipo \<Boolean\>, consultable. 
- _Easy Apply_, de tipo \<Boolean\>, consultable y modificable.
- _Sector_, de tipo \<Sector\>, consultable. 
- _Job Skills_, de tipo \<List<String>\>, consultable. 
- _Men_, de tipo \<Double\>, consultable. 
- _Women_, de tipo \<Double\>, consultable. 


**Constructores**: 

- C1: recibe un parámetro por cada propiedad básica del tipo.
- C2: es un constructor a partir de string. Se implementan distintos tipos de parseos.

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

#### Tipos auxiliares
Descripción de los tipos auxiliares que sean necesarios añadir al proyecto.

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
