package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    Calculator cal = new Calculator();
    @Test
    public void eval(String expression, int ans){
        assertThat(cal.eval(expression)).isEqualTo(ans);
    }
    @Test
    public static void main(String[] args){
        CalculatorTest test = new CalculatorTest();
        test.eval(" 3* 2-3*4/2+2*3+6", 12);
    }
}
