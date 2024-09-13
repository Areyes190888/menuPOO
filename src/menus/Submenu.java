package menus;

import java.awt.*;
import java.util.Scanner;

public class Submenu {
    public static int datosPrimitivos (Scanner scannerb){
        System.out.println("----------------------------------------" +
                "\n             Datos primitivos" +
                "\n----------------------------------------" +
                "\n-1.          Explicación byte.         -" +
                "\n-2.          Explicación short.        -" +
                "\n-3.          Explicación int.          -" +
                "\n-4.          Explicación long.         -" +
                "\n-5.          Explicación float.        -" +
                "\n-6.          Explicación double.       -" +
                "\n-7.          Explicación char.         -" +
                "\n-8.          Explicación boolean.      -" +
                "\n-0.          Salir                     -" +
                "\nDigite una opción:");

        return scannerb.nextInt();
    }
    public static void menuTipoOperadores() {

        System.out.println("---------------------------------------" +
                "\n           Tipos de operadores" +
                "\n----------------------------------------" +
                "\n-1.            Aritmeticos" +
                "\n-2.            Relacionales" +
                "\n-3.            Logicos" +
                "\n-4.            Asignación" +
                "\n-5.       Incremente/Decremento" +
                "\n-0.               Salir" +
                "\n---------------------------------------" +
                "\n Digite una opción:");
    }
   }
