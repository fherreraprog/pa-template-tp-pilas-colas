# Trabajo Práctico Nº 2: Clases & Objetos II

**UNPA-UARG**  
**Carreras:** Analista de Sistemas y Licenciatura en Sistemas  
**Asignatura:** Programación de Algoritmos  

**Profesores de Práctica:**  
- Lic. Franco Herrera  
- Mg. Fabiana Miranda  

---

## 1. Clase Persona

Implementar una clase `Persona` que siga las siguientes condiciones:

**Atributos:**  
- nombre  
- edad  
- DNI  
- sexo (H hombre, M mujer)  
- peso  
- altura  

**Restricciones:**  
- No se debe acceder directamente a los atributos.  
- Todos los atributos menos el DNI tendrán valores por defecto según su tipo (0 para números, cadena vacía para String, etc.).

**Constructores:**  
- Constructor por defecto.  
- Constructor con el nombre.

**Métodos:**  
- `esMayorDeEdad()`: indica si es mayor de edad (devuelve `boolean`).  
- `comprobarSexo(char sexo)`: comprueba que el sexo introducido es correcto (método privado).  
- `toString()`: devuelve toda la información del objeto.

**Tarea:** Testear la clase implementada.

---

## 2. Clase Estación de Servicio

Una estación de servicio cuenta con una capacidad máxima de **10000 litros**. Es posible cargar o reponer combustible. Cuando la capacidad esté por debajo de los **10 litros**, se debe informar de tal situación.

Implementar la clase correspondiente.

---

## 3. Clase Teatro

Un teatro se caracteriza por su **nombre** y su **dirección**. En él se realizan **3 obras teatrales** al día. Cada obra tiene un **nombre** y un **precio**.

Realizar el diseño de clases e indicar qué métodos tendría cada clase, teniendo en cuenta que se pueda:

- Cambiar el nombre del teatro.  
- Cambiar el nombre y precio de las obras.

Implementar dichas clases.

---

## 4. Clase Artículo

Un artículo tiene:  
- descripción  
- precio  
- código  
- stock (cantidad de unidades disponibles)

Implementar las operaciones que permitan **decrementar** e **incrementar** el stock.

---

## 5. Clase Empleado

Crear una clase `Empleado` que modele la siguiente información:

- Número de legajo  
- Sueldo base  
- Pago por hora extra  
- Horas extra realizadas en el mes  
- Casado o no  
- Número de hijos  

**Servicios que debe proporcionar:**

- Cálculo y devolución del complemento correspondiente a las horas extra realizadas.  
- Cálculo y devolución del **sueldo bruto**.  
- Cálculo y devolución de las **retenciones**, teniendo en cuenta que el porcentaje de retención es:  
  - 10% del sueldo base si el empleado está casado  
  - + 1% por cada hijo que tenga.

---

## 6. Clase con Arreglo

Implementar una clase que contenga un **arreglo** como atributo y permita mediante operaciones:

- Ingresar números y guardarlos en el arreglo.  
- Mostrar los números ingresados.  
- Vaciar el arreglo.