package usecases.novel;

import org.junit.jupiter.api.Test;
import src.models.texts.Novel;
import src.usecases.novel.UpdateNovelUseCase;

import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UpdateNovelUseCaseTest {
    // Instance creation
    UpdateNovelUseCase updateNovelUseCase = new UpdateNovelUseCase();
    @Test
    void execute() {
        // setting mocked outdated novel
        Novel outdatedNovel = new Novel("Título Antiguo", "Autor Antiguo", 10, "Género Antiguo", 18);

        // mocked scanner
        Scanner scannerMock = mock(Scanner.class);
        when(scannerMock.nextLine())
                .thenReturn("Nuevo Título")
                .thenReturn("Nuevo Autor")
                .thenReturn("Nuevo Género")
                .thenReturn("15")
                .thenReturn("16");

                Novel updatedNovel = updateNovelUseCase.execute(outdatedNovel, scannerMock);

        assertEquals("Nuevo Título", updatedNovel.getTitle());
        assertEquals("Nuevo Autor", updatedNovel.getAuthor());
        assertEquals("Nuevo Género", updatedNovel.getGenre());
        assertEquals(15, updatedNovel.getQuantity());
        assertEquals(16, updatedNovel.getSuggestedReadingAge());
    }
}
