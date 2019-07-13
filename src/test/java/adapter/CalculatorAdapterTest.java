package adapter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorAdapterTest {
    //sut - service/system under test
    private CalculatorAdapter sut = new CalculatorAdapter();
    @Test
    public void AddTestShouldReturnWhatExpected() {
        //given
        Double a = 5.5;
        Double b = 4.2;
        //when
        Double result = sut.add(a,b);
        //then
        Assertions.assertThat(result).isEqualTo(9.7);
    }

    @Test
    public void SubtractTestShouldReturnWhatExpected() {
        //given
        Double a = 5.5;
        Double b = 2.5;
        //when
        Double result = sut.subtract(a,b);
        //then
        Assertions.assertThat(result).isEqualTo(3.0);
    }

    @Test
    public void multiplyTestShouldReturnWhatExpected() {
        //given
        Double a = 2.0;
        Double b = 2.5;
        //when
        Double result = sut.multiply(a,b);
        //then
        Assertions.assertThat(result).isEqualTo(5.0);
    }

    @Test
    public void DivideTestShouldThrowException() {
        //given
        Double a = 2.0;
        Double b = 0.0;
            Assertions.assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> {sut.divide(a,b);})
                    .withMessageContaining("/ by zero")
                    .withNoCause();
        }
    }
