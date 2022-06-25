import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    void shouldAddTwoValues() {
        //given
        int value1 = 2;
        int value2 = 2;
        //when
        int additionResult = Calculator.add(value1, value2);
        //then
        Assert.assertEquals(4, additionResult);
    }

    @Test
    void shouldSubstractTwoValues() {
        //given
        int value1 = 5;
        int value2 = 2;
        //when
        int substractionResult = Calculator.substract(value1, value2);
        //then
        Assert.assertEquals(2, substractionResult);
    }

    @Test
    void shouldMultiplyTwoValues() {
        //given
        int value1 = 3;
        int value2 = 2;
        //when
        int multiplicationResult = Calculator.multiply(value1, value2);
        //then
        Assert.assertEquals(6, multiplicationResult);
    }

    @Test
    void shouldDividedTwoValues() {
        //given
        int value1 = 10;
        int value2 = 5;
        //when
        int divisionResult = Calculator.divide(value1, value2);
        //then
        Assert.assertEquals(2, divisionResult);
    }

}
