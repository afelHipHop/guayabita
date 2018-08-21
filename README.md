### Samuel Holguin 20161020044
### Andres Ramirez 20161020077
### Kevin Rocha 20161020086
## Introducción
Se realizó un programa el cual representa el juego “Guayabita” de manera automática, para el completo entendimiento de este código primero se deberán explicar distintos conceptos que son necesarios para el completo entendimiento del programa, ya que esté se realizo sin ningún estado.
## Guayabita
La guayabita es un juego de azar que se basa en arrojar un dado y dependiendo del número obtenido se seguirán unas instrucciones, las cuales se señalarán a continuación:

•	Si el jugador saca 1 o 6, deberá apostar el valor mínimo establecido

•	Si el jugador saca 2, 3, 4 o 5; podrá apostar el valor que el desee, siempre y cuando la mesa tenga suficiente dinero para poder pagar y también dependiendo de cuánto dinero tenga el jugador, ya que, no podrá apostar más dinero del cual posea.
Después de realizar la apuesta, el jugador deberá realizar otro lanzamiento:

* si saca un número mayor al previo, el jugador podrá retirar el dinero apostado

* si el número es menor, deberá dejar su apuesta en la mesa.

•	Si la mesa se queda sin dinero, los jugadores deberán apostar el valor mínimo establecido
El juego termina cuando uno de los dos jugadores no tenga dinero

## Recursividad
La recursividad es una técnica implementada en programación que nos permite que un bloque de instrucciones se ejecute un número de veces determinado, es un método que involucra volver a utilizar la función original

Teniendo clara la definición de recursividad y al no implementar estados gracias a la programación declarativa, se tiene un ciclo repetitivo debido a las condiciones del juego, la recursividad fue necesaria ya que reduce el consumo innecesario de memoria y optimiza el proceso.







