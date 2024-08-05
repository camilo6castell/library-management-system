package usecases.validations;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import src.validations.IsValidPassword;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidPasswordTest {

    @Mock
    Scanner mockScanner;

    @Test
    public void shouldReturnTrueForValidPassword() {
        String password = "password123";
        assertTrue(IsValidPassword.isValidPassword(password, null));
    }

    @Test
    public void shouldReturnFalseForInvalidPassword() {
        String password = "123";
        assertFalse(IsValidPassword.isValidPassword(password, null));
    }

    @Test
    public void shouldPromptForInputIfPasswordIsInvalid() {
        Mockito.when(mockScanner.nextLine()).thenReturn("");
        String password = "123";
        IsValidPassword.isValidPassword(password, mockScanner);
        Mockito.verify(mockScanner).nextLine();
    }
}