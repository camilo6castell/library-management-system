package controller.library;

import data.DataBase;

import model.loans.Loan;
import model.texts.Book;
import model.texts.Novel;
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
                                
                                1 Listar libros o novelas disponibles para prestar
                                2 Listar por autor todos los textos en la biblioteca
                                
                                3 Ver historial de peticiones de textos
                                                             
                                4 Cerrar sesión
                                0 Terminar programa
                                
                                """, reader.getName());
            System.out.println();
            System.out.print("Digita la opción deseada: ");
            int option = Integer.parseInt(scanner.next());
            System.out.println();
            switch (option) {
                case 1 -> Menu1(reader);
                case 2 -> Menu2(reader);
                case 3 -> Menu3(reader);
                case 4 -> loginReader = false;
                case 0 -> {
                    System.out.println("""
                            _______________________________________________________________

                            Programa terminado. ¡Vuelva pronto a nuestra biblioteca!
                            _______________________________________________________________""");
                    System.exit(0);
                }

            }
        }
    }
    // MENU 1
    public static void Menu1(Reader reader){
        Scanner scanner = new Scanner(System.in);
        boolean menu1 = true;
        while (menu1) {
            System.out.println("""
                            _______________________________________________________________

                            Mostrar libros o novelas
                            
                            ¿Qué deseas listar?"
                            
                            1 Mostrar libros disponibles
                            2 Mostrar novelas disponibles
                            
                            3 Ir al menú de atrás
                            4 Salir
                            
                            """);
            System.out.print("Digita la opción deseada: ");
            int option = Integer.parseInt(scanner.next());
            System.out.println();
            System.out.print("_______________________________________________________________");
            System.out.println();
            switch (option) {
                case 1 -> Menu11(reader);
                case 2 -> Menu12(reader);
                case 3 -> menu1 = false;
                case 4 -> {
                    System.out.println("""
                            _______________________________________________________________

                            Programa terminado. ¡Vuelva pronto a nuestra biblioteca!
                            _______________________________________________________________""");
                    System.exit(0);
                }
                default ->
                    throw new IllegalStateException("Opción no contemplada: " + option);
            }
        }
    }
    public static void Menu11(Reader reader){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Lista de libros disponibles >");
        System.out.println();
        reader.getAvailableBooks(DataBase.libraryBooks);
        System.out.println();
        System.out.println("""
                            ¿Qué deseas hacer?
                            
                            1 para pedir prestado un libro de la lista
                            
                            2 para volver al menú anterior
                            
                            """);
        System.out.print("Digita la opción deseada: ");
        int option = scanner.nextInt();
        System.out.println();
        switch (option){
            case 1:
                Book.setBookLoan(reader);
                break;
            case 2:
                break;
        }
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    public static void Menu12(Reader reader){
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
                Novel.setNovelLoan(reader);
                break;
            case 2:
                break;
        }
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    // MENU 2
    public static void Menu2(Reader reader){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Lista por autor de todos los textos en la biblioteca >");
        System.out.println();
        Reader.getListByAuthor(DataBase.libraryBooks, DataBase.libraryNovels);
        System.out.println();
        System.out.println();
        System.out.print("Digita 1 para volver al menú anterior: ");
        scanner.nextInt();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }

    // MENU 3
    public static void Menu3(Reader reader){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Historial de peticiones de textos >");
        System.out.println();
        Loan.loansByUser(DataBase.libraryLoans, reader.getEmail());
        System.out.println();
        System.out.println();
        System.out.print("Digita 1 para volver al menú anterior: ");
        scanner.nextInt();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
}
