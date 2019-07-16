package adapter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import port.CalculatorPort;

public class CalculatorAdapterTest {
    //sut - service/system under test
    private CalculatorPort sut = new CalculatorAdapter();
    @Test
    public void add_test_should_return_what_expected() {
        //given
        Double a = 5.5;
        Double b = 4.2;
        //when
        Double result = sut.add(a,b);
        //then
        Assertions.assertThat(result).isEqualTo(9.7);
    }

    @Test
    public void subtract_test_return_what_expected() {
        //given
        Double a = 5.5;
        Double b = 2.5;
        //when
        Double result = sut.subtract(a,b);
        //then
        Assertions.assertThat(result).isEqualTo(3.0);
    }

    @Test
    public void multiply_test_return_what_expected() {
        //given
        Double a = 2.0;
        Double b = 2.5;
        //when
        Double result = sut.multiply(a,b);
        //then
        Assertions.assertThat(result).isEqualTo(5.0);
    }

    @Test
    public void divide_test_return_what_expected() {
        //given
        Double a = 5.0;
        Double b = 2.5;
        //when
        Double result = sut.divide(a,b);
        //then
        Assertions.assertThat(result).isEqualTo(2.0);
    }

    @Test
    public void divide_test_throw_exception() {
        //given
        Double a = 2.0;
        Double b = 0.0;
        //when
        //then
            Assertions.assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> {sut.divide(a,b);})
                    .withMessageContaining("/ by zero")
                    .withNoCause();
        }
    }
