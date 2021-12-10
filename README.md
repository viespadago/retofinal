# retofinal
RETO FINAL | JUMP2DIGITAL

NUWECASH es una aplicación móvil que permite a los usuarios solicitar un préstamo de hasta 100€ en menos de 3 minutos.

Funcionamiento:
- El usuario se descarga la app y se registra con el DNI.
- Rellena un pequeño formulario y vincula su cuenta bancaria.
- Solicita su préstamo.

En 2 minutos este préstamo se valida y se confirma, el usuario decide si se lo envían instantáneamente o por via standard (más barato).

A partir de los datos históricos de transacciones de la app genera una plataforma de analytics que permite conocer cuáles son los insights de uso para facilitar la toma de decisiones estratégicas de la empresa de micro-préstamos.


## Background

DATA SCIENCE
Realiza un analisis exploratorio de los datos que permite conocer los siguientes insights:
Número de nuevos usarios por mes.
Dinero total solicitado cada mes.
Dinero medio solicitado por cada usuario al mes.
Porcentaje de las solicitudes que son aceptadas cada mes.
Número de solicitudes al mes que son aceptadas pero NO son devueltas.
Número de solicitudes al mes que son aceptadas y SÍ son devueltas.
Tiempo medio en devolver un préstamo (MM:DD:HH).
Cantidad de dinero que se presta cada mes.
Predecir la cantidad de dinero que se solicitara en Octubre.

FRONTEND
Visualiza los datos mensuales del análisis que se ha hecho desde el equipo de Data. Se muestra la siguiente información:
Evolución del número de usuarios en función de los meses
Evolución del número de pedidos (requestedMoney) en función de los meses
Visualizar el valor de (acceptedRequests, presupuesto y tiempo de retorno) para un mes en concreto.
Un botón para cambiar el mes de visualización
Un botón para cargar los datos del backend.

BACKEND
API muy sencilla que carga los valores que nos pasa el equipo de data en formato JSON o CSV y enviar los datos ya filtrados al front.
Server que esté disponible en el puerto 3000
CRUD del modelo MONTH
Persisténcia de datos utilziando la BDD a escoger
Protección de rutas
Ruta para enviar la información de users y requestedMoney de todos los modelos disponibles
Ruta para enviar la información de cada mes (solo la necesaria para el front)


## Usage

Data Sciense pasa el CSV que se carga en una base de datos MySQL, con una API realizada con Spring Boot se recogen esos datos y se pasan a JSON. Finlamente, desde la página de front se hace una consulta a esa API y muestra la información de forma más atractiva graficamente.


## API/Component

Se ha realizado una API con Spring Boot en lenguaje JAVA que pasa los datos de la base datos SQL a JSON. La API permite mostrar toda la información o buscar información concreta por ID o mes.


## Installation

Se ha necesitado la instalación de Python para Data Science.
De una base de datos MYSQL donde se crea una tabla con los mismos campos que pasa DATA en su CSV.
De JAVA 11 y NetBeans para la API.
Y de NodeJS y el framework React para el front.


## Stack

[HTML5](http://www.w3.org/TR/html5/)
[CSS3](http://www.w3.org/TR/CSS/)
[JAVASCRIPT](https://developer.mozilla.org/en-US/docs/Web/JavaScript)
[PYTHON](https://www.python.org/)
[JAVA](https://www.java.com/)
[TYPESCRIPT](https://www.typescriptlang.org/)
[NODEJS](https://nodejs.org/en/)
[REACTJS](https://reactjs.org/)


## Roadmap and visuals

Se ha utilizado el diseño del ejemplo que se mostraba en NUWE (https://nuwe.io/challenge/reto-final-or-jump2digital) como modelo. Con fondo negro, el select y el botón de update en la parte superior y la informació mostrada en 2 línias: una para los datos mensuales y otra para las gráficas. 

Para las gráficas se ha utilizada una librería de React.


## Contribución y Apoyo

Cualquiera lo puede utilizar si le apetece. 


## Contact info

https://github.com/FrankPalomino
https://github.com/dominikapetru
https://github.com/sschmidt0
https://github.com/Sararid
https://github.com/Veronica43
https://github.com/andreu-vall
https://github.com/viespadago



## License 

[MIT](https://opensource.org/licenses/MIT)
