package models.users;

import models.texts.Book;
import models.texts.Novel;

import java.util.ArrayList;

public class Administrator extends User {

    public Administrator(String name, String email, String password) {
        super(name, email, password,
                "administrator");
    }

    // BOOKS METHODS


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
