import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCase1(){

    }

    @Test
    void testCase2(){
        assertTrue(Calculator.operator.equals("add"));
    }

    @Test
    void testCase3(){

    }

    @Test
    void testCase4(){

    }

    @Test
    void testCase5(){

    }
    @Test
    void add(){
        int actual = Calculator.add(2,3);
        assertEquals(5,actual, "It is not matching with expected value.");
    }

}