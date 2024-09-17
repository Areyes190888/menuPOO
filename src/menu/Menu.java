package menu;

import java.util.Scanner;

public class Menu {

    public static int opcionMenuprincipal(Scanner scannera) {
        System.out.println("""
                ----------------------------------------
                -     MENU CAPITULO DE PROGRAMACIÓN    -
                -       ARNOLD REYES (AREYES2)         -
                -        MAYID PABÓN (MPABON5)         -
                ----------------------------------------
                -1.           Datos primitivos.        -
                -2.               String.              -
                -3.             Constantes.            -
                -4.         Tipo de operadores.        -
                -5.    Condicional IF, ELSE IF ELSE.   -
                -6.         Condicional SWITCH.        -
                -7.         Condicional ternario.      -
                -8.            Bucle DO WHILE.         -
                -9.             Bucle WHILE.           -
                -10.             Bucle FOR.            -
                -0.                 Salir              -
                ----------------------------------------
                Digite una opción:""");
        return scannera.nextInt();
    }

    public static int opcionMenuprimitivos(Scanner scannerb) {
        System.out.println("""
                ----------------------------------------
                             Datos primitivos
                ----------------------------------------
                -1.          Explicación byte.         -
                -2.          Explicación short.        -
                -3.          Explicación int.          -
                -4.          Explicación long.         -
                -5.          Explicación float.        -
                -6.          Explicación double.       -
                -7.          Explicación char.         -
                -8.          Explicación boolean.      -
                -0.          Salir                     -
                Digite una opción:""");
        return scannerb.nextInt();
    }

    public static void explicacionByte() {
        System.out.println("""
                ----------------------------------------
                             Explicación Byte          \s
                ----------------------------------------
                Representa un tipo de dato de 8 bits
                con signo. De tal manera que puede
                almacenar los valores numéricose -128
                a 127 (ambos inclusive).
                ----------------------------------------""");
        System.out.println("Digita Enter para regresar al menu datos primitivos");
    }

    public static void explicacionShort() {
        System.out.println("""
                ----------------------------------------
                             Explicación short          \s
                ----------------------------------------
                Representa un tipo de dato de 16 bits
                con signo. De esta manera almacena valores
                numéricos de -32.768 a 32.767
                ----------------------------------------""");
        System.out.println("Digita Enter para regresar al menu datos primitivos");
    }

    public static void explicacionInt() {
        System.out.println("""
                ----------------------------------------
                             Explicación int          \s
                ----------------------------------------
                Es un tipo de dato de 32 bits
                con signo para almacenar valores numéricos
                Cuyo valor mínimo es -231 y el valor máximo 231-1.
                ----------------------------------------""");
        System.out.println("Digita Enter para regresar al menu datos primitivos");
    }

    public static void explicacionLong() {
        System.out.println("""
                ----------------------------------------
                             Explicación long          \s
                ----------------------------------------
                Es un tipo de dato de 64 bits
                con signo que almacena valores numéricos
                entre -263 a 263-1
                ---------------------------------------""");
        System.out.println("Digita Enter para regresar al menu datos primitivos");
    }

    public static void explicacionFloat() {
        System.out.println("""
                ----------------------------------------
                             Explicación float          \s
                ----------------------------------------
                Es un tipo dato para almacenar números
                en coma flotante con precisión simple de
                32 bits.
                ---------------------------------------""");
        System.out.println("Digita Enter para regresar al menu datos primitivos");
    }

    public static void explicacionDouble() {
        System.out.println("""
                ----------------------------------------
                             Explicación double          \s
                ----------------------------------------
                Es un tipo dato para almacenar números
                en coma flotante con doble precisión de
                64 bits.
                ---------------------------------------""");
        System.out.println("Digita Enter para regresar al menu datos primitivos");
    }

    public static void explicacionChar() {
        System.out.println("""
                ----------------------------------------
                             Explicación char          \s
                ----------------------------------------
                Es un tipo de datos que representa
                a un carácter Unicode sencillo de 16 bits.
                ---------------------------------------""");
        System.out.println("Digita Enter para regresar al menu datos primitivos");
    }

    public static void explicacionBoolean() {
        System.out.println("""
                ----------------------------------------
                             Explicación boolean          \s
                ----------------------------------------
                Sirve para definir tipos de datos booleanos.
                Es decir, aquellos que tienen un valor\s
                de true o false. Ocupa 1 bit de información.
                ---------------------------------------""");
        System.out.println("Digita Enter para regresar al menu datos primitivos");
    }

