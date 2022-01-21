package study.calculatorTest;

import calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    Calculator cal = new Calculator();
    @Test
    void eval(){
        assertThat(cal.eval("3*2-3*4/2+2*3+6")).isEqualTo(12);
    }
    @Test
    void evalWithBlanks(){
        assertThat(cal.eval(" 3*2 - 3 *4/2 +2* 3+ 6")).isEqualTo(12);
    }
}
