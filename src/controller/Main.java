package controller;

import controller.library.Session;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean isOn = true;
        while (isOn){
            System.out.println("""
                                    _______________________________________________________________

                                    ** Biblioteca La Pingüinera **
                                    
                                    Bienvenido!
                                    
                                    1 Iniciar sesión
                                    2 Registrarse
                                    
                                    3 Ir al menú de atrás
                                    0 Terminar programa
                                    
                                    """);
            System.out.print("Digite el número de la opción deseada: ");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> Session.logIn();
                case 2 -> {}//registrarse();
                case 0 -> {
                    System.out.println("""
                                    _______________________________________________________________

                                    Programa terminado. ¡Vuelva pronto a nuestra biblioteca!
                                    
                                    _______________________________________________________________""");
                    isOn = false;
                }
                default -> {
                    System.out.println("Opción inválida");
                    isOn = false;
                }
            }
        }
    }
}