    public static void explicacionString() {
        System.out.println("""
                ----------------------------------------
                                  String
                 Un objeto String representa una cadena
                 alfanumérica de un valor constante que
                 no puede ser cambiada después de haber
                 sido creada.Un objeto StringBuffer
                 representa una cadena cuyo tamaño\s
                 puede variar. Los Strings son objetos.
                 constantes y por lo tanto muy baratos\s
                 para el sistema
                ----------------------------------------""");
        System.out.println("Digita Enter para regresar al menu principal");
    }

    public static void explicacionConstantes() {
        System.out.println("""
                ----------------------------------------
                                Constantes
                ----------------------------------------
                 Una constante es un valor fijo dado
                 que no debe cambiar. Este es un valor
                 constante que se conoce antes de que
                 la aplicación comience a ejecutarse y
                 se establece en el código una vez.
                ----------------------------------------""");
        System.out.println("Digita Enter para regresar al menu principal");
    }

    public static int opcionMenuTO(Scanner scannerb) {
        System.out.println("""
                ---------------------------------------
                           Tipos de operadores
                ----------------------------------------
                -1.            Aritmeticos
                -2.            Relacionales
                -3.            Logicos
                -4.            Asignación
                -5.       Incremente/Decremento
                -0.               Salir
                ---------------------------------------
                 Digite una opción:""");
        return scannerb.nextInt();
    }

    public static void explicacionAritmeticos() {
        System.out.println("""
                ----------------------------------------
                             Aritmeticos         \s
                ----------------------------------------
                Los operadores aritmeticos son simbolos
                especiales que se utilizan para realizar
                operaciones matematicas en variables
                numericas. Los operadores son:
                Suma: +, Resta: -, Multiplicación: *
                División: /, Modulo: %, Incremento: ++
                Decremento: --
                ----------------------------------------""");
        System.out.println("Digita Enter para regresar al menu Tipo de operadores");
    }

    public static void explicacionRelacionales() {
        System.out.println("""
                ----------------------------------------
                            Relacionales
                ----------------------------------------
                Los operadores relacionales son los
                siguientes:
                Igual a: ==, Diferente de: !=
                Mayor que: >, Menor que: <
                Mayor o igual que: >=,
                Menor o igual que: <=
                ----------------------------------------""");
        System.out.println("Digita Enter para regresar al menu Tipo de operadores");
    }

    public static void explicacionLogicos() {
        System.out.println("""
                ----------------------------------------
                              Logicos
                ----------------------------------------
                Los operadores logicos son los siguientes:
                And: &&, OR: ||
                ----------------------------------------""");
        System.out.println("Digita Enter para regresar al menu Tipo de operadores");
    }

    public static void explicacionAsignacion() {
        System.out.println("""
                ----------------------------------------
                             Asignación
                ----------------------------------------
                Los operadores de asignación permiten
                asignar valores variables. A través de
                estos operadores, se puede almacenar
                información en variables para su
                posterior uso en el programa. Los
                operadores utilizados son:
                +=, -=, *=, /=, entre otros.
                ----------------------------------------""");
        System.out.println("Digita Enter para regresar al menu Tipo de operadores");
    }

    public static void explicacionIncrementodec() {
        System.out.println("""
                ----------------------------------------
                        Incremento/Decremento
                ----------------------------------------
                Los operadores de Increment y Decremento
                son utiles para modificar el valor de una
                variable en una unidad. El operadore de
                incremento aumenta el valor de la\s
                variable en 1, mientras que el operador
                de decremento lo disminuye en 1. Los
                operadores son: Increment: ++,
                Decremento: --.""");
        System.out.println("Digita Enter para regresar al menu Tipo de operadores");
    }

    public static int opcionCondicionalif(Scanner scannerb) {
        System.out.println("""
                ----------------------------------------
                       Condicional IF, ELSE IF ELSE
                ----------------------------------------
                -1.         Explicación de IF
                -2.        Explicación de ELSE IF
                -3.        Explicación del ELSE
                -4.     Programa de IF, ELSE IF/ELSE
                -0.                 Salir
                ---------------------------------------""");
        System.out.println("Digite una opción:");
        return scannerb.nextInt();
    }

    public static void explicacionIf() {
        System.out.println("""
                ----------------------------------------
                            IF         \s
                ----------------------------------------
                La estructura condicional más simple en Java es el if,
                se evalúa una condición y en caso de que se cumpla
                se ejecuta el contenido entre las llaves {}\s
                o en caso de que se omitan se ejecuta el código\s
                hasta el primer «;» por lo tanto si no se usan los {}\s
                la condición aplica solo a la siguiente instrucción al if.
                ----------------------------------------""");
        System.out.println("Digita Enter para regresar al menu Condicional IF, ELSE IF ELSE");
    }

