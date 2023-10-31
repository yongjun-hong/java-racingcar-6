package racingcar.validation;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class InputValidatorTest {

    @Test
    void isLengthGreaterThanFiveShouldThrowExceptionWhenLengthOverFive() {
        List<String> testNames = Arrays.asList("용준1", "용준2", "용준12345");
        assertThrows(IllegalArgumentException.class,()->InputValidator.isLengthGreaterThanFive(testNames));
    }

}