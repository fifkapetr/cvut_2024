package lab04;

import hw2.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParametrizedTests {
    private Calculator calc = new Calculator();

    @BeforeEach
    public void init() {
        calc = new Calculator();
    }

    @ParameterizedTest(name = "{0} adds {1} should be equal {2}")
    @CsvSource({"1, 2, 3", "2, 3, 5", "1, 1, 3"})
    public void add_AddsAandB_returnC(int a, int b, int c) {
        Assertions.assertEquals(c, calc.add(a, b));
    }

    //Vytvořte parametrizované testy na calc.multiply(),
    //vytvořte aspoň 3 pozitivní sady
    @ParameterizedTest(name = "{0} multiplies {1} should be equal {2}")
    @CsvSource({"2, 2, 4", "2, 3, 6", "5, 9, 45"})
    public void multiply_multipliesAandB_returnC(int a, int b, int c) {
        Assertions.assertEquals(c, calc.multiply(a, b));
    }
}
