package controller.library;

import data.DataBase;

import model.users.Reader;

import java.util.Scanner;

public class ReaderSession {
    public static void ReaderMenu(Reader reader){
        Scanner scanner = new Scanner(System.in);
        boolean loginReader = true;
        while (loginReader){
            System.out.format("""
                                _______________________________________________________________

                                Bienvenido lector %s
                                
                                ¿Qué deseas hacer?"
                                
                                1 Listar libros o novelas disponibles
                                2 Listar por autor todos los textos en la biblioteca
                                                             
                                3 Cerrar sesión
                                0 Terminar programa
                                
                                """, reader.getName());
            System.out.println();
            System.out.print("Digita la opción deseada: ");
            int option = Integer.parseInt(scanner.next());
            System.out.println();
            System.out.print("_______________________________________________________________");
            System.out.println();
            switch (option) {
                case 1:
                    Menu1(reader);
                    break;
                case 2:

                    break;
                case 3:
                    loginReader = false;
                    break;
                case 0:
                    System.out.println("""
                            _______________________________________________________________

                            Programa terminado. ¡Vuelva pronto a nuestra biblioteca!
                            _______________________________________________________________""");
                    System.exit(0);
            }
        }
    }
    // MENU 1
    public static void Menu1(Reader reader){
        Scanner scanner = new Scanner(System.in);
        boolean menu1 = true;
        while (menu1) {
            System.out.println();
            System.out.println("Mostrar libros o novelas");
            System.out.println();
            System.out.println("¿Qué deseas listar");
            System.out.println();
            System.out.println("1 Mostrar libros disponibles");
            System.out.println("2 Mostrar novelas disponibles");
            System.out.println();
            System.out.println("3 Ir al menú de atrás");
            System.out.println("4 Salir");
            System.out.println();
            System.out.print("Digita la opción deseada: ");
            int option = Integer.parseInt(scanner.next());
            System.out.println();
            System.out.print("_______________________________________________________________");
            System.out.println();
            switch (option) {
                case 1:
                    Menu41(reader);
                    break;

                case 2:
                    Menu42(reader);
                    break;
                case 3:
                    menu1 = false;
                    break;
                case 4:
                    System.out.println("""
                            _______________________________________________________________

                            Programa terminado. ¡Vuelva pronto a nuestra biblioteca!
                            _______________________________________________________________""");
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Opción no contemplada: " + option);
            }
        }
    }
    public static void Menu41(Reader reader){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Lista de libros disponibles >");
        System.out.println();
        reader.getAvailableBooks(DataBase.libraryBooks);
        System.out.println();
        System.out.println("""
                            ¿Qué deseas hacer?
                            
                            1 para Pedir prestado un libro de la lista
                            2 para volver al menú anterior
                            
                            """);
        System.out.print("Digita la opción deseada: ");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                reader.setBookLoan(reader);
                break;
            case 2:
                break;
        }
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    public static void Menu42(Reader reader){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Lista de novelas disponibles >");
        System.out.println();
        reader.getAvailableNovels(DataBase.libraryNovels);
        System.out.println();
        System.out.println("""
                            ¿Qué deseas hacer?
                            
                            1 para Pedir prestado una novela de la lista
                            2 para volver al menú anterior
                            
                            """);
        System.out.print("Digita la opción deseada: ");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                reader.setNovelLoan(reader);
                break;
            case 2:
                break;
        }
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
}
