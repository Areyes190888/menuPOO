package ejecucion;

import com.sun.source.tree.WhileLoopTree;
import explicaciones.Explicaciones;
import menus.MenuPrincipal;
import menus.Submenu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    /*Taller: Crear un menú con los temas de clase*/
    public static void main(String[] args) {
        //Declaración de variables

        Scanner scannera = new Scanner(System.in);
        Scanner scannerb = new Scanner(System.in);
        Scanner scannermenuprincipal = new Scanner(System.in);
        Scanner scannermenu2 = new Scanner(System.in);

        String menuprincipal;
        String menu2;
        int a;
        int b;

        //bucle que me controla el menu principal
        do {
            MenuPrincipal.menuPrincipal();
            a = scannera.nextInt();

            // Bucle que controla que la condición ingresada en el menu principal sea valida
            while (a < 0 || a > 10) {
                System.out.println("ingrese numero valido");
                a = scannera.nextInt();
            }
            switch (a) {
                case 1:
                    //do permite que pueda volver al menu datos primitivos
                    do {
                        b = Submenu.datosPrimitivos(scannerb);
                        //IF controla la opción salir del menu de datos primitivos
                        if (b == 0) {
                            System.out.println("Eligio salir del menu datos primitivos, digite Enter para salir ");
                            break;
                        }
                        //Bucle que controla que la condición ingresada en el menu datos primitivos sea valida
                        do {
                            if (b == 1) {
                                Explicaciones.explicacionByte();
                                break;
                            } else if (b == 2) {
                              Explicaciones.explicacionShort();
                                break;
                            } else if (b == 3) {
                                Explicaciones.explicacionInt();
                                break;
                            } else if (b == 4) {
                                Explicaciones.explicacionLong();
                                break;
                            } else if (b == 5) {
                                Explicaciones.explicacionFloat();
                                System.out.println("Digita Enter para regresar al menu datos primitivos");
                                break;
                            } else if (b == 6) {
                                Explicaciones.explicacionDouble();
                                break;
                            } else if (b == 7) {
                                System.out.println("----------------------------------------" +
                                        "\n             Explicación char           " +
                                        "\n----------------------------------------" +
                                        "\nEs un tipo de datos que representa" +
                                        "\na un carácter Unicode sencillo de 16 bits." +
                                        "\n---------------------------------------");
                                System.out.println("Digita Enter para regresar al menu datos primitivos");
                                break;
                            } else if (b == 8) {
                                Explicaciones.explicacionBolean();
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en datos primitivos
                                while (b < 0 || b > 8) {
                                    System.out.println("Por favor digite opciones del submenu datos primitivos");
                                    b = scannerb.nextInt();
                                }
                            }
                        } while (b >= 1 || b <= 8);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 2:
                    Explicaciones.explicacionString();
                    break;
                case 3:
                    Explicaciones.explicacionConstantes();
                    break;
                case 4:
                    //do permite que pueda volver al menu tipo de operadores
                    do {
                       Submenu.menuTipoOperadores();
                        b = scannerb.nextInt();
                        //IF controla la opción salir del menu tipo de operadores
                        if (b == 0) {
                            System.out.println("Eligio salir del menu Tipos de operadores, digite Enter para salir ");
                            break;
                        }
                        //Bucle que controla que la condición ingresada en el menu tipo de operadores sea valida
                        do {
                            if (b == 1) {
                                System.out.println("----------------------------------------" +
                                        "\n             Aritmeticos          " +
                                        "\n----------------------------------------" +
                                        "\nLos operadores aritmeticos son simbolos" +
                                        "\nespeciales que se utilizan para realizar" +
                                        "\noperaciones matematicas en variables" +
                                        "\nnumericas. Los operadores son:" +
                                        "\nSuma: +, Resta: -, Multiplicación: *" +
                                        "\nDivisión: /, Modulo: %, Incremento: ++" +
                                        "\nDecremento: --" +
                                        "\n----------------------------------------");
                                System.out.println("Digita Enter para regresar al menu Tipo de operadores");
                                break;
                            } else if (b == 2) {
                                System.out.println("----------------------------------------" +
                                        "\n            Relacionales" +
                                        "\n----------------------------------------" +
                                        "\nLos operadores relacionales son los" +
                                        "\nsiguientes:" +
                                        "\nIgual a: ==, Diferente de: !=" +
                                        "\nMayor que: >, Menor que: <" +
                                        "\nMayor o igual que: >=," +
                                        "\nMenor o igual que: <=" +
                                        "\n----------------------------------------");
                                System.out.println("Digita Enter para regresar al menu Tipo de operadores");
                                break;
                            } else if (b == 3) {
                                System.out.println("----------------------------------------" +
                                        "\n              Logicos" +
                                        "\n----------------------------------------" +
                                        "\nLos operadores logicos son los siguientes:" +
                                        "\nAnd: &&, OR: ||" +
                                        "\n----------------------------------------");
                                System.out.println("Digita Enter para regresar al menu Tipo de operadores");
                                break;
                            } else if (b == 4) {
                                System.out.println("----------------------------------------" +
                                        "\n             Asignación" +
                                        "\n----------------------------------------" +
                                        "\nLos operadores de asignación permiten" +
                                        "\nasignar valores variables. A través de" +
                                        "\nestos operadores, se puede almacenar" +
                                        "\ninformación en variables para su" +
                                        "\nposterior uso en el programa. Los" +
                                        "\noperadores utilizados son:" +
                                        "\n+=, -=, *=, /=, entre otros." +
                                        "\n----------------------------------------");
                                System.out.println("Digita Enter para regresar al menu Tipo de operadores");
                                break;
                            } else if (b == 5) {
                                System.out.println("----------------------------------------" +
                                        "\n        Incremento/Decremento" +
                                        "\n----------------------------------------" +
                                        "\nLos operadores de Increment y Decremento" +
                                        "\nson utiles para modificar el valor de una" +
                                        "\nvariable en una unidad. El operadore de" +
                                        "\nincremento aumenta el valor de la " +
                                        "\nvariable en 1, mientras que el operador" +
                                        "\nde decremento lo disminuye en 1. Los" +
                                        "\noperadores son: Increment: ++," +
                                        "\nDecremento: --.");
                                System.out.println("Digita Enter para regresar al menu Tipo de operadores");
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en Tipo de operadores
                                while (b < 0 || b > 5) {
                                    System.out.println("Por favor digite opciones del submenu Tipo de operadores");
                                    b = scannerb.nextInt();
                                }
                            }
                        } while (b >= 1 || b <= 5);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 5:
                    do {
                        System.out.println("----------------------------------------" +
                                "\n       Condicional IF, ELSE IF ELSE" +
                                "\n----------------------------------------" +
                                "\n-1.         Explicación de IF" +
                                "\n-2.        Explicación de ELSE IF" +
                                "\n-3.        Explicación del ELSE" +
                                "\n-4.     Programa de IF, ELSE IF/ELSE" +
                                "\n-0.                 Salir" +
                                "\n---------------------------------------");
                        System.out.println("Digite una opción:");
                        b = scannerb.nextInt();
                        //IF controlar la opción para salir del menú Condicional
                        if (b == 0) {
                            System.out.println("Eligio salir del menu Condicional IF, ELSE IF ELSE, digite Enter para salir ");
                            break;
                        }
                        //Bucle que controla que la condición ingresada en el menu Condicional IF, ELSE IF ELSE sea valida
                        do {
                            if (b == 1) {
                                System.out.println("----------------------------------------" +
                                        "\n            IF          " +
                                        "\n----------------------------------------" +
                                        "\nLa estructura condicional más simple en Java es el if," +
                                        "\nse evalúa una condición y en caso de que se cumpla" +
                                        "\nse ejecuta el contenido entre las llaves {} " +
                                        "\no en caso de que se omitan se ejecuta el código " +
                                        "\nhasta el primer «;» por lo tanto si no se usan los {} " +
                                        "\nla condición aplica solo a la siguiente instrucción al if." +
                                        "\n----------------------------------------");
                                System.out.println("Digita Enter para regresar al menu Condicional IF, ELSE IF ELSE");
                                break;
                            } else if (b == 2) {
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
                                break;
                            } else if (b == 3) {
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
                                break;
                            } else if (b == 4) {
                                System.out.println("----------------------------------------" +
                                        "\n            Programa de IF, ELSE IF/ELSE         ");

                                int edad;
                                System.out.println("ingrese edad:");
                                Scanner scaneredad = new Scanner(System.in);
                                edad = scaneredad.nextInt();
                                System.out.println("edad ingresada" + " " + edad);

                                if (edad >= 0 && edad < 13) {
                                    System.out.println("es nino");
                                } else if (edad > 12 && edad <= 20) {

                                    System.out.println("es joven");
                                } else if (edad > 20 && edad <= 60) {
                                    System.out.println("es adulto");

                                } else if (edad > 60) {
                                    System.out.println("tercera edad");
                                }


                                System.out.println("Digita Enter para regresar al menu Condicional IF, ELSE IF ELSE");
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en Tipo de operadores
                                while (b < 0 || b > 4) {
                                    System.out.println("Por favor digite opciones del submenu Condicional IF, ELSE IF ELSE");
                                    b = scannerb.nextInt();
                                }
                            }
                        } while (b >= 1 || b <= 4);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 6:
                    do {
                        System.out.println("---------------------------------------" +
                                "\n             Condicional SWITCH" +
                                "\n----------------------------------------" +
                                "\n-1.          Condicional SWITCH                " +
                                "\n-2.          Programa Calificación" +
                                "\n-0           Salir             " +
                                "\n Digite una opción:");
                        b = scannerb.nextInt();
                        //IF controla la opción salir del menu tipo de operadores
                        if (b == 0) {
                            System.out.println("Eligio salir del menu Condicional SWITCH, digite Enter para salir ");
                            break;
                        }
                        //Bucle que controla que la condición ingresada en el menu tipo de operadores sea valida
                        do {
                            if (b == 1) {
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
                                                       "Otro número".\n

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
                                break;
                            } else if (b == 2) {
                                System.out.println("----------------------------------------" +
                                        "\n Programa calificación");

                                int nota;
                                System.out.println("Ingrese su calificación:");
                                Scanner scaneredad = new Scanner(System.in);
                                nota = scaneredad.nextInt();

                                if (nota <= 10) {
                                    switch (nota) {
                                        case 1, 2:
                                            System.out.println("Su calificación es: F");
                                            break;
                                        case 3, 4:
                                            System.out.println("Su calificación es: D");
                                            break;
                                        case 5, 6:
                                            System.out.println("Su calificación es: C");
                                            break;
                                        case 7, 8:
                                            System.out.println("Su calificación es: B");
                                            break;
                                        case 9, 10:
                                            System.out.println("Su calificación es: A");
                                            break;
                                    }

                                } else {
                                    System.out.println("Número no válido, por favor verifique");
                                }

                                System.out.println("Digita Enter para regresar al menu Condicional SWITCH");
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en el menu
                                while (b < 0 || b > 2) {
                                    System.out.println("Por favor digite opciones del submenu SWITCH");
                                    b = scannerb.nextInt();
                                }

                            }
                        } while (b >= 1 || b <= 2);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 7:
                    do {
                        System.out.println("---------------------------------------" +
                                "\n           Condicional TERNARIO" +
                                "\n----------------------------------------" +
                                "\n-1.            Qué es un condicional Ternario" +
                                "\n-2.            Programa numero par o impar" +
                                "\n-0             Salir    " +
                                "\n Digite una opción:");
                        b = scannerb.nextInt();
                        if (b == 0) {
                            System.out.println("Eligio salir del menu condicional ternario, digite Enter para salir ");
                            break;
                        }
                        //Bucle que controla que la condición ingresada en el menu  sea valida
                        do {
                            if (b == 1) {
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
                                break;
                            } else if (b == 2) {
                                System.out.println("----------------------------------------" +
                                        "\nPrograma operador ternario validar número impar o par" +
                                        "\n----------------------------------------");

                                System.out.println("Ingresar un numero entero");
                                int c;
                                Scanner scannerc = new Scanner(System.in);
                                c = scannerc.nextInt();

                                String salida = (c % 2 == 0) ? "par" : "impar";
                                System.out.println("El número es " + salida +
                                        "\n----------------------------------------");
                                System.out.println("Digita Enter para regresar al menu Condicional ternario");
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en Tipo de operadores
                                while (b < 0 || b > 2) {
                                    System.out.println("Por favor digite opciones del submenu Tipo de operadores");
                                    b = scannerb.nextInt();
                                }
                            }
                        } while (b >= 1 || b <= 2);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 8:
                    do {
                        System.out.println("---------------------------------------" +
                                "\n          BUCLE DO WHILE" +
                                "\n----------------------------------------" +
                                "\n-1.            ¿Qué es un bucle Do While?" +
                                "\n-2.            Programa adivina el número" +
                                "\n-0             Salir    " +
                                "\n Digite una opción:");
                        b = scannerb.nextInt();
                        if (b == 0) {
                            System.out.println("Eligio salir del menu Bucle Do While, digite Enter para salir ");
                            break;
                        }

                        //Bucle que controla que la condición ingresada en el menu  sea valida
                        do {
                            if (b == 1) {
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
                                break;
                            } else if (b == 2) {
                                System.out.println("----------------------------------------" +
                                        "\n Programa Adivina el número");

                                System.out.println("Digita Enter para regresar al menu Condicional SWITCH");
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en Tipo de operadores
                                while (b < 0 || b > 2) {
                                    System.out.println("Por favor digite una opcióm  del submenu Bucle Do While");
                                    b = scannerb.nextInt();
                                }
                            }
                        } while (b >= 1 || b <= 2);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 9:
                    do {
                        System.out.println("---------------------------------------" +
                                "\n          BUCLE WHILE" +
                                "\n----------------------------------------" +
                                "\n-1.            ¿Qué es WHILE?" +
                                "\n-2.            Programa Sumatoria de n números" +
                                "\n-0             Salir    " +
                                "\n Digite una opción:");
                        b = scannerb.nextInt();
                        if (b == 0) {
                            System.out.println("Eligio salir del menu Bucle While, digite Enter para salir ");
                            break;
                        }
                        do {
                            if (b == 1) {
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
                                break;
                            } else if (b == 2) {
                                System.out.println("----------------------------------------" +
                                        "\n Programa sumatoria de n números" +
                                        "---------------------------------------");

                                System.out.println("Digita un número hasta el cual quieras realizar" +
                                        "la sumatoria");
                                int num;
                                Scanner scannernum = new Scanner(System.in);
                                num = scannernum.nextInt();
                                int sumatoria = 0;
                                int x = 1;
                                while (x <= num) {
                                    sumatoria += x;
                                    x++;
                                }
                                System.out.println(sumatoria);


                                System.out.println("Digita Enter para regresar al menu Bucle While");
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en menu Bucle While
                                while (b < 0 || b > 2) {
                                    System.out.println("Por favor digite una opcion válida del submenu Bucle While");
                                    b = scannerb.nextInt();
                                }
                            }

                        } while (b >= 1 || b <= 2);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;

                case 10:
                    do {
                        System.out.println("---------------------------------------" +
                                "\n          BUCLE FOR" +
                                "\n----------------------------------------" +
                                "\n-1.            ¿Qué es un  bucle FOR?" +
                                "\n-2.            Programa Sumatoria de n números" +
                                "\n-0             Salir    " +
                                "\n Digite una opción:");
                        b = scannerb.nextInt();
                        if (b == 0) {
                            System.out.println("Eligio salir del menu Bucle For, digite Enter para salir ");
                            break;
                        }
                        do {
                            if (b == 1) {
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
                                break;
                            } else if (b == 2) {
                                System.out.println("---------------------------------------" +
                                        "\n Programa Sumatoria de n números" +
                                        "\n ---------------------------------------");


                                System.out.println("Se realiza una sumatoria de los numeros enteros hasta un valor x. Ingrese el valor x:");
                                Scanner scanerx = new Scanner(System.in);
                                int x;
                                x = scanerx.nextInt();
                                int suma = 0;

                                for (int i = 1; i <= x; i++) {
                                    suma += i;
                                }
                                System.out.println("la sumatoria es " + suma);

                                System.out.println("Digita Enter para regresar al menu Bucle For");
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en menú
                                while (b < 0 || b > 2) {
                                    System.out.println("Por favor digite opciones del submenu Bucle For");
                                    b = scannerb.nextInt();
                                }
                            }
                        } while (b >= 1 || b <= 2);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                // Salir del programa.
                case 0:
                    System.out.println("Vas a salir del menú, presiona enter para continuar");
                    break;

            }
            menuprincipal = scannermenuprincipal.nextLine();
        } while (a != 0);
        //while (menuprincipal.isEmpty()) ;

    }
}
