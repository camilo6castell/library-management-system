package usecases.validations;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import src.validations.IsValidName;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IsValidNameTest {

    @Test
    public void shouldReturnTrueForValidName() {
        Scanner scanner = new Scanner(System.in);
        String name = "Alice";
        assertTrue(IsValidName.isValidName(name, scanner));
    }

    @Test
    public void shouldReturnFalseForShortName() {
        Scanner scannerMock = mock(Scanner.class);
        when(scannerMock.nextLine())
                .thenReturn("1");
        String name = "Al";
        assertFalse(IsValidName.isValidName(name, scannerMock));
    }


    @Test
    public void shouldReturnFalseForNameWithNumber() {
        Scanner scannerMock = mock(Scanner.class);
        when(scannerMock.nextLine())
                .thenReturn("1");
        String name = "Alice123";
        assertFalse(IsValidName.isValidName(name, scannerMock));
    }

    @Test
    public void shouldReturnTrueForNameWithThreeCharacters() {
        String name = "Bob";
        assertTrue(IsValidName.isValidName(name, null));
    }
}