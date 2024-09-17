package controladores;

import java.util.Scanner;

public class Controladores {

    public static int menuValidoprincipal(Scanner scannera, int a){
        while (a < 0 || a > 10) {
            System.out.println("ingrese numero valido");
            a = scannera.nextInt();
        }
            return a;
    }
    public static int menuValidoprimitivo(Scanner scannerb, int b){
            while (b < 0 || b > 8) {
                System.out.println("Por favor digite opciones del submenu datos primitivos");
                b= scannerb.nextInt();
            }
        return b;
    }

    public static int menuValidoto(Scanner scannerb, int b){
        while (b < 0 || b > 5) {
            System.out.println("Por favor digite opciones del submenu Tipo de operadores");
            b = scannerb.nextInt();
        }
        return b;
    }
    public static int menuIfelse(Scanner scannerb, int b){
        while (b < 0 || b > 4) {
            System.out.println("Por favor digite opciones del submenu Condicional IF, ELSE IF ELSE");
            b = scannerb.nextInt();
        }
        return b;
    }
    public static int menuSwitch(Scanner scannerb, int b){
        while (b < 0 || b > 2) {
            System.out.println("Por favor digite opciones del submenu SWITCH");
            b = scannerb.nextInt();
        }
        return b;
    }
    public static int menuTernario(Scanner scannerb, int b){
        while (b < 0 || b > 2) {
            System.out.println("Por favor digite opciones del submenu Tipo de operadores");
            b = scannerb.nextInt();
        }
        return b;
    }
    public static int menuDowhile(Scanner scannerb, int b){
        while (b < 0 || b > 2) {
            System.out.println("Por favor digite una opcióm  del submenu Bucle Do While");
            b = scannerb.nextInt();
        }
        return b;
    }
    public static int menuWhile(Scanner scannerb, int b){
        while (b < 0 || b > 2) {
            System.out.println("Por favor digite una opcion válida del submenu Bucle While");
            b = scannerb.nextInt();
        }
        return b;
    }
    public static int menuFor(Scanner scannerb, int b){
        while (b < 0 || b > 2) {
            System.out.println("Por favor digite opciones del submenu Bucle For");
            b = scannerb.nextInt();
        }
        return b;
    }


}
