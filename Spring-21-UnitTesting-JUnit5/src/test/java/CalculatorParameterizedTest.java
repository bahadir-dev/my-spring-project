import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class CalculatorParameterizedTest {


    @ParameterizedTest
    @ValueSource(strings = {"abc1","abc2","ced3"})
    void testCase1(String args){
        Assertions.assertTrue(!args.isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {3 , 6 , 9})
    void testCase2(int number){
        Assertions.assertEquals(0 , number % 3);

    }

    @ParameterizedTest
    @ValueSource(strings = {"abc1","abc2","ced3"})
//    @EmptySource
//    @NullSource
    @NullAndEmptySource
    void testCase3(String args){
        Assertions.assertTrue(!args.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testCas4(String arg){
        Assertions.assertNotNull(arg);
    }

    static String[] stringProvider(){
        return new String[]{"Java", "JS", "Ruby"};
    }

    @ParameterizedTest
    @CsvSource({"10,20,30", "20,20,40", "10,30,50"})
    void testCase5(int num1, int num2, int result){
        Assertions.assertEquals(result, Calculator.add(num1, num2));
    }



}
