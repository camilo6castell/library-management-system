package controller.library;

import model.texts.Book;
import model.texts.Novel;

import model.users.Administrator;

import java.util.Scanner;

import data.DataBase;
public class AdministratorSession {

    public static void AdministratorMenu(Administrator administrator) {
        Scanner scanner = new Scanner(System.in);
        boolean loginAdmin = true;
        while (loginAdmin) {
            System.out.format("""
                                    _______________________________________________________________

                                    Bienvenido admin %s
                                    
                                    ¿Qué deseas hacer?
                                    
                                    1 Agregar libro o novela
                                    2 Actualizar libro o novela
                                    3 Eliminar libro o novela
                                    4 Mostrar libros o novelas en sistema
                                    
                                    5 Agregar asistente
                                    
                                    6 Mostrar listado de lectores
                                    7 Mostrar listado de asistentes
                                    8 Mostrar libros y novelas en el sistema
                                    
                                    9 Cerrar sesión
                                    
                                    0 Terminar programa
                                    
                                    """, administrator.getName());
            System.out.print("Digita la opción deseada: ");
            int option = Integer.parseInt(scanner.next());
            System.out.println();
            switch (option) {
                case 1:
                    Menu1(administrator);
                    break;
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

    // MENU 1
    public static void Menu1(Administrator administrator){
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
                    Menu11(administrator);
                    break;
                case 2:
                    Menu12(administrator);
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

    public static void Menu11(Administrator administrator){
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
        administrator.addBook(DataBase.libraryBooks, title, author, quantity, available,
                onLoan, knowledgeArea, pages);
        System.out.println();
        System.out.print("¡Libro agregado con éxito!");
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    public static void Menu12(Administrator administrator){
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
        administrator.addNovel(DataBase.libraryNovels, title, author, quantity, available,
                onLoan, genre, suggestedReadingAge);
        System.out.println();
        System.out.print("¡Novela agregada con éxito!");
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    // MENU 2
    public static void Menu2(Administrator administrator){
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
                    Menu21(administrator);
                    break;
                case 2:
                    Menu22(administrator);
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
    public static void Menu21(Administrator administrator){
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
        administrator.updateBook(DataBase.libraryBooks, outDatedBook, upDatedBook);
        System.out.println();
        System.out.println("Libro actualizado con éxito. \n Volviendo al menú anterior");
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
    public static void Menu22(Administrator administrator){
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
        administrator.updateNovel(DataBase.libraryNovels, outDatedNovel, upDatedNovel);
        System.out.println();
        System.out.println("Novela actualizada con éxito. \n Volviéndo al menú anterior");
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println();
    }
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




