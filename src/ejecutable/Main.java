package ejecutable;
import controladores.Controladores;
import menu.Menu;
import programas.Programas;
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

        do {//Bucle que me controla el menu principal
            a = Menu.opcionMenuprincipal(scannera);
            a = Controladores.menuValidoprincipal(scannera, a);//controla que la condición ingresada en el menu principal sea valida
            switch (a) {
                case 1:
                    do {
                        b = Menu.opcionMenuprimitivos(scannerb);
                        if (b == 0) {
                            System.out.println("Eligio salir del menu datos primitivos, digite Enter para salir ");
                            break;
                        }
                        do {
                            if (b == 1) {
                                Menu.explicacionByte();
                                break;
                            } else if (b == 2) {
                                Menu.explicacionShort();
                                break;
                            } else if (b == 3) {
                                Menu.explicacionInt();
                                break;
                            } else if (b == 4) {
                                Menu.explicacionLong();
                                break;
                            } else if (b == 5) {
                                Menu.explicacionFloat();
                                break;
                            } else if (b == 6) {
                                Menu.explicacionDouble();
                                break;
                            } else if (b == 7) {
                                Menu.explicacionChar();
                                break;
                            } else if (b == 8) {
                                Menu.explicacionBoolean();
                                break;
                            } else {
                                 b = Controladores.menuValidoprimitivo(scannerb, b);
                            }
                        } while (b >= 1 || b <= 8);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 2:
                    Menu.explicacionString();
                    break;
                case 3:
                    Menu.explicacionConstantes();
                    break;
                case 4:
                    //do permite que pueda volver al menu tipo de operadores
                    do {
                        b = Menu.opcionMenuTO(scannerb);
                        //IF controla la opción salir del menu tipo de operadores
                        if (b == 0) {
                            System.out.println("Eligio salir del menu Tipos de operadores, digite Enter para salir ");
                            break;
                        }
                        //Bucle que controla que la condición ingresada en el menu tipo de operadores sea valida
                        do {
                            if (b == 1) {
                                Menu.explicacionAritmeticos();
                                break;
                            } else if (b == 2) {
                                Menu.explicacionRelacionales();
                                break;
                            } else if (b == 3) {
                                Menu.explicacionLogicos();
                                break;
                            } else if (b == 4) {
                                Menu.explicacionAsignacion();
                                break;
                            } else if (b == 5) {
                                Menu.explicacionIncrementodec();
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en Tipo de operadores
                                b= Controladores.menuValidoto(scannerb, b);
                            }
                        } while (b >= 1 || b <= 5);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 5:
                    do {
                        b = Menu.opcionCondicionalif(scannerb);
                        //IF controlar la opción para salir del menú Condicional
                        if (b == 0) {
                            System.out.println("Eligio salir del menu Condicional IF, ELSE IF ELSE, digite Enter para salir ");
                            break;
                        }
                        //Bucle que controla que la condición ingresada en el menu Condicional IF, ELSE IF ELSE sea valida
                        do {
                            if (b == 1) {
                                Menu.explicacionIf();
                                break;
                            } else if (b == 2) {
                                Menu.explicacionElseif();
                                break;
                            } else if (b == 3) {
                                Menu.explicacionElse();
                                break;
                            } else if (b == 4) {
                                Programas.edad();
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en Tipo de operadores
                                b= Controladores.menuIfelse(scannerb, b);
                            }
                        } while (b >= 1 || b <= 4);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 6:
                    do {
                       b = Menu.opcionSwitch(scannera);
                        //IF controla la opción salir del menu tipo de operadores
                        if (b == 0) {
                            System.out.println("Eligio salir del menu Condicional SWITCH, digite Enter para salir ");
                            break;
                        }
                        //Bucle que controla que la condición ingresada en el menu tipo de operadores sea valida
                        do {
                            if (b == 1) {
                                Menu.explicacionSwitch();
                                break;
                            } else if (b == 2) {
                                Programas.calificacion();
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en el menu
                                b = Controladores.menuSwitch(scannerb, b);
                            }
                        } while (b >= 1 || b <= 2);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 7:
                    do {
                        b = Menu.opcionTernario(scannerb);
                        if (b == 0) {
                            System.out.println("Eligio salir del menu condicional ternario, digite Enter para salir ");
                            break;
                        }
                        //Bucle que controla que la condición ingresada en el menu  sea valida
                        do {
                            if (b == 1) {
                                Menu.explicacionTernario();
                                break;
                            } else if (b == 2) {
                                Programas.parImpar();
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en Tipo de operadores
                                b = Controladores.menuTernario(scannerb, b);
                            }
                        } while (b >= 1 || b <= 2);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 8:
                    do {
                        b = Menu.opcionDowhile(scannerb);
                        if (b == 0) {
                            System.out.println("Eligio salir del menu Bucle Do While, digite Enter para salir ");
                            break;
                        }
                        //Bucle que controla que la condición ingresada en el menu  sea valida
                        do {
                            if (b == 1) {
                                Menu.explicacionDowhile();
                                break;
                            } else if (b == 2) {
                                Programas.adivinaNumero();
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en Tipo de operadores
                                b = Controladores.menuDowhile(scannerb, b);
                            }
                        } while (b >= 1 || b <= 2);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 9:
                    do {
                        b = Menu.opcionWhile(scannerb);
                        if (b == 0) {
                            System.out.println("Eligio salir del menu Bucle While, digite Enter para salir ");
                            break;
                        }
                        do {
                            if (b == 1) {
                                Menu.explicacionWhile();
                                break;
                            } else if (b == 2) {
                                Programas.sumatoria();
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en menu Bucle While
                                b = Controladores.menuWhile(scannerb, b);
                            }
                        } while (b >= 1 || b <= 2);
                        menu2 = scannermenu2.nextLine();
                    } while (menu2.isEmpty());
                    break;
                case 10:
                    do {
                        b = Menu.opcionFor(scannerb);
                        if (b == 0) {
                            System.out.println("Eligio salir del menu Bucle For, digite Enter para salir ");
                            break;
                        }
                        do {
                            if (b == 1) {
                                Menu.explicacionFor();
                                break;
                            } else if (b == 2) {
                                Programas.sumatoriaFor();
                                break;
                            } else {
                                //mensaje para controla que se elija una opción correcta en menú
                                b = Controladores.menuFor(scannerb,b);
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
    }
}