# 📌 Aplicación Java - Tarea Entornos

## Descripción

Este proyecto es una aplicación de consola en Java que permite registrar múltiples usuarios introduciendo sus datos por teclado.

El programa solicita cuántos usuarios se desean crear, recoge su información (nombre, apellidos y email) y muestra la lista completa al finalizar.

Además, incluye una funcionalidad para obtener la fecha y hora actual del sistema.

---

## Tecnologías utilizadas

* Java
* Librerías estándar:

  * `java.util.Scanner`
  * `java.time.LocalDateTime`

---

## Ejecución del proyecto

### 1. Compilar

```bash id="n2k8ds"
javac Main.java Usuario.java
```

### 2. Ejecutar

```bash id="l9q3xf"
java Main
```

---

## Funcionamiento

1. El programa muestra un mensaje inicial.
2. Solicita el número de usuarios a crear.
3. Para cada usuario se piden:

   * Nombre
   * Apellidos
   * Email
4. Los usuarios se almacenan en un array.
5. Se muestra la lista completa de usuarios por consola.

---

## Ejemplo de ejecución

```id="z8m2pl"
Hello world!
Introduce la cantidad de usuarios: 2

Introduce los datos del usuario 1
Nombre: Juan
Apellidos: Pérez García
Email: juan@email.com

Introduce los datos del usuario 2
Nombre: Ana
Apellidos: López Ruiz
Email: ana@email.com

--- Lista de usuarios ---
Nombre: Juan
Apellidos: Pérez García
Email: juan@email.com

Nombre: Ana
Apellidos: López Ruiz
Email: ana@email.com
```

---

## Estructura del proyecto

```id="f7k2d1"
/proyecto
│── Main.java
│── Usuario.java
```

---

## Funcionalidades principales

* ✔️ Registro de usuarios por consola
* ✔️ Creación dinámica de múltiples usuarios
* ✔️ Almacenamiento en array
* ✔️ Visualización formateada con `toString()`
* ✔️ Obtención de fecha y hora actual (`fechaHora()`)

---

## Detalles técnicos

### 🔹 Clase `Main`

* Punto de entrada del programa
* Gestiona la interacción con el usuario mediante `Scanner`
* Llama al método `crearUsuarios()`
* Muestra los usuarios por consola
* Incluye el método `fechaHora()` para mostrar fecha y hora actual

### 🔹 Clase `Usuario`

* Atributos:

  * `nombre`
  * `apellidos`
  * `email`
* Métodos:

  * `crearUsuarios(int numero)` → solicita los datos por consola y devuelve un array de usuarios
  * `toString()` → devuelve una representación legible del usuario

---

## Requisitos

* Java JDK 8 o superior

---

## Mejoras futuras

* Validación de datos (especialmente email)
* Manejo de errores en la entrada
* Uso de `ArrayList` en lugar de arrays
* Separación de responsabilidades (mejor diseño OOP)
* Persistencia de datos (archivo o base de datos)
* Interfaz gráfica (Swing o JavaFX)

---

## Autor

* Ian Navarro
