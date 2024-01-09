import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setup(){
        System.out.println("Before each test ...");
    }

    @AfterEach
    void tearDown(){
        System.out.println("After each test ....");
    }
    @Test
    void testCase1(){
        System.out.println("Test1");

    }

    @Test
    void testCase2(){
        System.out.println("Test2");
        assertTrue(Calculator.operator.equals("add"));
    }

    @Test
    void testCase3(){
        System.out.println("Test3");
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});
    }

    @Test
    void testCase4(){
        String nullString = null;
        String notNullString = "cydeo";
        assertNull(nullString);
        assertNotNull(notNullString);
 //       assertNotNull(nullString);
    }

    @Test
    void testCase5(){
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();
        assertSame(c1, c2);
        assertNotSame(c1, c3);

    }
    @Test
    void add(){
        int actual = Calculator.add(2,3);
        assertEquals(5,actual, "It is not matching with expected value.");
    }

    @Test
    void add2(){
        assertThrows(IllegalArgumentException.class, () -> Calculator.add2(5,2));
    }

}