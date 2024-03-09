package model.users;

import data.DataBase;
import model.texts.Book;
import model.texts.Novel;

import model.loans.Loan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static data.DataBase.*;

public class Reader extends User {
    public Reader(String name, String email, String password) {
        super(name, email, password, "reader");
    }

    // TEXTS METHODS
    public void  getTextsByAuthors(ArrayList<Book> libraryBooks, ArrayList<Novel> libraryNovels) {
        for (Book book : libraryBooks) {
            System.out.format("Titulo: %s - Autor: %s\n", book.getAuthor(), book.getTitle());
        }
        for (Novel novel : libraryNovels) {
            System.out.format("Titulo: %s - Autor: %s\n", novel.getAuthor(), novel.getTitle());
        }
    }



    // BOOKS METHODS
    public void getBooks(ArrayList<Book> libraryBooks) {
        for (int i = 0; i < libraryBooks.size(); i++) {
            Book book = libraryBooks.get(i);
            System.out.format("%d Titulo: %s - Autor: %s - Páginas: %d\n", i + 1, book.getTitle(), book.getAuthor(), book.getPages());
        }
    }
    public void getAvailableBooks(ArrayList<Book> libraryBooks) {
        for (int i = 0; i < libraryBooks.size(); i++) {
            Book book = libraryBooks.get(i);
            if (i == 0){
                System.out.println("Libros:");
            }
            if (book.getAvailable() > 0){
                System.out.format("     Código: %d - Titulo: %s - Autor: %s - Edad de lectura sugerida: %d\n", i + 1, book.getTitle(), book.getAuthor(), book.getPages());
            }
        }
    }

    // NOVELS METHODS
    public void getNovels(ArrayList<Novel> libraryNovels) {
        for (int i = 0; i < libraryNovels.size(); i++) {
            Novel novel = libraryNovels.get(i);
            System.out.format("%d Titulo: %s - Autor: %s - Edad de lectura sugerida: %d\n", i + 1, novel.getTitle(), novel.getAuthor(), novel.getSuggestedReadingAge());
        }
    }


    public void getAvailableNovels(ArrayList<Novel> libraryNovels){
        for (int i = 0; i < libraryNovels.size(); i++) {
            Novel novel = libraryNovels.get(i);
            if (i == 0){
                System.out.println("Novelas:");
            }
            if (novel.getAvailable() > 0) {
                System.out.format("     %d Titulo: %s - Autor: %s - Edad de lectura sugerida: %d\n", i + 1, novel.getTitle(), novel.getAuthor(), novel.getSuggestedReadingAge());
            }
        }
    }

    public static void getListByAuthor(ArrayList<Book> libraryBooks, ArrayList<Novel> libraryNovels) {
        // Mapa para almacenar los objetos agrupados por autor
        Map<String, ArrayList<Object>> textsByAuthor= new HashMap<>();

        // Agregar libros al mapa agrupados por autor
        for (Book book : libraryBooks) {
            if (!textsByAuthor.containsKey(book.getAuthor())) {
                textsByAuthor.put(book.getAuthor(), new ArrayList<>());
            }
            textsByAuthor.get(book.getAuthor()).add(book);
        }

        // Agregar novelas al mapa agrupados por autor
        for (Novel novel : libraryNovels) {
            if (!textsByAuthor.containsKey(novel.getAuthor())) {
                textsByAuthor.put(novel.getAuthor(), new ArrayList<>());
            }
            textsByAuthor.get(novel.getAuthor()).add(novel);
        }

        // Imprimir la lista de objetos por autor con el formato requerido
        int index = 1;
        for (Map.Entry<String, ArrayList<Object>> entry : textsByAuthor.entrySet()) {
            String author = entry.getKey();
            ArrayList<Object> texts = entry.getValue();

            for (Object text : texts) {
                if (text instanceof Book) {
                    System.out.println(index + ". Autor: " + author + " - Título: " + ((Book) text).getTitle() + " - Tipo: Libro - Disponibles: " + ((Book) text).getAvailable());
                } else if (text instanceof Novel) {
                    System.out.println(index + ". Autor: " + author + " - Título: " + ((Novel) text).getTitle() + " - Tipo: Novela - Disponibles: " + ((Novel) text).getAvailable());
                }
                index++;
            }
        }
    }
}
