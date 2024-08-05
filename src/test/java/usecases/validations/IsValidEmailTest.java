package usecases.validations;

import org.junit.jupiter.api.Test;
import src.validations.IsValidEmail;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IsValidEmailTest {

    Scanner scanner = new Scanner(System.in);

    @Test
    public void testValidEmail() {

        assertTrue(IsValidEmail.execute("jane@due.com", scanner));
        assertTrue(IsValidEmail.execute("john.doe@example.co.uk", scanner));
    }

    @Test
    public void testInvalidEmail() {

        Scanner scannerMock = mock(Scanner.class);
        when(scannerMock.nextLine())
                .thenReturn("1");

        assertFalse(IsValidEmail.execute("invalid_email", scannerMock));
        assertFalse(IsValidEmail.execute("not_an_email@com", scannerMock));
    }
}

