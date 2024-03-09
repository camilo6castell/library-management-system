package model.users;

import model.texts.Book;
import model.texts.Novel;

import java.util.ArrayList;

public class Administrator extends User {

    public Administrator(String name, String email, String password) {
        super(name, email, password,
                "administrator");
    }

    // BOOKS METHODS
    public void addBook(ArrayList<Book> libraryBooks, String title, String author, int quantity,
                                   int available, int onLoan, String knowledgeArea, int pages) {
        boolean isBook = libraryBooks.stream().anyMatch(object -> object.getTitle().equals(title));
        if (isBook) {
            System.out.println("El libro con el título " + title + " ya se encuentra en nuestro registro. El libro " +
                    "no se agregará a la biblioteca.");
        } else {
            Book newBook = new Book(title, author, quantity, available, onLoan, knowledgeArea, pages);
            libraryBooks.add(newBook);
            System.out.println("El libro con el título " + title + " ha sido agregado a nuestra biblioteca.");
        }
    }

    public void updateBook(ArrayList<Book> libraryBooks, Book outDatedBook, Book upDatedBook) {
        int index = libraryBooks.indexOf(outDatedBook);
        if (index == -1) {
            System.out.println("El libro que quieres actualizar no está registrado.");
        } else {
            libraryBooks.set(index, upDatedBook);
            System.out.println("El libro ha sido actualizado correctamente.");
        }
    }

    public void deleteBook(ArrayList<Book> libraryBooks, Book toDeleteBook) {
        int index = libraryBooks.indexOf(toDeleteBook);
        if (index == -1) {
            System.out.println("El libro que quieres eliminar no está registrado.");
        } else {
            libraryBooks.remove(index);
            System.out.println("El libro ha sido eliminado correctamente.");
        }
    }

    public void getBooks(ArrayList<Book> libraryBooks) {
        for (int i = 0; i < libraryBooks.size(); i++) {
            Book book = libraryBooks.get(i);
            System.out.format("%d Titulo: %s - Autor: %s - Páginas: %d\n", i + 1, book.getTitle(), book.getAuthor(), book.getPages());
        }
    }

    //
    // NOVELS METHODS
    public void addNovel(ArrayList<Novel> libraryNovels, String title, String author, int quantity,
                                    int available, int onLoan, String genre, int suggestedReadingAge) {
        boolean isBook = libraryNovels.stream().anyMatch(object -> object.getTitle().equals(title));
        if (isBook) {
            System.out.println("La novela con el título " + title + " ya se encuentra en nuestro registro. " +
                    "La novela no se agregará a la biblioteca.");
        } else {
            Novel newNovel = new Novel(title, author, quantity, available, onLoan, genre, suggestedReadingAge);
            libraryNovels.add(newNovel);
            System.out.println("La novela con el título " + title + " ha sido agregado a nuestra biblioteca.");
        }
    }

    public void updateNovel(ArrayList<Novel> libraryNovels, Novel outDatedNovel, Novel upDatedNovel) {
        int index = libraryNovels.indexOf(outDatedNovel);
        if (index == -1) {
            System.out.println("La novela que quieres actualizar no está registrada.");
        } else {
            libraryNovels.set(index, upDatedNovel);
            System.out.println("El novela ha sido actualizado correctamente.");
        }
    }

    public void deleteNovel(ArrayList<Novel> libraryNovels, Novel toDeleteNovel) {
        int index = libraryNovels.indexOf(toDeleteNovel);
        if (index == -1) {
            System.out.println("La novela que quieres eliminar no está registrada.");
        } else {
            libraryNovels.remove(index);
            System.out.println("La novela ha sido eliminado correctamente.");
        }
    }

    public void  getNovels(ArrayList<Novel> libraryNovels) {
        //for (Novel novel : libraryNovels) {
        //    System.out.println("Título: " + novel.getTitle());
        //    System.out.println("Autor: " + novel.getAuthor());
        //    System.out.println("Suggested reading age: " + novel.getSuggestedReadingAge());
        //    System.out.println();
        //}
        for (int i = 0; i < libraryNovels.size(); i++) {
            Novel novel = libraryNovels.get(i);
            System.out.format("%d Titulo: %s - Autor: %s - Edad de lectura sugerida: %d\n", i + 1, novel.getTitle(), novel.getAuthor(), novel.getSuggestedReadingAge());
        }
    }

    //
    // ASSISTANT METHODS
    public void addAssistant(ArrayList<Assistant> libraryAssistants, String name, String email,
                                             String password) {
        libraryAssistants.add(new Assistant(name, email, password));
    }

    public void  getAssistans(ArrayList<Assistant> libraryAssistants) {
        for (int i = 0; i < libraryAssistants.size(); i++) {
            Assistant assistant = libraryAssistants.get(i);
            System.out.format("%d Nombre: %s - Email: %s\n", i + 1, assistant.getName(), assistant.getEmail());
        }
    }

    //
    // READERS METHODS
    public void  getReaders(ArrayList<Reader> libraryReaders) {
        for (int i = 0; i < libraryReaders.size(); i++) {
            Reader reader = libraryReaders.get(i);
            System.out.format("%d Nombre: %s - Email: %s\n", i + 1, reader.getName(), reader.getEmail());
        }
    }

    // TEXTS METHODS
    public void  getTexts(ArrayList<Book> libraryBooks, ArrayList<Novel> libraryNovels) {
        for (int i = 0; i < libraryBooks.size(); i++) {
            Book book = libraryBooks.get(i);
            if (i == 0){
                System.out.println("Libros:");
            }
            System.out.format("     %d Titulo: %s - Autor: %s - Edad de lectura sugerida: %d\n", i + 1, book.getTitle(), book.getAuthor(), book.getPages());
        }
        for (int i = 0; i < libraryNovels.size(); i++) {
            Novel novel = libraryNovels.get(i);
            if (i == 0){
                System.out.println("Novelas:");
            }
            System.out.format("     %d Titulo: %s - Autor: %s - Edad de lectura sugerida: %d\n", i + 1, novel.getTitle(), novel.getAuthor(), novel.getSuggestedReadingAge());
        }
    }

}
