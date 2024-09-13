package explicaciones;

import java.util.Scanner;

public class Explicaciones {
    public static void explicacionByte (){
        System.out.println("----------------------------------------" +
                "\n             Explicación Byte           " +
                "\n----------------------------------------" +
                "\nRepresenta un tipo de dato de 8 bits" +
                "\ncon signo. De tal manera que puede" +
                "\nalmacenar los valores numéricose -128" +
                "\na 127 (ambos inclusive)." +
                "\n----------------------------------------");
        System.out.println("Digita Enter para regresar al menu datos primitivos");

    }

    public static void explicacionShort(){
        System.out.println("----------------------------------------" +
                "\n             Explicación short           " +
                "\n----------------------------------------" +
                "\nRepresenta un tipo de dato de 16 bits" +
                "\ncon signo. De esta manera almacena valores" +
                "\nnuméricos de -32.768 a 32.767" +
                "\n----------------------------------------");
        System.out.println("Digita Enter para regresar al menu datos primitivos");

    }
    public static void explicacionInt(){
        System.out.println("----------------------------------------" +
                "\n             Explicación int           " +
                "\n----------------------------------------" +
                "\nEs un tipo de dato de 32 bits" +
                "\ncon signo para almacenar valores numéricos" +
                "\nCuyo valor mínimo es -231 y el valor máximo 231-1." +
                "\n----------------------------------------");
        System.out.println("Digita Enter para regresar al menu datos primitivos");
    }
    public static void explicacionLong(){
        System.out.println("----------------------------------------" +
                "\n             Explicación long           " +
                "\n----------------------------------------" +
                "\nEs un tipo de dato de 64 bits" +
                "\ncon signo que almacena valores numéricos" +
                "\nentre -263 a 263-1" +
                "\n---------------------------------------");
        System.out.println("Digita Enter para regresar al menu datos primitivos");
    }
    public static void explicacionFloat() {

        System.out.println("----------------------------------------" +
                "\n             Explicación float           " +
                "\n----------------------------------------" +
                "\nEs un tipo dato para almacenar números" +
                "\nen coma flotante con precisión simple de" +
                "\n32 bits." +
                "\n---------------------------------------");
    }
    public static void explicacionDouble(){
        System.out.println("----------------------------------------" +
                "\n             Explicación double           " +
                "\n----------------------------------------" +
                "\nEs un tipo dato para almacenar números" +
                "\nen coma flotante con doble precisión de" +
                "\n64 bits." +
                "\n---------------------------------------");
        System.out.println("Digita Enter para regresar al menu datos primitivos");
    }
    public static void explicacionBolean(){
        System.out.println("----------------------------------------" +
                "\n             Explicación boolean           " +
                "\n----------------------------------------" +
                "\nSirve para definir tipos de datos booleanos." +
                "\nEs decir, aquellos que tienen un valor " +
                "\nde true o false. Ocupa 1 bit de información." +
                "\n---------------------------------------");
        System.out.println("Digita Enter para regresar al menu datos primitivos");
    }
    public static void explicacionString(){
        System.out.println("----------------------------------------" +
                "\n                  String" +
                "\n Un objeto String representa una cadena" +
                "\n alfanumérica de un valor constante que" +
                "\n no puede ser cambiada después de haber" +
                "\n sido creada.Un objeto StringBuffer" +
                "\n representa una cadena cuyo tamaño " +
                "\n puede variar. Los Strings son objetos." +
                "\n constantes y por lo tanto muy baratos " +
                "\n para el sistema" +
                "\n----------------------------------------");
        System.out.println("Digita Enter para regresar al menu principal");
    }
    public static void  explicacionConstantes() {
        System.out.println("----------------------------------------" +
                "\n                Constantes" +
                "\n----------------------------------------" +
                "\n Una constante es un valor fijo dado" +
                "\n que no debe cambiar. Este es un valor" +
                "\n constante que se conoce antes de que" +
                "\n la aplicación comience a ejecutarse y" +
                "\n se establece en el código una vez." +
                "\n----------------------------------------");
        System.out.println("Digita Enter para regresar al menu principal");
    }
}
