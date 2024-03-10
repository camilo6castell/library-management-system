package usecases.ui;

import data.DataBase;
import models.texts.Novel;
import usecases.novel.ShowAllNovelsUseCase;
import usecases.novel.UpdateNovelUseCase;
import usecases.interfaces.IUseCase;

import java.util.Scanner;

public class ShowUpdateNovelMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String title, author, genre;
        int quantity, available, onLoan, suggestedReadingAge;
        System.out.println("""
                _______________________________________________________________

                Actualizando Novela >>
                            
                Elija la novela que desea actualizar
                
                """);
        new ShowAllNovelsUseCase().execute();
        System.out.println();
        System.out.print("Digita el número del libro a actualizar: ");
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
        new UpdateNovelUseCase().execute(DataBase.libraryNovels, outDatedNovel, upDatedNovel);
        new ShowAlertMessageUseCase().execute("\n");
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }

    @Override
    public Object execute(Object value) {
        return null;
    }
}

