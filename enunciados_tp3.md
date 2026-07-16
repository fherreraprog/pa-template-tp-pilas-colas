# UNPA-UARG - 2025
**Carreras:** Analista de Sistemas y Licenciatura en Sistemas  
**Asignatura:** Programación de Algoritmos  

**Trabajo Práctico Nº 3**  
**Tema:** Pilas  

**Profesores de Práctica:**  
- Lic. Franco Herrera  
- Mg. Fabiana Miranda  

---

## 1. Realizar la traza de los siguientes segmentos de código

### a)
```java
int x = 3;
int y = 5;
int z = 2;
pila p = new pila();
p.meter(x);
p.meter(4);
x = p.sacar();
p.meter(y);
p.meter(3);
p.meter(z);
x = p.sacar();
p.meter(2);
p.meter(x);
while (!p.estaVacia()) {
    x = p.sacar();
    System.out.println(x);
}
```

### b)
```java
int y = 1;
pila p = new pila();
p.meter(5);
p.meter(7);
int x = p.sacar();
x += y;
p.meter(x);
p.meter(y);
p.meter(2);
y = p.sacar();
x = p.sacar();
while (!p.estaVacia()) {
    y = p.sacar();
    System.out.println(y);
}
System.out.println("X = " + x);
System.out.println("Y = " + y);
```

### c)
```java
pila p1 = new pila();
pila p2 = new pila();
int x;
for (int i = 1; i <= 10; i++)
    p1.meter(i);
while (!p1.estaVacia()) {
    x = p1.sacar();
    if (x % 2 == 0)
        p2.meter(x);
}
while (!p2.estaVacia()) {
    x = p2.sacar();
    System.out.println(x);
}
```

### d)
```java
int i = 1;
int j;
pila p1 = new pila();
pila p2 = new pila();
while (i * i < 50) {
    j = i * i;
    p1.meter(j);
    i++;
}
for (int k = 1; k <= 5; k++) {
    j = p1.sacar();
    p2.meter(j);
}
i = p1.sacar();
int k;
for (int m = 1; m <= i; m++) {
    k = p2.sacar();
    p1.meter(k);
}
while (!p1.estaVacia()) {
    i = p1.sacar();
    System.out.println(i);
}
```

---

## 2. Operaciones sobre pila con arreglo de caracteres

Dado el objeto pila `p` con un arreglo de caracteres de dimensión 5 y `cima`.

**a)**  
Pila con: `['A', 'B', 'C', 'D', 'E']` — `cima = 4`, `c = 'F'`  
`p.meter(c);`  

¿Desbordamiento? .......................  
¿Desbordamiento Negativo? .......................  

**Nuevo estado:**  
`cima = ...` y `c = ...`

---

**b)**  
Pila con: `['S', 'T', 'U', 'V', 'W']` — `cima = 3`, `c = 'A'`  
`p.meter(c);`  

¿Desbordamiento? .......................  
¿Desbordamiento Negativo? .......................  

**Nuevo estado:**  
`cima = ...` y `c = ...`

---

**c)**  
Pila con: `['B', 'C', 'D', 'F', 'Q']` — `cima = 0`, `c = ?`  
`c = p.sacar();`  

¿Desbordamiento? .......................  
¿Desbordamiento Negativo? .......................  

**Nuevo estado:**  
`cima = ...` y `c = ...`

---

**d)**  
Pila con: `['X', 'Y', 'Z', 'A', 'B']` — `cima = 4`, `c = 'B'`  
`p.meter(c);`  

¿Desbordamiento? .......................  
¿Desbordamiento Negativo? .......................  

**Nuevo estado:**  
`cima = ...` y `c = ...`

---

**e)**  
Pila con: `['B', 'C', 'D', 'F', 'Q']` — `cima = -1`  
`c = p.sacar();`  

¿Desbordamiento? .......................  
¿Desbordamiento Negativo? .......................  

**Nuevo estado:**  
`cima = ...` y `c = ...`

---

## 3. Palabra invertida

Realice un programa que dado el ingreso de una palabra como cadena de caracteres, permita visualizarla en forma inversa.

---

## 4. Operaciones meter/sacar con información de capacidad

Utilizando la clase `Pila` implementada con arreglo (sin índice cima), escribir un programa que permita meter y sacar elementos. Cada operación debe informar cuántos elementos hay en la pila y cuántos faltan para llegar al máximo.

---

## 5. Método `elementoCima()`

Agregar a la clase `Pila` el método `elementoCima()` que retorne el elemento de la cima sin modificar la pila.

---

## 6. Operaciones con elementos de la pila

Usar los métodos `sacar()`, `meter()`, `estaVacia()` para:

**a)** Asignar a `x` el segundo elemento desde la parte superior, eliminando los dos superiores.  
**b)** Asignar a `x` el segundo elemento desde la parte superior, sin modificar la pila.  
**c)** Asignar a `x` el N-ésimo elemento desde la parte superior (N entero positivo), eliminando los N superiores.  
**d)** Asignar a `x` el N-ésimo elemento desde la parte superior, sin modificar la pila.  
**e)** Asignar a `x` el elemento del fondo, vaciando la pila.  
**f)** Asignar a `x` el elemento del fondo, sin modificar la pila.

---

## 7. Copia de pila

Agregar a la clase `Pila` un método que retorne una copia exacta de la pila.

---

## 8. Clase `Cadena` - Palíndromos

Implementar una clase `Cadena` que permita ingresar una cadena de caracteres (`String`) y tenga el método `esPalindromo()` que retorna `true` si es palíndromo.

**Ejemplo:** `ABLE WAS I ERE I SAW ELBA`

---

## 9. Validación de separadores en expresiones

Realice un programa que lea una expresión aritmética y determine si tiene correctamente colocados los separadores `()`, `{}`, `[]`.

**Ejemplos:**
- `[(a % b) * c]` → correcto
- `2 * (a + b)]] / 2.5 + x` → incorrecto
- `{(c - d) * [(c + a / t]` → incorrecto

**Nota:** Usar una pila para validar los pares de separadores.

---

## 10. Pila de autos

Implementar una pila de autos (máximo 10). En un `main` permitir ingresar autos, buscar por número de patente y, si se encuentra, sacarlo y mostrar su información.