    public static void explicacionElseif() {
        System.out.println("----------------------------------------" +
                "\n            ELSE IF          " +
                "\n----------------------------------------" +
                """
                        \nEl siguiente nivel es hacer el else condicional
                          añadiendo un if para que si no se cumple la primera
                          condición (la del if principal) se evalue esta nueva
                          condición de modo que se puede concatenar la cantidad
                          de if else que se necesiten para cubrir todos los
                          distintos escenarios que precisen ser tratados de una
                          forma particular, siendo el ultimo else el que se
                          ejecute cuando no se cumpla ninguna condición
                          (el else es siempre opcional).
                        \n Por ejemplo:
                        \n
                                   if (temperatura > 25) {
                                       // Si la temperatura es mayor que 25 ...
                                       System.out.println("A la playa!!!");
                                   } else if (temperatura > 15) {
                                       // si es mayor que 15 y no es mayor que 25 ..
                                       System.out.println("A la montaña!!!");
                                   } else if (temperatura < 5 && nevando) {
                                       // si es menor que 5 y esta nevando y no es mayor que 15 ni mayor que 25
                                       System.out.println("A esquiar!!!");
                                   } else {
                                       // si la tempera  no es mayor que 25 ni que 15 ni menor que 5 si esta nevando
                                       System.out.println("A descansar... zZz");
                                   }
                        \n----------------------------------------
                        """);
        System.out.println("Digita Enter para regresar al menu Condicional IF, ELSE IF ELSE");
    }

    public static void explicacionElse() {
        System.out.println("----------------------------------------" +
                "\n            ELSE         " +
                "\n----------------------------------------" +
                """
                        \nECon el if solo podemos hacer que se ejecute un fragmento
                         de código o no pero en el caso de que no se cumpla la
                         condición no se hace nada (sigue el flujo normal de ejecución)
                         por lo que si queremos que se ejecute otra cosa cuando no se
                         cumpla la condición solo con el if tenemos que hacer otro con
                         la condición inversa provocando que se tenga que comprobar
                         la condición 2 veces mientras que si usamos el else solo
                         necesitamos hacer la comprobación una sola vez.
                        \n Por ejemplo:
                        \n
                        if (temperatura > 25) {
                            System.out.println("A la playa!!!");
                        }

                        if (temperatura <= 25) {
                            System.out.println("Esperando al buen tiempo...");
                        }

                        // Usando if con else
                        // Si la temperatura es mayor que 25 ... y si no ...
                        if (temperatura > 25) {
                            System.out.println("A la playa!!!");
                        } else {
                            System.out.println("Esperando al buen tiempo...");
                        }
                        \n----------------------------------------
                        """);
        System.out.println("Digita Enter para regresar al menu Condicional IF, ELSE IF ELSE");
    }

    public static int opcionSwitch(Scanner scannera) {
        System.out.println("""
                ---------------------------------------
                             Condicional SWITCH
                ----------------------------------------
                -1.          Condicional SWITCH               \s
                -2.          Programa Calificación
                -0           Salir            \s
                 Digite una opción:""");
        return scannera.nextInt();
    }

    public static void explicacionSwitch() {
        System.out.println("---------------------------------------" +
                "\n           Condicional SWITCH" +
                "\n----------------------------------------" +
                """
                        \n
                                       El switch en Java es una estructura de control
                                       que permite ejecutar diferentes bloques de código
                                       en función del valor de una variable. Imagina que
                                       tienes un semáforo con múltiples luces;
                                       el switch actúa como un operador que selecciona
                                       qué luz encender basado en el estado actual del
                                       tráfico. En Java, esta estructura es ideal cuando
                                       se tienen múltiples caminos posibles y se desea
                                       simplificar la lógica de decisión.

                                       \nPor ejemplo, considera el siguiente código básico:

                                       int numero = 2;
                                       switch (numero) {
                                                   case 1:
                                                        System.out.println("Uno");
                                                        break;
                                                   case 2:
                                                        System.out.println("Dos");
                                                        break;
                                                        default:
                                                        System.out.println("Otro número");
                                                        }
                                 \n
                                       Aquí, el switch evalúa el valor de numero. Si es 1, imprime "Uno";
                                       si es 2, imprime "Dos"; y si es cualquier otro número, imprime
                                       "Otro número".
                                        

                                                      Sintaxis de la Sentencia Switch

                                \n
                                      La sintaxis de una sentencia switch es crucial para su correcto
                                      funcionamiento. Debes definir claramente la variable a evaluar
                                      y luego enumerar los diferentes casos (cases) que quieres considerar.
                                      Cada caso debe finalizar con un break para evitar que se ejecuten los
                                      casos siguientes, a menos que desees un comportamiento específico.

                                \n---------------------------------------
                                """);
        System.out.println("Digita Enter para regresar al menu Condicional SWITCH");
    }

