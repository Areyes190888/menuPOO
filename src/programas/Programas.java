package programas;

import java.util.Scanner;

public class Programas {

    public static void edad (){
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
    }
    public static void calificacion(){
        System.out.println("----------------------------------------" +
                "\n Programa calificación");

        int nota;
        System.out.println("Ingrese su calificación:");
        Scanner scaneredad = new Scanner(System.in);
        nota = scaneredad.nextInt();

        if (nota <= 10) {
            switch (nota) {
                case 1, 2 -> System.out.println("Su calificación es: F");
                case 3, 4 -> System.out.println("Su calificación es: D");
                case 5, 6 -> System.out.println("Su calificación es: C");
                case 7, 8 -> System.out.println("Su calificación es: B");
                case 9, 10 -> System.out.println("Su calificación es: A");
            }

        } else {
            System.out.println("Número no válido, por favor verifique");
        }

        System.out.println("Digita Enter para regresar al menu Condicional SWITCH");
    }
    public static void parImpar(){
        System.out.println("""
                ----------------------------------------
                Programa operador ternario validar número impar o par
                ----------------------------------------""");

        System.out.println("Ingresar un numero entero");
        int c;
        Scanner scannerc = new Scanner(System.in);
        c = scannerc.nextInt();

        String salida = (c % 2 == 0) ? "par" : "impar";
        System.out.println("El número es " + salida +
                "\n----------------------------------------");
        System.out.println("Digita Enter para regresar al menu Condicional ternario");
    }
    public static void adivinaNumero(){
        System.out.println("----------------------------------------" +
                "\n Programa Adivina el número");

        int aleatorio = (int)(Math.random()*100);
        Scanner c = new Scanner(System.in);
        int numero;
        System.out.println("Adivina el numero, Ingresa tu numero:");
        numero = c.nextInt();

        while ( numero != aleatorio){

            if (numero > aleatorio){
                System.out.println("El numero es mas bajo");
            }
            else {
                System.out.println("El numero es mas alto");
            }
            System.out.println("Ingresa otro numero");
            numero = c.nextInt();
        }
        System.out.println("Adivinaste el numero");

        System.out.println("Digita Enter para regresar al menu Condicional DoWhile");
    }
    public static void sumatoria(){
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
    }
    public static void sumatoriaFor(){
        System.out.println("""
                ---------------------------------------
                 Programa Sumatoria de n números
                 ---------------------------------------""");


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
    }
}
