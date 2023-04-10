# En este documento pondre comentarios y apreciaciones del código, decisiones de diseño y detalles.

## Comentarios  

* El simbolo `*=>` es para usarlo como referencia dentro de un programa de notas que marca donde estan las ocurrencias y estructurar el codigo.
  * También es posible que use otros como NOTE.
<br><br>

* El poner getters y setters con el nombre del propio campo es una nueva corriente que se esta imponiendo frente a usar setField y getField.
<br><br>

* Aunque en un principio se penso que ***ServiceProvider*** fuese una clase abstracta y se usasen implementaciones como **Hotel**, **CartRent**... se descarto esta idea pensando en la imposibilidad de crear nuevas implementaciones en ejecución, por lo que solo podrian existir los tipos creados en tiempo de compilación. Por tanto, concluyo que es mejor decantarse por un modelo mas flexible que permita la inclusión de nuevos tipos de proveedores de servicios en tiempo de ejecución, en este caso se pondra el tipo con un String.
<br><br>

* Aunque normalmente aquello que esta acoplado a la clase de control seria composición, en este caso, al no tener base de datos, como se supone que son objetos persistentes (aunque no sea el caso) se supone que serian agregación.

****

## Para poder evitar referencias circulares con la creacion de servicios se opto por el sistema actual  


### Anterior  
 ~~~
/-----------------\-------->/---------\
| ServiceProvider |         | Service |
\-----------------/<--------\---------/
~~~

### Medio 
~~~
/----------------------\
| ServiceAdministrator |
\----------------------/
   /\         /\
   \/         \/
   |          |
/---------\   |
| Service |   |
\---------/   |
    |         |
    |         |
    |         |
/-----------------\
| ServiceProvider |
\-----------------/
~~~

### Actual
~~~
/-----------------\         /---------\
| ServiceProvider |---------| Service |
\-----------------/         \---------/
~~~ 

> Al final se ha obtado por una solución mas simple dado que la aplicación no ametrita tanta complejidad. 

***


Si no deja elegir ciertos viajes, es porque no los hay en la base de datos
Se ha optado por no controlar los datos de los usuarios para la fluidez de las pruebas, ya que son muchos datos

En el añadir servicios adicionales dependiendo del SO puede que los JTetField no se vean bien, si varias el ancho de la ventana tras añadir un producto se arregla solo