    public static int opcionTernario(Scanner scannerb) {
        System.out.println("""
                ---------------------------------------
                           Condicional TERNARIO
                ----------------------------------------
                -1.            Qué es un condicional Ternario
                -2.            Programa numero par o impar
                -0             Salir   \s
                 Digite una opción:""");
        return scannerb.nextInt();
    }

    public static void explicacionTernario() {
        System.out.println("---------------------------------------" +
                "\n           Condicional TERNARIO" +
                "\n----------------------------------------" +
                """
                        \n
                                En ocasiones un if se utiliza simplemente para obtener
                                un valor u otro en función de si una se cumple una
                                condición o no, en estos casos se puede sustituir la
                                estructura if else por el operador ternario u operador
                                condicional que tiene la sintaxis
                                resultado = condicion ? valor_si_se_cumple : valor_si_no_se_cumple
                                los valores tanto para el caso de que se cumpla
                                como para el que no pueden ser valores directamente como
                                un texto o un entero o llamadas a funciones que devuelvan
                                un objeto del tipo esperado.


                                // Ejemplo 1
                                String queHacer = (temperatura > 25) ? "A la playa!!!" : "Esperando al buen tiempo...";

                                // Ejemplo 2
                                double numero = (temperatura > 10) ? (Math.random() * 10) : 0;

                                // Ejemplo 3
                                Comida miComida = cansado ? pedirComida("china") : hacerComida();\s

                        """);
        System.out.println("Digita Enter para regresar al menu Condicional ternario");
    }
    public static int opcionDowhile(Scanner scannerb){
        System.out.println("""
                ---------------------------------------
                          BUCLE DO WHILE
                ----------------------------------------
                -1.            ¿Qué es un bucle Do While?
                -2.            Programa adivina el número
                -0             Salir   \s
                 Digite una opción:""");
        return scannerb.nextInt();
    }
    public static void explicacionDowhile(){
        System.out.println("---------------------------------------" +
                "\n           ¿Qué es un bucle Do While?" +
                "\n----------------------------------------" +
                """
                        \n
                        Los ciclos do-while son una estructura
                        de control cíclica, que nos permiten
                        ejecutar una o varias líneas de código
                        de forma repetitiva sin necesidad de
                        tener un valor inicial e incluso a veces
                        sin siquiera conocer cuándo se va a dar
                        el valor final. Hasta ahí son similares
                        a los ciclos while, sin embargo, el
                        ciclo do-while nos permite añadir cierta
                        ventaja adicional puesto que nos permite
                        ejecutar primero el bloque de instrucciones
                        antes de evaluar la condición necesaria.
                        \n
                        Sintaxis del Ciclo Do-While en Java
                        \n
                                        do
                                        {
                                                ....
                                                ....
                                            Bloque de Instrucciones....
                                                ....
                                                ....
                                        }
                                        while(condición de finalización);

                        """);
        System.out.println("Digita Enter para regresar al menu Bucle Do While");
    }
    public static int opcionWhile(Scanner scannerb){
        System.out.println("""
                ---------------------------------------
                          BUCLE WHILE
                ----------------------------------------
                -1.            ¿Qué es WHILE?
                -2.            Programa Sumatoria de n números
                -0             Salir   \s
                 Digite una opción:""");
        return scannerb.nextInt();
    }
    public static void explicacionWhile(){
        System.out.println("---------------------------------------" +
                "\n           ¿Qué es WHILE?" +
                "\n----------------------------------------" +
                """
                        \n
                                El bucle while es tan sencillo como decir
                                mientras se cumpla la condición se ejecuta
                                el código que haya dentro del bucle, y en
                                el momento que ya no se cumpla esa condición
                                se sale del bucle.

                                while (condicion) {
                                            ...
                                        }

                        """);
        System.out.println("Digita Enter para regresar al menu Bucle While");
    }
    public static int opcionFor(Scanner scannerb){
        System.out.println("""
                ---------------------------------------
                          BUCLE FOR
                ----------------------------------------
                -1.            ¿Qué es un  bucle FOR?
                -2.            Programa Sumatoria de n números
                -0             Salir   \s
                 Digite una opción:""");
        return scannerb.nextInt();
    }
    public static void explicacionFor(){
        System.out.println("---------------------------------------" +
                "\n           ¿Qué es un  bucle FOR?" +
                "\n----------------------------------------" +
                """
                                       El bucle for sirve para ejecutar un código
                                       un número conocido de veces, por ejemplo
                                       recorrer un array o cualquier otro tipo de
                                       colección o simplemente ejecutar el código
                                       un número concreto de veces.
                        \n
                                       La estructura de un ciclo for es:

                                       for (inicializacion; condicion; actualizacion) {
                                                               ...
                                       }
                        """);
        System.out.println("Digita Enter para regresar al menu Bucle For");
    }
}
