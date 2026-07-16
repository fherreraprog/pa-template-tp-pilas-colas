# UNPA-UARG - 2025
**Carreras:** Analista de Sistemas y Licenciatura en Sistemas  
**Asignatura:** Programación de Algoritmos  

**Trabajo Práctico Nº 4**  
**Tema:** Colas  

**Profesores de Práctica:**  
- Lic. Franco Herrera  
- Mg. Fabiana Miranda  

---

## 1. Trazas de código con Cola y Pila

### a)
```java
cola c = new cola();
int x = 0;
int y = 1;
c.insertar(x);
c.insertar(y);
y = c.borrar();
int z = y + 5;
while (!c.estaVacia()) {
    z = c.borrar();
    System.out.println(z);
}
```

### b)
```java
pila p = new pila();
cola c = new cola();
int x = 0;
int y = 1;
int z = x + y;
while (z < 10) {
    if ((z % 2) == 0)
        p.meter(z);
    else
        c.insertar(z);
    x = y;
    y = z;
    z = x + y;
}
System.out.println("La Pila contiene:");
while (!p.estaVacia()) {
    z = p.sacar();
    System.out.println(z);
}
System.out.println("La Cola contiene:");
while (!c.estaVacia()) {
    z = c.borrar();
    System.out.println(z);
}
```

---

## 2. Operaciones sobre colas circulares

Mostrar el resultado de las operaciones (desbordamiento positivo/negativo o nuevo estado de la cola).

**a)**  
Cola: `['V','W','X','Y','Z']` — `frente = 5`, `ultimo = 4`  
`c.insertar('J');`  

¿Desbordamiento? .....................  
¿Desbordamiento Negativo? .....................  

**Nuevo estado:** `frente = ...`  `ultimo = ...`

---

**b)**  
Cola: `['V','W','X','Y','Z']` — `frente = 4`, `ultimo = 5`  
`c.insertar('K');`  

¿Desbordamiento? .....................  
¿Desbordamiento Negativo? .....................  

**Nuevo estado:** `frente = ...`  `ultimo = ...`

---

**c)**  
Cola: `['V','W','X','Y','Z']` — `frente = 1`, `ultimo = 4`  
`c.insertar('J');`  

¿Desbordamiento? .....................  
¿Desbordamiento Negativo? .....................  

**Nuevo estado:** `frente = ...`  `ultimo = ...`

---

**d)**  
Cola: `['V','W','X','Y','Z']` — `frente = 3`, `ultimo = 3`  
`c.borrar();`  

¿Desbordamiento? .....................  
¿Desbordamiento Negativo? .....................  

**Nuevo estado:** `frente = ...`  `ultimo = ...`

---

**e)**  
Cola: `['V','W','X','Y','Z']` — `frente = 5`, `ultimo = 3`  
`c.borrar();`  

¿Desbordamiento? .....................  
¿Desbordamiento Negativo? .....................  

**Nuevo estado:** `frente = ...`  `ultimo = ...`

---

**f)**  
Cola: `['V','W','X','Y','Z']` — `frente = 2`, `ultimo = 1`  
`c.borrar();`  

¿Desbordamiento? .....................  
¿Desbordamiento Negativo? .....................  

**Nuevo estado:** `frente = ...`  `ultimo = ...`

---

## 3. Implementación de Cola (Frente Fijo y Final Movible)

Escriba la clase `Cola` con atributos y métodos para la implementación **Frente Fijo y Final Movible** (al borrar se deben correr todos los elementos).

---

## 4. Método `contar()`

En base a la implementación Frente y Final movible, escribir un método `contar()` que devuelva la cantidad de elementos en la cola.

---

## 5. Eliminar elementos repetidos

Agregar un método en la clase `Cola` que elimine los elementos repetidos.

---

## 6. Comparar dos colas

Escribir un método que reciba otra cola del mismo tipo y devuelva `true` si son idénticas (mismo tamaño y mismos elementos).

---

## 7. Pasar pares de pila a cola

Dada una pila de enteros positivos, escribir un programa que coloque todos los elementos pares en una cola.

---

## 8. Palíndromo con Pila y Cola

Escribir un programa que lea una cadena de caracteres, insertando cada carácter en una pila y en una cola simultáneamente. Al final, determinar si la cadena es un palíndromo usando las operaciones básicas.

---

## 9. Estacionamiento de autos (simulación)

Un estacionamiento con capacidad para 10 autos en una sola línea.  
- Autos entran por el sur y salen por el norte.  
- Si se quiere retirar un auto intermedio, mover los autos necesarios.  
- Procesar entradas `"e"` (entrada) y `"s"` (salida) con número de patente.  
- Mostrar mensajes de llegada/salida, espacio disponible y cantidad de movimientos.

Escribir el programa completo que procese estas operaciones.