package usecases.novel;

import models.texts.Novel;
import usecases.interfaces.TextUseCase;

import java.util.ArrayList;

public class AddNovelUseCase implements TextUseCase<ArrayList<Novel>, String, Integer> {
    @Override
    public void execute() {

    }

    @Override
    public void execute(ArrayList<Novel> valueA, String valueB) {

    }

    @Override
    public ArrayList<Novel> execute(ArrayList<Novel> valueA, String valueB, String valueBB) {
        return null;
    }

    @Override
    public ArrayList<Novel> execute(ArrayList<Novel> libraryNovels, String title, String author, Integer quantity,
                                   Integer available, Integer onLoan, String genre, Integer suggestedReadingAge) {
        boolean isNovel = libraryNovels.stream().anyMatch(object -> object.getTitle().equals(title));
        if (isNovel) {
            System.out.println("La novela con el título " + title + " ya se encuentra en nuestro registro. " +
                    "La novela no se agregará a la biblioteca.");
        } else {
            Novel newNovel = new Novel(title, author, quantity, available, onLoan, genre, suggestedReadingAge);
            libraryNovels.add(newNovel);
            System.out.println("La novela con el título " + title + " ha sido agregado a nuestra biblioteca.");
        }
        return null;
    }
}
