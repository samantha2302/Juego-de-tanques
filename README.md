# Juego de Tanques
Instituto Tecnológico de Costa Rica. <br/>
Segundo proyecto de Lenguajes de Programación.
* Ashley Samantha Acuña Montero.
* Warren Ivan Alvarez Huete.
## Análisis del Problema
El problema que se presenta consiste crear un juego de tanques donde por medio de backtracking, busca la ruta más corta entre dos puntos, en este caso, los puntos serían entre el tanque principal y los tanques enemigos, estos tanques enemigos tiene que proteger ciertos objetivos planteados en el lugar de batalla, por otro lado, el tanque principal podrá defenderse por medio de disparos siempre y cuando los tanques enemigos se encuentren cerca de él.

Está búsqueda de soluciones debe de repetirse cada tres movimientos del tanque principal, de manera que los tanques enemigos tengan una nueva ruta de donde se encuentra el tanque principal para eliminarlo. Los muros en el campo de batalla son importantes ya que ayudan a proteger los objetivos a derribar, además, estos muros no pueden ser derribados por ningún tanque en el juego a realizar. 

El tema de vidas, serán nada más tres vidas y lo mismo para los movimientos a realizar el tanque principal, movimientos que solo pueden ser cuatro direcciones básicas, los movimientos de los tanques enemigos tienen que ser definidos y con una velocidad adecuado por el programador

Para la interacción del usuario, se debe de crear una interfaz gráfica donde podrá jugar y realizar diferentes movimientos y disparos con el fin de saber las diferentes maneras de ganar o de perder, cuales son los mejores caminos para poder llegar a los objetivos a derribar. Para ello se usará un lenguaje que sea orientado a objetos a elección del programador y asegurar que pueda tener una interacción con el lenguaje lógico, que en este caso es Prolog.

## Solución del Problema
La búsqueda que realiza prolog, es una búsqueda por anchura, también llamada BreadthFirstSearch en inglés, es un algoritmo usado para recorrer o buscar elementos en una estructura de datos como los grafos. Pertenece al grupo de las búsquedas no informadas, o sea, sin heurísticas. Su procedimiento consiste en ir visitando ciertas posiciones de la matriz con el fin de encontrar la mejor ruta para que los tanques enemigos puedan atacar al tanque principal, que en este caso es el que el usuario controla.

Con Java, se creó una clase que se llama Armada, la cual consiste en crear los tanques y ver cuantos movimientos puede realizar cada tanque, la clase Tanque, tiene como atributos el tipo de tanque, ya sea principal o enemigo, el nombre del tanque y la cantidad de movimientos que puede realizar el tanque dependiendo del tipo.

Para los movimientos de los tanques, existe y una clase llamada Función, está función se encarga poner la matriz principal en ceros, ya que el campo de batalla como tal está hecho por una matriz de 10x5. Ciertas posiciones de la matriz son necesarias para saber donde van los tanques de guerra, los muros, objetivos, y tanque principal.

Cada tanque tiene cierta dificultad, en este juego hay tres donde el gris es el A y tiene una dificultad de fácil, el naranja es B y tiene una dificultad de medio, el tanque de color rosa es el C y es de dificultad dificil, por ultimo, el tanque verde es controlado por el usuario, por lo que es el tanque principal a derribar.

También existen funciones con el fin de saber cómo puede funcionar los botones, cuando se pueden activar para disparar a los enemigos, revisar si los disparos son válidos, de igual forma con el movimiento del tanque principal, hasta donde se puede mover, si son válidos los movimientos que realiza y cuáles son los posibles movimientos a realizar.

Los movimientos a realizar son siempre tres, ya alcanzando este número, cambia la posición del tanque y las posiciones de los tanque enemigos siguen en lo mismo pero con rutas nuevas de búsqueda para ir en contra del tanque controlado por el usuario.

Con el tema de vidas, el jugador al iniciar solo tiene tres vidas, las cuales se van gastando dependiendo si los movimientos se gastan o si los tanques enemigos lo derriban, en caso de no gastar todas las vidas en el nivel que se encuentra en el juego, son acumuladas para el siguiente nivel, sumándose con las tres vidas que se dan al inicio de cada nivel.

El usuario puede ver los movimientos que tiene, los cuales como anteriormente se van disminuyendo depende de cómo el usuario mueva el tanque, además se busca nuevos
posibles movimientos con respecto a los nuevas posiciones de los tanques enemigos ya que ellos sigue permanentes en sus posiciones si fuera el caso de que derriban el tanque principal.

## Conclusiones
En conclusión, usar prolog para la búsqueda de rutas tiene su dificultad, sin embargo, por su backtracking, se puede decir que la búsqueda en su totalidad es muy eficaz, rápida y segura. Para la conexión entre Java y Prolog, se presentaron ciertos problemas, no obstante fueron solucionados, dando así una calidad de búsqueda de rutas, en este caso búsqueda en anchura.

Además, prolog tiene una forma de procedimiento llamado dinámico, la cual consiste que deben de especificar los predicados se usa alguna vez como argumento a una
afirmación o retractación.

Con respecto al uso de un lenguaje orientado a objetos, es más fácil ya que todo se realiza por medio de clases, donde cada clase tiene sus atributos y sus métodos, además, las clases y métodos pueden ser estáticos o abstractos.
