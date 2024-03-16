package usecases.menu.prompt;


import org.junit.jupiter.api.Test;
import src.usecases.ui.prompt.PromptForStringInputUseCase;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PromptForStringrInputUseCaseTest {
    PromptForStringInputUseCase useCase = new PromptForStringInputUseCase();
    @Test
    void executeTest() {

        String simulatedInput = "Texto de prueba\n";
        InputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        Scanner scanner = new Scanner(inputStream);
        // ready for test
        String result = useCase.execute("Ingrese un texto: ", scanner);
        assertEquals("Texto de prueba", result.strip());
    }
}

