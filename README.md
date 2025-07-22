# 🔫 Juego de Tanques con Búsqueda de Ruta (Java + Prolog)
Instituto Tecnológico de Costa Rica. <br/>
Segundo proyecto de Lenguajes de Programación.
* Ashley Samantha Acuña Montero.
* Warren Ivan Alvarez Huete.

Este proyecto consiste en el desarrollo de un juego de tanques que combina **Programación Orientada a Objetos** con Java y técnicas de **inteligencia artificial lógica** usando Prolog para la búsqueda de rutas. El enfoque principal es implementar un sistema donde tanques enemigos buscan al tanque principal mediante un algoritmo de búsqueda no informada.

## 🧩 Análisis del Problema

El objetivo es desarrollar un **juego interactivo de tanques** en el cual:

* El **tanque principal** es controlado por el usuario.
* **Tanques enemigos** defienden objetivos distribuidos en un campo de batalla.
* Se utiliza **backtracking** mediante Prolog para encontrar la ruta más corta entre el tanque principal y los tanques enemigos.
* Los enemigos recalculan su ruta **cada tres movimientos** del jugador.
* El campo de batalla está representado por una **matriz 10x5**, con muros, objetivos, y tanques ubicados en celdas específicas.
* Los muros son **inamovibles** y no pueden ser destruidos.
* El jugador tiene **tres vidas por nivel**, y estas se acumulan si no se pierden.
* Solo se permiten **movimientos en cuatro direcciones básicas**.
* Se requiere una **interfaz gráfica** que permita mover el tanque y disparar a enemigos.

## 🧪 Solución del Problema

### 🤖 Lógica de Búsqueda con Prolog

Se emplea el algoritmo **Breadth-First Search (BFS)** en Prolog para hallar la ruta más corta desde la posición del enemigo hacia el jugador. La búsqueda se actualiza cada tres turnos del tanque principal.

> Prolog realiza esta búsqueda mediante backtracking y estructuras dinámicas para representar el grafo del campo de batalla.

### 🧱 Lógica de Juego en Java

El juego está construido en Java utilizando clases organizadas por roles:

* **Clase `Armada`**:
  Encargada de crear los tanques enemigos y definir sus movimientos.

* **Clase `Tanque`**:
  Atributos:

  * Tipo: principal o enemigo.
  * Nombre.
  * Cantidad de movimientos posibles.

* **Clase `Funcion`**:
  Define y actualiza el **campo de batalla**, representado como una **matriz 10x5**.

  * Posiciona muros, tanques, objetivos.
  * Reinicia el campo para cada turno.

### 🎨 Dificultad de Enemigos

* 🟫 **Tanque A (gris)**: Dificultad baja.
* 🟧 **Tanque B (naranja)**: Dificultad media.
* 🌸 **Tanque C (rosa)**: Dificultad alta.
* 🟩 **Tanque verde**: Controlado por el usuario.
Cada tanque enemigo busca al jugador según su dificultad y se mueve a velocidades predefinidas.

### 🕹️ Interfaz Gráfica

La interfaz permite al usuario:
* Mover el tanque en 4 direcciones.
* Realizar disparos válidos si el enemigo está dentro del rango.
* Visualizar vidas y movimientos restantes.
* Explorar distintas estrategias para alcanzar objetivos y evitar ser destruido.

### ♻️ Reglas de Movimiento y Vidas

* El jugador tiene **3 movimientos por turno**.
* Cada 3 movimientos:
  * Se recalcula la posición del jugador.
  * Se genera una **nueva búsqueda de ruta** desde los enemigos.
* Si el jugador **es alcanzado por un enemigo o gasta sus movimientos sin éxito**, pierde una vida.
* Las vidas **se acumulan** entre niveles si no son utilizadas.

## ✅ Conclusiones
* **Prolog** demostró ser una herramienta eficaz para búsqueda de rutas gracias a su capacidad de backtracking y su sistema declarativo.
* Se presentaron desafíos al integrar **Java con Prolog**, especialmente en la comunicación entre ambos lenguajes, pero se solucionaron exitosamente.
* El uso de **clases y objetos en Java** facilitó la organización lógica del juego, permitiendo encapsular atributos, comportamientos y estados de manera clara y mantenible.
* Se utilizó el concepto de **predicados dinámicos** en Prolog para permitir modificaciones en tiempo de ejecución, lo cual fue clave en la búsqueda reactiva de rutas.
