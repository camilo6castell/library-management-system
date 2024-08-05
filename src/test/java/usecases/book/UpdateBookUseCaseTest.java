package usecases.book;

import org.junit.jupiter.api.Test;
import src.models.texts.Book;
import src.usecases.book.UpdateBookUseCase;

import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UpdateBookUseCaseTest {
    @Test
    void execute() {
        // Instance creation
        UpdateBookUseCase updateBookUseCase = new UpdateBookUseCase();

        // Setting outdatedBook
        Book outdatedBook = new Book("Antiguo Título", "Antiguo Autor", 10, "Antigua Área", 100);

        // scanner simulation
        Scanner scannerMock = mock(Scanner.class);
        when(scannerMock.nextLine())
                .thenReturn("Nuevo Título")
                .thenReturn("Nuevo Autor")
                .thenReturn("Nueva Área")
                .thenReturn("15") // Nueva cantidad
                .thenReturn("150"); // Nuevas páginas


        // Llamar al método execute() con los datos del libro desactualizado y el scanner simulado
        Book updatedBook = updateBookUseCase.execute(outdatedBook, scannerMock);

        // Verificar si el libro ha sido actualizado correctamente
        assertEquals("Nuevo Título", updatedBook.getTitle());
        assertEquals("Nuevo Autor", updatedBook.getAuthor());
        assertEquals("Nueva Área", updatedBook.getKnowledgeArea());
        assertEquals(15, updatedBook.getQuantity());
        assertEquals(150, updatedBook.getPages());
    }
}
