# Trabajo Práctico Nº 2: Clases & Objetos I

**UNPA-UARG**  
**Carreras:** Analista de Sistemas y Licenciatura en Sistemas  
**Asignatura:** Programación de Algoritmos  

**Profesores de Práctica:**  
- Lic. Franco Herrera  
- Mg. Fabiana Miranda  

---

## 1. Identificar propiedades de objetos

Identificar las principales propiedades (**atributos** y **métodos**) de los siguientes objetos:

a) Alumno  
b) Libro  
c) Canción  
d) Televisor  
e) Teléfono celular  
f) Película  
g) Mascota  
h) Curso  
i) Domicilio  
j) Punto  
k) Triángulo  

**Dar algunos ejemplos de instancias de las clases.**

**Ejemplo:**  
**Clase:** Rectangulo  
**Atributos:** base=3, altura=12, color=”verde”.

---

## 2. Implementación en Java

Implemente en código Java, **4 clases** de las definidas en el punto 1.

---

## 3. Análisis de errores en la clase `Hora`

Dada la siguiente clase:

```java
public class Hora {
    private int hora, minutos, segundos;

    public Hora() {
        hora = 0;
        minutos = 0;
        segundos = 0;
    }

    public void setHora(int h) {
        hora = h;
    }

    public void setMinutos(int m) {
        minutos = m;
    }

    public void setSegundos(int s) {
        segundos = s;
    }

    public void imprimirHora() {
        System.out.println(hora + ":" + minutos + ":" + segundos);
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }
}
```

**Identificar errores** en los siguientes códigos, describir por qué ocurre el error y cómo se soluciona.

### a)
```java
public static void main(String[] args) {
    Hora h1;
    h1 = new Hora();
    h1.setHora();
    h1.setMinutos(23);
    h1.imprimirHora();
}
```

### b)
```java
public static void main(String[] args) {
    Hora h1, h2;
    h1 = new Hora();
    h1.setHora(9);
    h1.setMinutos("23");
    h1.imprimirHora();
    h2.setHora(8);
    h2.imprimirHora();
    System.out.println(h1.consultarHora());
}
```

### c)
```java
public static void main(String[] args) {
    Hora h1, h2, h3;
    char valor;
    int aux;
    h1 = new Hora();
    h2 = new Hora();
    System.out.println(h2.consultarHora());
    h1.setHora(3);
    h1.setMinutos(4, 5);
    h2.setHora(11);
    h2.setH(23);
    valor = h1.consultarMinutos();
    aux = h2.consultarHora();
    h1.imprimirHora();
    h2.imprimirHora();
    System.out.println(aux);
    h3.consultaHora();
}
```

### d)
```java
public static void main(String[] args) {
    Hora h1, h2;
    h1 = new Hora();
    h2 = new Hora();
    h1.setHora(12);
    h1.setMinutos(0);
    h2.setHora(17);
    h2.setMinutos(30);
    h1.imprimirHora();
    System.out.println(h2.consultarHora() + ":" + h2.consultarMinutos());
    System.out.println(h3.consultarHora());
}
```

---

**Aclaración:** En este práctico se incluyen pocos ejercicios donde se solicite hacer el programa principal (`main`), ya que se le da prioridad a la creación de las clases. Se recomienda crear y manipular objetos a través de mensajes y realizar los testeos/validaciones correspondientes.

---

## 4. Clase Televisor

En base a las propiedades obtenidas en el ejercicio 1, implementar la clase `Televisor`.  
Incluir: constructor, setters y getters necesarios, y métodos para:

- Encender
- Apagar
- Subir y bajar el canal
- Subir y bajar el volumen
- Volver al canal anterior

---

## 5. Clase Hora (avanzada)

Una hora se compone de 3 elementos: hora, minutos y segundos. Codificar la clase `Hora` con los siguientes métodos:

a) Al crear el objeto, los valores deben ser válidos (hora correcta en Argentina). Si son inválidos → `00:00:00`.  
b) Permitir cambiar la hora, minutos y segundos por separado.  
c) Devolver la hora en minutos.  
d) Mostrar la hora en formato `hh:mm:ss`.  
e) Crear dos objetos de la clase `Hora` y probar los métodos.

---

## 6. Clase Fecha

Una fecha se compone de 3 elementos: día, mes y año. Codificar la clase `Fecha` con los siguientes métodos:

a) Al crear el objeto, los valores deben ser válidos. Si son inválidos → `01/01/2013`.  
b) Devolver día, mes y año.  
c) Cambiar día, mes y año.  
d) Obtener el nombre del mes (ej: 1 → "Enero").  
e) Mostrar la fecha en formato: `1 de Setiembre de 2012`.

---

## 7. Programa con Fechas

Escribir un programa en el que se creen **dos objetos** de tipo `Fecha`. Probar los métodos creados anteriormente. Mostrar en formato `dd/mm/aaaa` aquella fecha (de las dos) que tenga el **mayor año**.