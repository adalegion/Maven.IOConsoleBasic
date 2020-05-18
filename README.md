### Consola Básica de entrada y salida
* Objetivo - 
  * Asegurar que todos los test pasen completando los métodos en la clase `IOConsoleBasic`:
    * `String getStringInput()`
    * `int getIntegerInput()`
    * `long getLongInput()`
    * `float getFloatInput()`
    * `double getDoubleInput()`

* Propósito 
  * Establecer familiaridad con:
    * `System.in` 

* NOTA: 
  * **Fork** el repositorio a tu cuenta de GitHub.
  * **Clona** tu repositorio del paso anterior (**fork**) a tu máquina local (PC o Mac)
  * Ve completando el proyecto y sube tus cambios a tu repositorio usando:
    * ```git add``` para añadir tus cambios
    * ```git commit``` para ponerle [consolidar](https://spanish.stackexchange.com/questions/17811/hay-alguna-forma-de-traducir-al-espa%C3%B1ol-commit-hablando-de-bases-de-datos) tu cambios y darle un mensaje
    * ```git push``` para subir los cambios en tu código hacia tu GitHub
  * Al terminar tu proyecto haz un ```pull request``` para compararlo con el ```master``` de Adalegion
- **NOTA IMPORTANTE** - Antes de trabajar en este lab debes habilitar la entrada por teclado cuando se ejecutan los Test siguiendo las instrucciones:
1. Haz click sobre **Help** en la barra de los menús
2. Después haz click en **Edit Custom VM Options**
3. Añade la siguiente línea de código: `-Deditable.java.test.console=true`
4. Posteriorment, haz click en **File** sobre la barra de menús
5. Finalmente, haz click en **Invalidate Caches / Restart**
- **NOTA MAS IMPORTANTE** - Al finalizar este lab revierte los pasos anteriores.


<br><br>
## `System.in` y `System.out`
Usando la entrada por teclado y la salida por pantalla 
  
### Ejemplo
  ```
      /** Instancia de la clase Scanner para preparar la entrada de datos (por teclado)*/
      Scanner in = new Scanner(System.in);

      String input = "";
      System.out.println("Escribe un mensaje: ");

      /** Guardamos el string (cadena) en la variable input introducido por teclado (hasta presionar Enter)*/
      input = in.nextLine();

      /** Imprimir en pantalla */
      System.out.println(input);
  ```
