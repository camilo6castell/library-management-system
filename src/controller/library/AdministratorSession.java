package controller.library;

import models.texts.Book;
import models.texts.Novel;

import models.users.Administrator;

import java.util.Scanner;

import data.DataBase;
public class AdministratorSession {

    public static void AdministratorMenu(Administrator administrator) {
        Scanner scanner = new Scanner(System.in);
        boolean loginAdmin = true;
        while (loginAdmin) {

            int option = Integer.parseInt(scanner.next());
            System.out.println();
            switch (option) {

                case 2:
                    Menu2(administrator);
                    break;
                case 3:
                    Menu3(administrator);
                    break;
                case 4:
                    Menu4(administrator);
                    break;
                case 5:
                    Menu5(administrator);
                    break;
                case 6:
                    Menu6(administrator);
                    break;
                case 7:
                    Menu7(administrator);
                    break;
                case 8:
                    Menu8(administrator);
                    break;
                case 9:
                    loginAdmin = false;
                    break;
                case 0:
                    System.out.println("""
                            _______________________________________________________________

                            Programa terminado. ¡Vuelva pronto a nuestra biblioteca!
                            _______________________________________________________________""");
                    System.exit(0);
                default:
                    throw new IllegalStateException("Opción no contemplada: " + option);
            }
        }
    }

    // MENU PARTS /////////////////////////////////////////////////////////////////////////////////////////////////////

    // MENU 3
    public static void Menu3(Administrator administrator){
        Scanner scanner = new Scanner(System.in);
        boolean menu3 = true;
        while (menu3) {
            System.out.println();
            System.out.println("Eliminar libro o novela");
            System.out.println();
            System.out.println("¿Qué deseas actualizar");
            System.out.println();
            System.out.println("1 Eliminar libro");
            System.out.println("2 Eliminar novela");
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
                    Menu31(administrator);
                    break;
                case 2:
                    Menu32(administrator);
                    break;
                case 3:
                    menu3 = false;
                    break;
                case 4:
                    System.out.println("""
                            _______________________________________________________________

                            Programa terminado. ¡Vuelva pronto a nuestra biblioteca!
                            _______________________________________________________________""");
                    System.exit(0);
                default:
                    throw new IllegalStateException("Opción no contemplada: " + option);
            }
        }
    }
    public static void Menu31 (Administrator administrator){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Eliminando libro >");
        System.out.println();
        System.out.println("Elija el libro que desea eliminar: ");
        System.out.println();
        for (int i = 0; i < DataBase.libraryBooks.size(); i++) {
            Book book = DataBase.libraryBooks.get(i);
            String title = book.getTitle();
            String author = book.getAuthor();
            System.out.format("%d Titulo: %s - Autor: %s\n", i + 1, title, author);
        }
        System.out.println();
        System.out.print("Digita el número del libro a eliminar: ");
        int libraryBookIndex = Integer.parseInt(scanner.next());
        Book toDeleteBook = DataBase.libraryBooks.get(libraryBookIndex - 1);
        administrator.deleteBook(DataBase.libraryBooks, toDeleteBook);
        System.out.println();
        System.out.println("Libro eliminado con éxito. \n Volviendo al menú anterior");
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    public static void Menu32(Administrator administrator){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Eliminando novela >");
        System.out.println();
        System.out.println("Elija la novela que desea eliminar: ");
        System.out.println();
        for (int i = 0; i < DataBase.libraryNovels.size(); i++) {
            Novel novel = DataBase.libraryNovels.get(i);
            String title = novel.getTitle();
            String author = novel.getAuthor();
            System.out.format("%d Titulo: %s - Autor: %s\n", i + 1, title, author);
        }
        System.out.println();
        System.out.print("Digita el número de la novela a eliminar: ");
        int libraryNovelIndex = Integer.parseInt(scanner.next());
        Novel toDeleteNovel = DataBase.libraryNovels.get(libraryNovelIndex - 1);
        administrator.deleteNovel(DataBase.libraryNovels, toDeleteNovel);
        System.out.println();
        System.out.println("Novela eliminada con éxito. \n Volviendo al menú anterior");
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    // MENU 4
    public static void Menu4(Administrator administrator){
        Scanner scanner = new Scanner(System.in);
        boolean menu4 = true;
        while (menu4) {
            System.out.println();
            System.out.println("Mostrar libros o novelas");
            System.out.println();
            System.out.println("¿Qué deseas ver");
            System.out.println();
            System.out.println("1 Mostrar libros");
            System.out.println("2 Mostrar novelas");
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
                    Menu41(administrator);
                    break;

                case 2:
                    Menu42(administrator);
                    break;
                case 3:
                    menu4 = false;
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
    public static void Menu41(Administrator administrator){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Lista de libros >");
        System.out.println();
        administrator.getBooks(DataBase.libraryBooks);
        System.out.println();
        System.out.print("Ingresa 1 para volver a menú anterior: ");
        scanner.next();
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    public static void Menu42(Administrator administrator){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Lista de novelas >");
        System.out.println();
        administrator.getNovels(DataBase.libraryNovels);
        System.out.println();
        System.out.print("Ingresa 1 para volver a menú anterior: ");
        scanner.next();
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    // MENU 5
    public static void Menu5(Administrator administrator){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Creando asistente >");
        System.out.println();
        System.out.print("Nombre del nuevo asistente: ");
        String name = scanner.next();
        System.out.print("Email del nuevo asistente: ");
        String email = scanner.next();
        System.out.print("Password del nuevo asistente: ");
        String password = scanner.next();
        administrator.addAssistant(DataBase.libraryAssistants, name, email, password);
        System.out.println();
        System.out.println("Asistente creado con éxito.");
        System.out.println();
        System.out.print("Ingrese 1 para volver al menú anterior: ");
        scanner.next();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    // MENU 6
    public static void Menu6(Administrator administrator){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Listado de lectores >");
        System.out.println();
        administrator.getReaders(DataBase.libraryReaders);
        System.out.println();
        System.out.print("Ingrese 1 para volver al menú anterior: ");
        scanner.next();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    // MENU 7
    public static void Menu7(Administrator administrator){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Listado de asistentes >");
        System.out.println();
        administrator.getAssistans(DataBase.libraryAssistants);
        System.out.println();
        System.out.print("Ingrese 1 para volver al menú anterior: ");
        scanner.next();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    // MENU 8
    public static void Menu8(Administrator administrator){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Listado de libros y novelas en el sistema >");
        System.out.println();
        administrator.getTexts(DataBase.libraryBooks, DataBase.libraryNovels);
        System.out.println();
        System.out.print("Ingrese 1 para volver al menú anterior: ");
        scanner.next();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
}




