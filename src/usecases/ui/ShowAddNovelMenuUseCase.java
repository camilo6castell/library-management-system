package usecases.ui;

import data.DataBase;
import usecases.novel.AddNovelUseCase;
import usecases.interfaces.IUseCase;

import java.util.Scanner;

public class ShowAddNovelMenuUseCase implements IUseCase<Object, Object> {
    @Override
    public Object execute(Object value) {
        return null;
    }

    @Override
    public Object execute() {
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
        new AddNovelUseCase().execute(DataBase.libraryNovels, title, author, quantity, available,
                onLoan, genre, suggestedReadingAge);
        new ShowAlertMessageUseCase().execute("\n");
        return null;
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
