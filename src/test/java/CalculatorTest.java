import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

class CalculatorTest {

    @ParameterizedTest
    @ValueSource(doubles = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
        // six numbers
    void shouldReturnCorrectResults(double number1) {
        double number2 = 2 * number1;

        CalculateResult result = Calculator.calculate(number1, number2);

        double expectedMultiplication = number1 * number2;
        double expectedDivision = number1 / number2;
        int expectedReminder = (int) (number1 % number2);

        assertThat(result.getDivision()).isEqualTo(expectedDivision);
        assertThat(result.getMultiplication()).isEqualTo(expectedMultiplication);
        assertThat(result.getRemainder()).isEqualTo(expectedReminder);
    }

    @Test
    @DisplayName("Should throw exception when first number is zero")
    void shouldThrowExceptionWhenFirstNumberIsZero() {
        double num1 = 3;
        double num2 = 0;

        assertThrows(ArithmeticException.class , () -> Calculator.calculate(num1, num2));
    }
}