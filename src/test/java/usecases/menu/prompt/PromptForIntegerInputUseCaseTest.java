package usecases.menu.prompt;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import src.usecases.ui.prompt.PromptForIntegerInputUseCase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PromptForIntegerInputUseCaseTest {
    PromptForIntegerInputUseCase promptForIntegerInputUseCase = new PromptForIntegerInputUseCase();
    Scanner scannerMock = mock(Scanner.class);

    @Test
    public void shouldReturnIntegerForValidInput() {

        when(scannerMock.next())
                .thenReturn("123");

        Integer result = promptForIntegerInputUseCase.execute("Ingrese un número: ", scannerMock);
        assertEquals(123, result);
    }

    @Test
    public void shouldReturnNullForInvalidInput() {
        when(scannerMock.next())
                .thenReturn("abc");

        Integer result = promptForIntegerInputUseCase.execute("Ingrese un número: ", scannerMock);
        assertNull(result);
    }

    // it is hard to test this.
//    @Test
//    public void shouldPrintErrorMessageForInvalidInput() {
//        when(scannerMock.next())
//                .thenReturn("abc");
//        promptForIntegerInputUseCase.execute("Ingrese un número: ", scannerMock);
//        Mockito.verify(System.out).println("El valor ingresado no es un número.");
//    }
}
