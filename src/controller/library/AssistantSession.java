package controller.library;

import data.DataBase;

import model.loans.Loan;

import model.texts.Book;
import model.texts.Novel;

import model.users.Assistant;

import java.util.Scanner;

public class AssistantSession {

    public static void AssistantMenu(Assistant assistant){
        Scanner scanner = new Scanner(System.in);
        boolean loginAssistant = true;
        while (loginAssistant){
            System.out.println();
            System.out.println("Bienvenido asistente");
            System.out.println();
            System.out.println("¿Qué deseas hacer?");
            System.out.println();
            System.out.println("1 Agregar libro o novela");
            System.out.println("2 Actualizar libro o novela");
            System.out.println("3 Eliminar libro o novela");
            System.out.println("4 Mostrar libros o novelas en sistema");
            System.out.println();
            System.out.println("5 Marcar préstamo como 'Realizado'.");
            System.out.println("6 Marcar préstamo como 'Finalizado'.");
            System.out.println();
            System.out.println("7 Cerrar sesión");
            System.out.println("0 Cerrar sesión");
            System.out.println();
            System.out.print("Digita la opción deseada: ");
            int optionMenu1 = Integer.parseInt(scanner.next());
            System.out.println();
            System.out.print("_______________________________________________________________");
            System.out.println();
            switch (optionMenu1) {
                case 1 -> Menu1(assistant);
                case 2 -> Menu2(assistant);
                case 3 -> Menu3(assistant);
                case 4 -> Menu4(assistant);
                case 5 -> Menu5(assistant);
                case 6 -> Menu6(assistant);
                case 7 -> loginAssistant = false;
                case 0 -> {System.out.println("""
                            _______________________________________________________________

                            Programa terminado. ¡Vuelva pronto a nuestra biblioteca!
                            _______________________________________________________________""");
                    System.exit(0);}


            }
        }
    }
    // MENU 1
    public static void Menu1(Assistant assistant){
        Scanner scanner = new Scanner(System.in);
        boolean menu1 = true;
        while (menu1) {
            System.out.println("""
                                _______________________________________________________________

                                Agregar libro o novela
                                
                                ¿Qué deseas agregar?
                                
                                1 Agregar libro
                                2 Agregar novela
                                
                                3 Ir al menú de atrás
                                0 Terminar programa
                                
                                """);
            System.out.print("Digita la opción deseada: ");
            int option = Integer.parseInt(scanner.next());
            System.out.println();
            switch (option) {
                case 1:
                    Menu11(assistant);
                    break;
                case 2:
                    Menu12(assistant);
                    break;
                case 3:
                    menu1 = false;
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
    public static void Menu11(Assistant assistant){
        Scanner scanner = new Scanner(System.in);
        String title, author, knowledgeArea;
        int quantity, available, onLoan, pages;
        System.out.println();
        System.out.println();
        System.out.println("Agregando libro >");
        System.out.println();
        System.out.print("Título del libro: ");
        title = scanner.nextLine();
        System.out.println();
        System.out.print("Autor del libro: ");
        author = scanner.nextLine();
        System.out.println();
        System.out.print("Área del conocimiento: ");
        knowledgeArea = scanner.nextLine();
        System.out.println();
        System.out.print("Cantidad del libro a ingresar: ");
        quantity = scanner.nextInt();
        available = quantity;
        onLoan = 0;
        System.out.print("Número de páginas: ");
        pages = scanner.nextInt();
        assistant.addBook(DataBase.libraryBooks, title, author, quantity, available,
                onLoan, knowledgeArea, pages);
        System.out.println();
        System.out.print("¡Libro agregado con éxito!");
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    public static void Menu12(Assistant assistant){
        Scanner scanner = new Scanner(System.in);
        String title, author, genre;
        int quantity, available, onLoan, suggestedReadingAge;
        System.out.println();
        System.out.println();
        System.out.println("Agregando novela >");
        System.out.println();
        System.out.print("Título de la novela: ");
        title = scanner.nextLine();
        System.out.println();
        System.out.print("Autor de la novela: ");
        author = scanner.nextLine();
        System.out.println();
        System.out.print("Género: ");
        genre = scanner.nextLine();
        System.out.println();
        System.out.print("Cantidad de la novela a ingresar: ");
        quantity = scanner.nextInt();
        available = quantity;
        onLoan = 0;
        System.out.print("Edad sugerida de lectura: ");
        suggestedReadingAge = scanner.nextInt();
        assistant.addNovel(DataBase.libraryNovels, title, author, quantity, available,
                onLoan, genre, suggestedReadingAge);
        System.out.println();
        System.out.print("¡Novela agregada con éxito!");
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    // MENU 2
    public static void Menu2(Assistant assistant){
        Scanner scanner = new Scanner(System.in);
        boolean menu2 = true;
        while (menu2) {
            System.out.println("""
                                _______________________________________________________________

                                Actualizar libro o novela
                                
                                ¿Qué deseas actualizar?
                                
                                1 Actualizar libro
                                2 Actualizar novela
                                
                                3 Ir al menú de atrás
                                0 Terminar programa
                                
                                """);
            System.out.print("Digita la opción deseada: ");
            int option = Integer.parseInt(scanner.next());
            System.out.println();
            System.out.print("_______________________________________________________________");
            System.out.println();
            switch (option) {
                case 1:
                    Menu21(assistant);
                    break;
                case 2:
                    Menu22(assistant);
                    break;
                case 3:
                    menu2 = false;
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
    public static void Menu21(Assistant assistant){
        Scanner scanner = new Scanner(System.in);
        String title, author, knowledgeArea;
        int quantity, available, onLoan, pages;
        System.out.println();
        System.out.println("Actualizando libro >");
        System.out.println();
        System.out.println("Elija el libro que desea actualizar ");
        System.out.println();
        for (int i = 0; i < DataBase.libraryBooks.size(); i++) {
            Book book = DataBase.libraryBooks.get(i);
            title = book.getTitle();
            author = book.getAuthor();
            System.out.format("%d Titulo: %s - Autor: %s\n", i + 1, title, author);
        }
        System.out.println();
        System.out.print("Digita el número del libro a actualizar: ");
        int libraryBookIndex = Integer.parseInt(scanner.next());
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
        Book outDatedBook = DataBase.libraryBooks.get(libraryBookIndex - 1);
        System.out.println("Actualizando libro >");
        System.out.println();
        System.out.println("Titulo actual: " + outDatedBook.getTitle());
        System.out.print("Nuevo titulo: ");
        title = scanner.next();
        System.out.println("Autor actual: " + outDatedBook.getAuthor());
        System.out.print("Nuevo autor: ");
        author = scanner.next();
        System.out.println("Área de conocimiento actual: " + outDatedBook.getKnowledgeArea());
        System.out.print("Nueva Área de conocimiento: ");
        knowledgeArea = scanner.next();
        System.out.println("Cantidad actual: " + outDatedBook.getQuantity());
        System.out.print("Nueva cantidad: ");
        quantity = Integer.parseInt(scanner.next());
        System.out.println("Cantidad de disponibles para préstamo actual: " + outDatedBook.getAvailable());
        System.out.print("Nueva cantidad de disponibles para préstamo: ");
        available = Integer.parseInt(scanner.next());
        System.out.println("Cantidad en préstamo actual: " + outDatedBook.getOnLoan());
        System.out.print("Nueva cantidad de disponibles para préstamo: ");
        onLoan = Integer.parseInt(scanner.next());
        System.out.println("Cantidad de páginas actual: " + outDatedBook.getPages());
        System.out.print("Nueva cantidad de páginas: ");
        pages = Integer.parseInt(scanner.next());
        Book upDatedBook = new Book(title, author, quantity, available, onLoan, knowledgeArea, pages);
        assistant.updateBook(DataBase.libraryBooks, outDatedBook, upDatedBook);
        System.out.println();
        System.out.println("Libro actualizado con éxito. \n Volviendo al menú anterior");
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    public static void Menu22(Assistant assistant){
        Scanner scanner = new Scanner(System.in);
        String title, author, genre;
        int quantity, available, onLoan, suggestedReadingAge;
        System.out.println();
        System.out.println("Actualizando Novela >");
        System.out.println();
        System.out.println("Elija la novela que desea actualizar ");
        System.out.println();
        for (int i = 0; i < DataBase.libraryNovels.size(); i++) {
            Novel novel = DataBase.libraryNovels.get(i);
            title = novel.getTitle();
            author = novel.getAuthor();
            System.out.format("%d Titulo: %s - Autor: %s\n", i + 1, title, author);
        }
        System.out.println();
        System.out.print("Digita el número de la novela a actualizar: ");
        int libraryNovelIndex = Integer.parseInt(scanner.next());
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
        Novel outDatedNovel = DataBase.libraryNovels.get(libraryNovelIndex - 1);
        System.out.println("Actualizando Novela >");
        System.out.println();
        System.out.println("Titulo actual: " + outDatedNovel.getTitle());
        System.out.print("Nuevo titulo: ");
        title = scanner.next();
        System.out.println("Autor actual: " + outDatedNovel.getAuthor());
        System.out.print("Nuevo autor: ");
        author = scanner.next();
        System.out.println("Género actual: " + outDatedNovel.getGenre());
        System.out.print("Nueva género: ");
        genre = scanner.next();
        System.out.println("Cantidad actual: " + outDatedNovel.getQuantity());
        System.out.print("Nueva cantidad: ");
        quantity = Integer.parseInt(scanner.next());
        System.out.println("Cantidad de disponibles para préstamo actual: " + outDatedNovel.getAvailable());
        System.out.print("Nueva cantidad de disponibles para préstamo: ");
        available = Integer.parseInt(scanner.next());
        System.out.println("Cantidad en préstamo actual: " + outDatedNovel.getOnLoan());
        System.out.print("Nueva cantidad de disponibles para préstamo: ");
        onLoan = Integer.parseInt(scanner.next());
        System.out.println("Edad recomendada de lectura actual: " + outDatedNovel.getSuggestedReadingAge());
        System.out.print("Nueva edad recomendada de lectura: ");
        suggestedReadingAge = Integer.parseInt(scanner.next());
        Novel upDatedNovel = new Novel(title, author, quantity, available, onLoan, genre, suggestedReadingAge);
        assistant.updateNovel(DataBase.libraryNovels, outDatedNovel, upDatedNovel);
        System.out.println();
        System.out.println("Novela actualizada con éxito. \n Volviéndo al menú anterior");
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    // MENU 3
    public static void Menu3(Assistant assistant){
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
                    Menu31(assistant);
                    break;
                case 2:
                    Menu32(assistant);
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
    public static void Menu31 (Assistant assistant){
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
        assistant.deleteBook(DataBase.libraryBooks, toDeleteBook);
        System.out.println();
        System.out.println("Libro eliminado con éxito. \n Volviendo al menú anterior");
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    public static void Menu32(Assistant assistant){
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
        assistant.deleteNovel(DataBase.libraryNovels, toDeleteNovel);
        System.out.println();
        System.out.println("Novela eliminada con éxito. \n Volviendo al menú anterior");
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    // MENU 4
    public static void Menu4(Assistant assistant){
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
                    Menu41(assistant);
                    break;

                case 2:
                    Menu42(assistant);
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
    public static void Menu41(Assistant assistant){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Lista de libros >");
        System.out.println();
        assistant.getBooks(DataBase.libraryBooks);
        System.out.println();
        System.out.print("Ingresa 1 para volver a menú anterior: ");
        scanner.next();
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    public static void Menu42(Assistant assistant){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Lista de novelas >");
        System.out.println();
        assistant.getNovels(DataBase.libraryNovels);
        System.out.println();
        System.out.print("Ingresa 1 para volver a menú anterior: ");
        scanner.next();
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    // MENU 5
    public static void Menu5(Assistant assistant){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Marcando préstamo como 'Realizado' >");
        System.out.println();
        System.out.print("Ingrese el email del lector: ");
        String reader = scanner.next();
        for (Loan loan : DataBase.libraryLoans) {
            if (loan.getEmail().equals(reader)) {
                assistant.setLoanDone(DataBase.libraryLoans, loan);
                break;
            }
        }
        System.out.println();
        System.out.print("Ingresa 1 para volver a menú anterior: ");
        scanner.next();
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    // MENU 6

    public static void Menu6(Assistant assistant){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Marcando préstamo como 'Finalizado' >");
        System.out.println();
        System.out.print("Ingrese el email del lector: ");
        String reader = scanner.next();
        for (Loan loan : DataBase.libraryLoans) {
            if (loan.getEmail().equals(reader)) {
                assistant.setLoanFinalized(DataBase.libraryLoans, loan);
                break;
            }
        }
        System.out.println();
        System.out.print("Ingresa 1 para volver a menú anterior: ");
        scanner.next();
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
}
