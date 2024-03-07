package controller;

import model.loans.Loan;
import model.texts.Book;
import model.texts.Novel;

import model.users.Assistant;
import model.users.Administrator;
import model.users.Reader;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // SCANNER
        Scanner scanner = new Scanner(System.in);

        // ADMIN
        //Administrator admin = new Administrator("John Doe", "test",
        //        "test");
        Administrator admin = new Administrator("John Doe", "administrador@pingu.com.co",
                "contraseñasegura123456");


        // BOOKS ARRAY
        ArrayList<Book> libraryBooks = new ArrayList<>();

        libraryBooks.add(new Book("El origen de las especies", "Charles Darwin", 4, 4,
                0, "Biología", 704));
        libraryBooks.add(new Book("Breve historia del tiempo", "Stephen Hawking", 3, 3,
                0, "Física", 216));
        libraryBooks.add(new Book("El significado de la relatividad", "Albert Einstein", 5,
                5, 0, "fisica", 192));
        // NOVELS ARRAY
        ArrayList<Novel> libraryNovels = new ArrayList<>();

        libraryNovels.add(new Novel("1984", "George Orwell", 10, 10, 0,
                "Distopia", 15));
        libraryNovels.add(new Novel("Cien años de soledad,", "Gabriel García Márquez", 3,
                3, 0, "Realismo mágico", 12));
        libraryNovels.add(new Novel("El Conde de Montecristo", "Alexandre Dumas", 5,
                5, 0, "Clásica", 15));
        // ASSISTANT ARRAY
        ArrayList<Assistant> libraryAssistants = new ArrayList<>();
        libraryAssistants.add(new Assistant("asistente1", "asistente1@pingu.com.co",
                "asistente1@pingu.com.c"));
        // READERS ARRAY
        ArrayList<Reader> libraryReaders = new ArrayList<>();
        libraryReaders.add(new Reader("reader1", "reader1@gmail.com",
                "reader1@gmail.com"));
        // LOANS ARRAY
        ArrayList<Loan> libraryLoans = new ArrayList<>();
        libraryLoans.add(new Loan("reader1@gmail.com", "El Conde de Montecristo",
                "Alexandre Dumas"));

        // PROGRAM /////////////////////////////////////////////////////////////////////////////////////////////////////

        // SESSION
        boolean session = true;
        //

        while (session) {
            System.out.println();
            System.out.println();
            System.out.println("Bienvenido a la Biblioteca La Pinguinera");
            System.out.println();
            System.out.println("Para navegar necesitas ingresar con el teclado el número de la opción que deseas ingresar.");
            System.out.println();
            System.out.println();
            System.out.println("1 Iniciar Sesión");
            System.out.println("2 Registrarse");
            System.out.println("3 salir");
            System.out.println();
            System.out.print("Digite la opción deseada: ");
            int option = Integer.parseInt(scanner.next());
            System.out.println();
            System.out.print("_______________________________________________________________");
            System.out.println();
            switch (option) {
                case 1:
                    boolean login = true;
                    while (login) {
                        System.out.println();
                        System.out.println("Por favor ingresa tus credenciales");
                        System.out.println();
                        System.out.print("Introduce tu email: ");
                        String email = scanner.next();
                        System.out.println();
                        System.out.print("Introduce tu contraseña: ");
                        String password = scanner.next();
                        System.out.println();
                        System.out.print("_______________________________________________________________");
                        System.out.println();

                        // ADMIN

                        if (admin.getEmail().equals(email)) {
                            if (admin.getPassword().equals(password)) {
                                boolean loginAdmin = true;
                                while (loginAdmin) {
                                    System.out.println();
                                    System.out.println("Bienvenido admin");
                                    System.out.println();
                                    System.out.println("¿Qué deseas hacer?");
                                    System.out.println();
                                    System.out.println("1 Agregar libro o novela");
                                    System.out.println("2 Actualizar libro o novela");
                                    System.out.println("3 Eliminar libro o novela");
                                    System.out.println("4 Mostrar libros o novelas en sistema");
                                    System.out.println();
                                    System.out.println("5 Agregar asistente");
                                    System.out.println();
                                    System.out.println("6 Mostrar listado de lectores");
                                    System.out.println("7 Mostrar listado de asistentes");
                                    System.out.println("8 Mostrar libros y novelas en el sistema");
                                    System.out.println("9 Cerrar sesión");
                                    System.out.println();
                                    System.out.print("Digita la opción deseada: ");
                                    int optionAdmin1 = Integer.parseInt(scanner.next());
                                    System.out.println();
                                    System.out.print("_______________________________________________________________");
                                    System.out.println();
                                    switch (optionAdmin1) {
                                        case 1:
                                            if (session) {
                                                boolean menuLevel = true;
                                                while (menuLevel) {
                                                    System.out.println();
                                                    System.out.println("Agregar libro o novela");
                                                    System.out.println();
                                                    System.out.println("¿Qué deseas agregar?");
                                                    System.out.println();
                                                    System.out.println("1 Agregar libro");
                                                    System.out.println("2 Agregar novela");
                                                    System.out.println();
                                                    System.out.println("3 Ir al menú de atrás");
                                                    System.out.println("4 Salir");
                                                    System.out.println();
                                                    System.out.print("Digita la opción deseada: ");
                                                    int optionAdmin11 = Integer.parseInt(scanner.next());
                                                    System.out.println();
                                                    System.out.print("_______________________________________________________________");
                                                    System.out.println();
                                                    switch (optionAdmin11) {
                                                        case 1:
                                                            if (session) {
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
                                                                admin.addBook(libraryBooks, title, author, quantity, available,
                                                                        onLoan, knowledgeArea, pages);
                                                                System.out.println();
                                                                System.out.print("¡Libro agregado con éxito!");
                                                                System.out.println();
                                                                System.out.print("_______________________________________________________________");
                                                                System.out.println();
                                                            }
                                                            break;
                                                        case 2:
                                                            if (session) {
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
                                                                admin.addNovel(libraryNovels, title, author, quantity, available,
                                                                        onLoan, genre, suggestedReadingAge);
                                                                System.out.println();
                                                                System.out.print("¡Novela agregada con éxito!");
                                                                System.out.println();
                                                                System.out.print("_______________________________________________________________");
                                                                System.out.println();
                                                            }
                                                            break;
                                                        case 3:
                                                            menuLevel = false;
                                                            break;
                                                        case 4:
                                                            menuLevel = false;
                                                            session = false;
                                                            loginAdmin = false;
                                                            login = false;
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 2:
                                            if (session) {
                                                boolean menuLevel = true;
                                                while (menuLevel) {
                                                    System.out.println();
                                                    System.out.println("Actualizar libro o novela");
                                                    System.out.println();
                                                    System.out.println("¿Qué deseas actualizar");
                                                    System.out.println();
                                                    System.out.println("1 Actualizar libro");
                                                    System.out.println("2 Actualizar novela");
                                                    System.out.println();
                                                    System.out.println("3 Ir al menú de atrás");
                                                    System.out.println("4 Salir");
                                                    System.out.println();
                                                    System.out.print("Digita la opción deseada: ");
                                                    int optionAdmin11 = Integer.parseInt(scanner.next());
                                                    System.out.println();
                                                    System.out.print("_______________________________________________________________");
                                                    System.out.println();
                                                    switch (optionAdmin11) {
                                                        case 1:
                                                            if (session) {
                                                                String title, author, knowledgeArea;
                                                                int quantity, available, onLoan, pages;
                                                                System.out.println();
                                                                System.out.println("Actualizando libro >");
                                                                System.out.println();
                                                                System.out.println("Elija el libro que desea actualizar ");
                                                                System.out.println();
                                                                for (int i = 0; i < libraryBooks.size(); i++) {
                                                                    Book book = libraryBooks.get(i);
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
                                                                Book outDatedBook = libraryBooks.get(libraryBookIndex - 1);
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
                                                                admin.updateBook(libraryBooks, outDatedBook, upDatedBook);
                                                                System.out.println();
                                                                System.out.println("Libro actualizado con éxito. \n Volviendo al menú anterior");
                                                                System.out.println();
                                                                System.out.print("_______________________________________________________________");
                                                                System.out.println();

                                                            }
                                                            break;

                                                        case 2:
                                                            if (session) {
                                                                String title, author, genre;
                                                                int quantity, available, onLoan, suggestedReadingAge;
                                                                System.out.println();
                                                                System.out.println("Actualizando Novela >");
                                                                System.out.println();
                                                                System.out.println("Elija la novela que desea actualizar ");
                                                                System.out.println();
                                                                for (int i = 0; i < libraryNovels.size(); i++) {
                                                                    Novel novel = libraryNovels.get(i);
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
                                                                Novel outDatedNovel = libraryNovels.get(libraryNovelIndex - 1);
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
                                                                admin.updateNovel(libraryNovels, outDatedNovel, upDatedNovel);
                                                                System.out.println();
                                                                System.out.println("Novela actualizada con éxito. \n Volviéndo al menú anterior");
                                                                System.out.println();
                                                                System.out.print("_______________________________________________________________");
                                                                System.out.println();
                                                            }
                                                            break;
                                                        case 3:
                                                            menuLevel = false;
                                                            break;
                                                        case 4:
                                                            menuLevel = false;
                                                            session = false;
                                                            loginAdmin = false;
                                                            login = false;
                                                    }
                                                }
                                            }
                                            break;
                                        case 3:
                                            if (session) {
                                                boolean menuLevel = true;
                                                while (menuLevel) {
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
                                                    int optionAdmin11 = Integer.parseInt(scanner.next());
                                                    System.out.println();
                                                    System.out.print("_______________________________________________________________");
                                                    System.out.println();
                                                    switch (optionAdmin11) {
                                                        case 1:
                                                            if (session) {
                                                                System.out.println();
                                                                System.out.println("Eliminando libro >");
                                                                System.out.println();
                                                                System.out.println("Elija el libro que desea eliminar: ");
                                                                System.out.println();
                                                                for (int i = 0; i < libraryBooks.size(); i++) {
                                                                    Book book = libraryBooks.get(i);
                                                                    String title = book.getTitle();
                                                                    String author = book.getAuthor();
                                                                    System.out.format("%d Titulo: %s - Autor: %s\n", i + 1, title, author);
                                                                }
                                                                System.out.println();
                                                                System.out.print("Digita el número del libro a eliminar: ");
                                                                int libraryBookIndex = Integer.parseInt(scanner.next());
                                                                Book toDeleteBook = libraryBooks.get(libraryBookIndex - 1);
                                                                admin.deleteBook(libraryBooks, toDeleteBook);
                                                                System.out.println();
                                                                System.out.println("Libro eliminado con éxito. \n Volviendo al menú anterior");
                                                                System.out.println();
                                                                System.out.print("_______________________________________________________________");
                                                                System.out.println();
                                                            }
                                                            break;

                                                        case 2:
                                                            if (session) {
                                                                System.out.println();
                                                                System.out.println("Eliminando novela >");
                                                                System.out.println();
                                                                System.out.println("Elija la novela que desea eliminar: ");
                                                                System.out.println();
                                                                for (int i = 0; i < libraryNovels.size(); i++) {
                                                                    Novel novel = libraryNovels.get(i);
                                                                    String title = novel.getTitle();
                                                                    String author = novel.getAuthor();
                                                                    System.out.format("%d Titulo: %s - Autor: %s\n", i + 1, title, author);
                                                                }
                                                                System.out.println();
                                                                System.out.print("Digita el número de la novela a eliminar: ");
                                                                int libraryNovelIndex = Integer.parseInt(scanner.next());
                                                                Novel toDeleteNovel = libraryNovels.get(libraryNovelIndex - 1);
                                                                admin.deleteNovel(libraryNovels, toDeleteNovel);
                                                                System.out.println();
                                                                System.out.println("Novela eliminada con éxito. \n Volviendo al menú anterior");
                                                                System.out.println();
                                                                System.out.print("_______________________________________________________________");
                                                                System.out.println();
                                                            }
                                                            break;
                                                        case 3:
                                                            menuLevel = false;
                                                            break;
                                                        case 4:
                                                            menuLevel = false;
                                                            session = false;
                                                            loginAdmin = false;
                                                            login = false;
                                                    }
                                                }
                                            }
                                            break;
                                        case 4:
                                            if (session) {
                                                boolean menuLevel = true;
                                                while (menuLevel) {
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
                                                    int optionAdmin11 = Integer.parseInt(scanner.next());
                                                    System.out.println();
                                                    System.out.print("_______________________________________________________________");
                                                    System.out.println();
                                                    switch (optionAdmin11) {
                                                        case 1:
                                                            if (session) {
                                                                System.out.println();
                                                                System.out.println("Lista de libros >");
                                                                System.out.println();
                                                                admin.getBooks(libraryBooks);
                                                                System.out.println();
                                                                System.out.print("Ingresa 1 para volver a menú anterior: ");
                                                                scanner.next();
                                                                System.out.println();
                                                                System.out.print("_______________________________________________________________");
                                                                System.out.println();
                                                                break;
                                                            }
                                                            break;

                                                        case 2:
                                                            if (session) {
                                                                System.out.println();
                                                                System.out.println("Lista de novelas >");
                                                                System.out.println();
                                                                admin.getNovels(libraryNovels);
                                                                System.out.println();
                                                                System.out.print("Ingresa 1 para volver a menú anterior: ");
                                                                scanner.next();
                                                                System.out.println();
                                                                System.out.print("_______________________________________________________________");
                                                                System.out.println();
                                                                break;
                                                            }
                                                            break;
                                                        case 3:
                                                            menuLevel = false;
                                                            break;
                                                        case 4:
                                                            menuLevel = false;
                                                            session = false;
                                                            loginAdmin = false;
                                                            login = false;
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 5:
                                            if (session) {
                                                System.out.println();
                                                System.out.println("Creando asistente >");
                                                System.out.println();
                                                System.out.print("Nombre del nuevo asistente: ");
                                                String name = scanner.next();
                                                System.out.print("Email del nuevo asistente: ");
                                                email = scanner.next();
                                                System.out.print("Password del nuevo asistente: ");
                                                password = scanner.next();
                                                admin.addAssistant(libraryAssistants, name, email, password);
                                                System.out.println();
                                                System.out.println("Asistente creado con éxito.");
                                                System.out.println();
                                                System.out.print("Ingrese 1 para volver al menú anterior: ");
                                                scanner.next();
                                                System.out.print("_______________________________________________________________");
                                                System.out.println();
                                                break;
                                            }
                                            break;
                                        case 6:
                                            if (session) {
                                                System.out.println();
                                                System.out.println("Listado de lectores >");
                                                System.out.println();
                                                admin.getReaders(libraryReaders);
                                                System.out.println();
                                                System.out.print("Ingrese 1 para volver al menú anterior: ");
                                                scanner.next();
                                                System.out.print("_______________________________________________________________");
                                                System.out.println();
                                                break;
                                            }
                                            break;
                                        case 7:
                                            if (session) {
                                                System.out.println();
                                                System.out.println("Listado de asistentes >");
                                                System.out.println();
                                                admin.getAssistans(libraryAssistants);
                                                System.out.println();
                                                System.out.print("Ingrese 1 para volver al menú anterior: ");
                                                scanner.next();
                                                System.out.print("_______________________________________________________________");
                                                System.out.println();
                                                break;
                                            }
                                            break;
                                        case 8:
                                            if (session) {
                                                System.out.println();
                                                System.out.println("Listado de libros y novelas en el sistema >");
                                                System.out.println();
                                                admin.getTexts(libraryBooks, libraryNovels);
                                                System.out.println();
                                                System.out.print("Ingrese 1 para volver al menú anterior: ");
                                                scanner.next();
                                                System.out.print("_______________________________________________________________");
                                                System.out.println();
                                                break;
                                            }
                                            break;
                                        case 9:
                                            loginAdmin = false;
                                            session = false;
                                            break;
                                    }
                                }
                            } else {
                                System.out.println("Inicio de sesión fallido, volviendo al menu anterior.");
                                System.out.println();
                                break;
                            }
                        } else {

                            // ASSISTANT

                            for (Assistant assistant: libraryAssistants) {
                                if (assistant.getEmail().equals(email)) {
                                    if (assistant.getPassword().equals(password)){
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
                                            System.out.println();
                                            System.out.print("Digita la opción deseada: ");
                                            int optionMenu1 = Integer.parseInt(scanner.next());
                                            System.out.println();
                                            System.out.print("_______________________________________________________________");
                                            System.out.println();
                                            switch (optionMenu1) {
                                                case 1:
                                                    if (session) {
                                                        boolean menuLevel = true;
                                                        while (menuLevel) {
                                                            System.out.println();
                                                            System.out.println("Agregar libro o novela");
                                                            System.out.println();
                                                            System.out.println("¿Qué deseas agregar?");
                                                            System.out.println();
                                                            System.out.println("1 Agregar libro");
                                                            System.out.println("2 Agregar novela");
                                                            System.out.println();
                                                            System.out.println("3 Ir al menú de atrás");
                                                            System.out.println("4 Salir");
                                                            System.out.println();
                                                            System.out.print("Digita la opción deseada: ");
                                                            int optionMenu2 = Integer.parseInt(scanner.next());
                                                            System.out.println();
                                                            System.out.print("_______________________________________________________________");
                                                            System.out.println();
                                                            switch (optionMenu2) {
                                                                case 1:
                                                                    if (session) {
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
                                                                        assistant.addBook(libraryBooks, title, author, quantity, available,
                                                                                onLoan, knowledgeArea, pages);
                                                                        System.out.println();
                                                                        System.out.print("¡Libro agregado con éxito!");
                                                                        System.out.println();
                                                                        System.out.print("_______________________________________________________________");
                                                                        System.out.println();
                                                                    }
                                                                    break;
                                                                case 2:
                                                                    if (session) {
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
                                                                        admin.addNovel(libraryNovels, title, author, quantity, available,
                                                                                onLoan, genre, suggestedReadingAge);
                                                                        System.out.println();
                                                                        System.out.print("¡Novela agregada con éxito!");
                                                                        System.out.println();
                                                                        System.out.print("_______________________________________________________________");
                                                                        System.out.println();
                                                                    }
                                                                    break;
                                                                case 3:
                                                                    menuLevel = false;
                                                                    break;
                                                                case 4:
                                                                    menuLevel = false;
                                                                    session = false;
                                                                    loginAssistant = false;
                                                                    login = false;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 2:
                                                    if (session) {
                                                        boolean menuLevel = true;
                                                        while (menuLevel) {
                                                            System.out.println();
                                                            System.out.println("Actualizar libro o novela");
                                                            System.out.println();
                                                            System.out.println("¿Qué deseas actualizar");
                                                            System.out.println();
                                                            System.out.println("1 Actualizar libro");
                                                            System.out.println("2 Actualizar novela");
                                                            System.out.println();
                                                            System.out.println("3 Ir al menú de atrás");
                                                            System.out.println("4 Salir");
                                                            System.out.println();
                                                            System.out.print("Digita la opción deseada: ");
                                                            int optionMenu3 = Integer.parseInt(scanner.next());
                                                            System.out.println();
                                                            System.out.print("_______________________________________________________________");
                                                            System.out.println();
                                                            switch (optionMenu3) {
                                                                case 1:
                                                                    if (session) {
                                                                        String title, author, knowledgeArea;
                                                                        int quantity, available, onLoan, pages;
                                                                        System.out.println();
                                                                        System.out.println("Actualizando libro >");
                                                                        System.out.println();
                                                                        System.out.println("Elija el libro que desea actualizar ");
                                                                        System.out.println();
                                                                        for (int i = 0; i < libraryBooks.size(); i++) {
                                                                            Book book = libraryBooks.get(i);
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
                                                                        Book outDatedBook = libraryBooks.get(libraryBookIndex - 1);
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
                                                                        assistant.updateBook(libraryBooks, outDatedBook, upDatedBook);
                                                                        System.out.println();
                                                                        System.out.println("Libro actualizado con éxito. \n Volviendo al menú anterior");
                                                                        System.out.println();
                                                                        System.out.print("_______________________________________________________________");
                                                                        System.out.println();

                                                                    }
                                                                    break;

                                                                case 2:
                                                                    if (session) {
                                                                        String title, author, genre;
                                                                        int quantity, available, onLoan, suggestedReadingAge;
                                                                        System.out.println();
                                                                        System.out.println("Actualizando Novela >");
                                                                        System.out.println();
                                                                        System.out.println("Elija la novela que desea actualizar ");
                                                                        System.out.println();
                                                                        for (int i = 0; i < libraryNovels.size(); i++) {
                                                                            Novel novel = libraryNovels.get(i);
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
                                                                        Novel outDatedNovel = libraryNovels.get(libraryNovelIndex - 1);
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
                                                                        assistant.updateNovel(libraryNovels, outDatedNovel, upDatedNovel);
                                                                        System.out.println();
                                                                        System.out.println("Novela actualizada con éxito. \n Volviéndo al menú anterior");
                                                                        System.out.println();
                                                                        System.out.print("_______________________________________________________________");
                                                                        System.out.println();
                                                                    }
                                                                    break;
                                                                case 3:
                                                                    menuLevel = false;
                                                                    break;
                                                                case 4:
                                                                    menuLevel = false;
                                                                    session = false;
                                                                    loginAssistant = false;
                                                                    login = false;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 3:
                                                    if (session) {
                                                        boolean menuLevel = true;
                                                        while (menuLevel) {
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
                                                            int optionMenu4 = Integer.parseInt(scanner.next());
                                                            System.out.println();
                                                            System.out.print("_______________________________________________________________");
                                                            System.out.println();
                                                            switch (optionMenu4) {
                                                                case 1:
                                                                    if (session) {
                                                                        System.out.println();
                                                                        System.out.println("Eliminando libro >");
                                                                        System.out.println();
                                                                        System.out.println("Elija el libro que desea eliminar: ");
                                                                        System.out.println();
                                                                        for (int i = 0; i < libraryBooks.size(); i++) {
                                                                            Book book = libraryBooks.get(i);
                                                                            String title = book.getTitle();
                                                                            String author = book.getAuthor();
                                                                            System.out.format("%d Titulo: %s - Autor: %s\n", i + 1, title, author);
                                                                        }
                                                                        System.out.println();
                                                                        System.out.print("Digita el número del libro a eliminar: ");
                                                                        int libraryBookIndex = Integer.parseInt(scanner.next());
                                                                        Book toDeleteBook = libraryBooks.get(libraryBookIndex - 1);
                                                                        assistant.deleteBook(libraryBooks, toDeleteBook);
                                                                        System.out.println();
                                                                        System.out.println("Libro eliminado con éxito. \n Volviendo al menú anterior");
                                                                        System.out.println();
                                                                        System.out.print("_______________________________________________________________");
                                                                        System.out.println();
                                                                    }
                                                                    break;

                                                                case 2:
                                                                    if (session) {
                                                                        System.out.println();
                                                                        System.out.println("Eliminando novela >");
                                                                        System.out.println();
                                                                        System.out.println("Elija la novela que desea eliminar: ");
                                                                        System.out.println();
                                                                        for (int i = 0; i < libraryNovels.size(); i++) {
                                                                            Novel novel = libraryNovels.get(i);
                                                                            String title = novel.getTitle();
                                                                            String author = novel.getAuthor();
                                                                            System.out.format("%d Titulo: %s - Autor: %s\n", i + 1, title, author);
                                                                        }
                                                                        System.out.println();
                                                                        System.out.print("Digita el número de la novela a eliminar: ");
                                                                        int libraryNovelIndex = Integer.parseInt(scanner.next());
                                                                        Novel toDeleteNovel = libraryNovels.get(libraryNovelIndex - 1);
                                                                        assistant.deleteNovel(libraryNovels, toDeleteNovel);
                                                                        System.out.println();
                                                                        System.out.println("Novela eliminada con éxito. \n Volviendo al menú anterior");
                                                                        System.out.println();
                                                                        System.out.print("_______________________________________________________________");
                                                                        System.out.println();
                                                                    }
                                                                    break;
                                                                case 3:
                                                                    menuLevel = false;
                                                                    break;
                                                                case 4:
                                                                    menuLevel = false;
                                                                    session = false;
                                                                    loginAssistant = false;
                                                                    login = false;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 4:
                                                    if (session) {
                                                        boolean menuLevel = true;
                                                        while (menuLevel) {
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
                                                            int optionMenu5 = Integer.parseInt(scanner.next());
                                                            System.out.println();
                                                            System.out.print("_______________________________________________________________");
                                                            System.out.println();
                                                            switch (optionMenu5) {
                                                                case 1:
                                                                    if (session) {
                                                                        System.out.println();
                                                                        System.out.println("Lista de libros >");
                                                                        System.out.println();
                                                                        assistant.getBooks(libraryBooks);
                                                                        System.out.println();
                                                                        System.out.print("Ingresa 1 para volver a menú anterior: ");
                                                                        scanner.next();
                                                                        System.out.println();
                                                                        System.out.print("_______________________________________________________________");
                                                                        System.out.println();
                                                                        break;
                                                                    }
                                                                    break;

                                                                case 2:
                                                                    if (session) {
                                                                        System.out.println();
                                                                        System.out.println("Lista de novelas >");
                                                                        System.out.println();
                                                                        assistant.getNovels(libraryNovels);
                                                                        System.out.println();
                                                                        System.out.print("Ingresa 1 para volver a menú anterior: ");
                                                                        scanner.next();
                                                                        System.out.println();
                                                                        System.out.print("_______________________________________________________________");
                                                                        System.out.println();
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 3:
                                                                    menuLevel = false;
                                                                    break;
                                                                case 4:
                                                                    menuLevel = false;
                                                                    session = false;
                                                                    loginAssistant = false;
                                                                    login = false;
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 5:
                                                    if (session) {
                                                        System.out.println();
                                                        System.out.println("Marcando préstamo como 'Realizado' >");
                                                        System.out.println();
                                                        System.out.print("Ingrese el email del lector: ");
                                                        String reader = scanner.next();
                                                        for (Loan loan : libraryLoans) {
                                                            if (loan.getReader().equals(reader)) {
                                                                assistant.setLoanDone(libraryLoans, loan);
                                                                break;
                                                            }
                                                        }
                                                        System.out.println();
                                                        System.out.print("Ingresa 1 para volver a menú anterior: ");
                                                        scanner.next();
                                                        System.out.println();
                                                        System.out.print("_______________________________________________________________");
                                                        System.out.println();
                                                        break;
                                                    }
                                                case 6:
                                                    if (session) {
                                                        System.out.println();
                                                        System.out.println("Marcando préstamo como 'Finalizado' >");
                                                        System.out.println();
                                                        System.out.print("Ingrese el email del lector: ");
                                                        String reader = scanner.next();
                                                        for (Loan loan : libraryLoans) {
                                                            if (loan.getReader().equals(reader)) {
                                                                assistant.setLoanFinalized(libraryLoans, loan);
                                                                break;
                                                            }
                                                        }
                                                        System.out.println();
                                                        System.out.print("Ingresa 1 para volver a menú anterior: ");
                                                        scanner.next();
                                                        System.out.println();
                                                        System.out.print("_______________________________________________________________");
                                                        System.out.println();
                                                        break;
                                                    }
                                                case 7:
                                                    loginAssistant = false;
                                                    session = false;
                                                    break;
                                            }
                                        }
                                        break;
                                    } else {
                                        System.out.println("Inicio de sesión fallido, volviendo al menu anterior.");
                                        System.out.println();
                                        break;
                                    }
                                }
                            }

                            // READER

                            for (Reader reader: libraryReaders) {
                                if (reader.getEmail().equals(email)) {
                                    if (reader.getPassword().equals(password)){
                                        boolean loginReader = true;
                                        while (loginReader){
                                            System.out.println();
                                            System.out.println("Bienvenido lector!");
                                            System.out.println();
                                            System.out.println("¿Qué deseas hacer?");
                                            System.out.println();
                                            System.out.println("1 Crear préstamo de libro o novela");
                                            System.out.println("2 Listar por autor los textos en la biblioteca");
                                            System.out.println();
                                            System.out.println("3 Cerrar sesión");
                                            System.out.println();
                                            System.out.print("Digita la opción deseada: ");
                                            int optionMenu3 = Integer.parseInt(scanner.next());
                                            System.out.println();
                                            System.out.print("_______________________________________________________________");
                                            System.out.println();
                                            switch (optionMenu3) {
                                                case 1:
                                                    if (session) {
                                                        boolean menuLevel = true;
                                                        while (menuLevel) {
                                                            System.out.println();
                                                            System.out.println("Actualizar libro o novela");
                                                            System.out.println();
                                                            System.out.println("¿Qué deseas actualizar");
                                                            System.out.println();
                                                            System.out.println("1 Pedir prestado libro");
                                                            System.out.println("2 Pedir prestado novela");
                                                            System.out.println();
                                                            System.out.println("3 Ir al menú de atrás");
                                                            System.out.println("4 Salir");
                                                            System.out.println();
                                                            System.out.print("Digita la opción deseada: ");
                                                            int optionReader5 = Integer.parseInt(scanner.next());
                                                            System.out.println();
                                                            System.out.print("_______________________________________________________________");
                                                            System.out.println();
                                                            switch (optionReader5) {
                                                                case 1:
                                                                    if (session) {
                                                                        String title, author;
                                                                        System.out.println();
                                                                        System.out.println("Préstamos de libro >");
                                                                        System.out.println();
                                                                        System.out.println("Elija el libro que desea apartar: ");
                                                                        System.out.println();
                                                                        for (int i = 0; i < libraryBooks.size(); i++) {
                                                                            Book book = libraryBooks.get(i);
                                                                            title = book.getTitle();
                                                                            author = book.getAuthor();
                                                                            System.out.format("%d Titulo: %s - Autor: %s\n", i + 1, title, author);
                                                                        }
                                                                        System.out.println();
                                                                        System.out.print("Digita el número del libro a apartar: ");
                                                                        int libraryBookIndex = Integer.parseInt(scanner.next());
                                                                        Book bookForLoan = libraryBooks.get(libraryBookIndex - 1);
                                                                        reader.createLoan(libraryLoans, reader.getEmail(), bookForLoan.getTitle(), bookForLoan.getAuthor());
                                                                        System.out.println();
                                                                        System.out.print("Préstamo requerido. Recuerda acercarte a un asistente de biblioteca para recibir el libro deseado.");
                                                                        System.out.println();
                                                                        System.out.print("Ingresa 1 para volver a menú anterior: ");
                                                                        scanner.next();
                                                                        System.out.println();
                                                                        System.out.print("_______________________________________________________________");
                                                                        System.out.println();
                                                                    }
                                                                    break;
                                                                case 2:
                                                                    if (session) {
                                                                        String title, author;
                                                                        System.out.println();
                                                                        System.out.println("Préstamos de Novela >");
                                                                        System.out.println();
                                                                        System.out.println("Elija la novela que desea apartar: ");
                                                                        System.out.println();
                                                                        for (int i = 0; i < libraryNovels.size(); i++) {
                                                                            Novel novel = libraryNovels.get(i);
                                                                            title = novel.getTitle();
                                                                            author = novel.getAuthor();
                                                                            System.out.format("%d Titulo: %s - Autor: %s\n", i + 1, title, author);
                                                                        }
                                                                        System.out.println();
                                                                        System.out.print("Digita el número de la novela a apartar: ");
                                                                        int libraryNovelIndex = Integer.parseInt(scanner.next());
                                                                        Novel novelForLoan = libraryNovels.get(libraryNovelIndex - 1);
                                                                        reader.createLoan(libraryLoans, reader.getEmail(), novelForLoan.getTitle(), novelForLoan.getAuthor());
                                                                        System.out.println();
                                                                        System.out.print("Préstamo requerido. Recuerda acercarte a un asistente de biblioteca para recibir la novela deseada.");
                                                                        System.out.println();
                                                                        System.out.print("Ingresa 1 para volver a menú anterior: ");
                                                                        scanner.next();
                                                                        System.out.println();
                                                                        System.out.print("_______________________________________________________________");
                                                                        System.out.println();
                                                                    }
                                                                    break;
                                                                case 3:
                                                                    menuLevel = false;
                                                                    break;
                                                                case 4:
                                                                    menuLevel = false;
                                                                    loginReader = false;
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                case 2:
                                                    if (session) {
                                                        System.out.println();
                                                        System.out.println("Lista por autor de los textos disponibles: ");
                                                        System.out.println();
                                                        reader.getTextsByAuthors(libraryBooks, libraryNovels);
                                                        System.out.println();
                                                        System.out.print("Ingresa 1 para volver a menú anterior: ");
                                                        scanner.next();
                                                        System.out.println();
                                                        System.out.print("_______________________________________________________________");
                                                        System.out.println();

                                                    }
                                                    break;
                                                case 3:
                                                    loginReader = false;
                                                    session = false;
                                                    login = false;
                                            }
                                        }
                                        break;
                                    } else {
                                        System.out.println("Inicio de sesión fallido, volviendo al menu anterior.");
                                        System.out.println();
                                        break;
                                    }
                                }
                            }

                        }
                        break;
                    }
                case 2:
                    if (session) {
                        System.out.println();
                        System.out.println("Registrándote >");
                        System.out.println();
                        System.out.print("Ingresa tu nombre: ");
                        String name = scanner.next();
                        System.out.print("Ingresa tu email: ");
                        String email = scanner.next();
                        System.out.print("Ingresa tu password: ");
                        String password = scanner.next();
                        libraryReaders.add(new Reader(name, email, password));
                        System.out.println();
                        System.out.println("Has sido registrado con éxito!");
                        System.out.print("Ingresa 1 para volver a menú anterior: ");
                        scanner.next();
                        System.out.println();
                        System.out.print("_______________________________________________________________");
                        System.out.println();
                        break;
                    }
                case 3:
                    session = false;
                    break;
            }

        }
        System.out.println();
        System.out.println("Fin del programa. ¡Vuelva a pronto a nuestra biblioteca!");
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}