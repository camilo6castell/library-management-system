package usecases.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import src.models.texts.Book;
import src.usecases.book.AskForNewBookUseCase;

import java.util.Scanner;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AskForBookUseCaseTest {

    // Instance creation for testing
    AskForNewBookUseCase useCase = new AskForNewBookUseCase();

    @Mock
    private Scanner scannerMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    // Prepare mock entries for method
    @Test
    void execute() {
        when(scannerMock.nextLine())
                .thenReturn("La república")
                .thenReturn("Platon")
                .thenReturn("Filosofía")
                .thenReturn("12")
                .thenReturn("200");

        // ready for test
        Book testBook = useCase.execute(scannerMock);
        //Checking results
        assertEquals("La república", testBook.getTitle());
        assertEquals("Platon", testBook.getAuthor());
        assertEquals("Filosofía", testBook.getKnowledgeArea());
        assertEquals(12, testBook.getQuantity());
        assertEquals(200, testBook.getPages());
    }
}
