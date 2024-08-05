package usecases.novel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import src.models.texts.Novel;
import src.usecases.novel.AskForNewNovelUseCase;

import java.util.Scanner;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AskForNewNovelUseCaseTest {
    // Instance creation for testing
    AskForNewNovelUseCase useCase = new AskForNewNovelUseCase();

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
                .thenReturn("Don Quijote de la Mancha")
                .thenReturn("Miguel de Cervantes")
                .thenReturn("Caballería")
                .thenReturn("20")
                .thenReturn("11");

        // ready for test
        Novel testNovel = useCase.execute(scannerMock);
        //Checking results
        assertEquals("Don Quijote de la Mancha", testNovel.getTitle());
        assertEquals("Miguel de Cervantes", testNovel.getAuthor());
        assertEquals("Caballería", testNovel.getGenre());
        assertEquals(20, testNovel.getQuantity());
        assertEquals(11, testNovel.getSuggestedReadingAge());
    }
}
