# Segundo-Parcial-Estructuras
Descripción
Este proyecto implementa una lista enlazada simple en Java. Permite agregar, eliminar y manipular dígitos de manera eficiente. La lista soporta operaciones como agregar elementos al inicio, al final y en medio, así como invertir la lista y verificar si un dígito está presente.

Funcionalidades
*Agregar un dígito al inicio de la lista.
*Agregar un dígito al final de la lista.
*Agregar un dígito en la posición media.
*Eliminar un dígito específico de la lista.
*Imprimir los dígitos de la lista.
*Invertir el orden de los dígitos en la lista.
*Verificar si un dígito está en la lista.

Instrucciones de uso:
Agregar el bash
-javac Main.java o javac *.java
-java Main

Ejemplo de ejecución
-Ingrese su nombre:****
-Ingrese su número de DPI: *****
-Depliega un saludo: Bienvenido, ****!
-Menú principal
  -Agregar un dígito al inicio
  -Agregar un dígito al final de la lista.
  -Agregar un dígito en la posición media.
  -Eliminar un dígito específico de la lista.
  -Imprimir los dígitos de la lista.
  -Invertir el orden de los dígitos en la lista.
  -Verificar si un dígito está en la lista.
  -Mostrar el estado actual de la lista y salir.

Proposito de cada clase
Clase nodo: representa un nodo en la lista enlazada, que contiene un dígito y una referencia al siguiente nodo.
Clase ListaEnlazada
  Método addFirst(char digito): agrega un dígito al inicio de la lista.
  Método add(char digito): agrega un dígito al final de la lista.
  Método addMiddle(char digito): agrega un dígito en la posición media de la lista.
  Método remove(char digito): elimina un dígito específico de la lista.
  Método printList(): imprime todos los dígitos en la lista.
  Método reverse(): invierte el orden de los dígitos en la lista.
  Método contains(char digito): verifica si un dígito está presente en la lista.

  Ejemplos de salida:
  Ejemplo 1: Agregar un dígito
  +Entrada: Selección opción 1:
    -Ingrese el dígito a agregar al inicio: 5
  +Salida: Lista actual 5
