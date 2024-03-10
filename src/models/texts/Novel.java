package models.texts;

import models.loans.Loan;
import models.users.Reader;

import java.util.Scanner;

import static data.DataBase.libraryLoans;
import static data.DataBase.libraryNovels;

public class Novel extends Text {
    private String genre;
    private int suggestedReadingAge;

    public Novel(String title, String author, int quantity, int available, int onLoan, String genre, int suggestedReadingAge) {
        super(title, author, quantity, available, onLoan);
        this.genre = genre;
        this.suggestedReadingAge = suggestedReadingAge;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSuggestedReadingAge() {
        return suggestedReadingAge;
    }

    public void setSuggestedReadingAge(int suggestedReadingAge) {
        this.suggestedReadingAge = suggestedReadingAge;
    }

    public static void setNovelLoan(Reader reader){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código de la novela a pedir prestada: ");
        int index = scanner.nextInt();
        Novel novelForLoan = libraryNovels.get(index - 1);
        novelForLoan.setAvailable(novelForLoan.getAvailable()-1);
        novelForLoan.setOnLoan(novelForLoan.getOnLoan()+1);
        Loan.createLoan(libraryLoans, reader.getEmail(), novelForLoan.getTitle(), novelForLoan.getAuthor());
        System.out.println();
        System.out.format("""
                         Préstamo de la novela '%s' requerido.
                         
                         Recuerda acercarte a un asistente de biblioteca para recibir el libro deseado.""", novelForLoan.getTitle());
        System.out.println();
        System.out.print("Ingresa 1 para volver a menú anterior: ");
        scanner.next();
    }
}

