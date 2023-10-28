
import lab7_unit_test.for_test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test7 {
    @Test
    void test1(){
        float expected = 4;
        float actual = for_test.calculate('+',2,2);
        assertEquals(expected,actual);
        int expected_1 =5;
        int actual_1=for_test.plus(2,3);
        assertEquals(expected_1,actual_1);
    }
    @Test
    void test2(){
        float expected = -1;
        float actual= for_test.calculate('!',1,1);
        assertEquals(expected,actual);
        float expected1 = 0;
        float actual1 = for_test.calculate('-',2,2);
        assertEquals(expected,actual);
        float expected2 = 10000;
        float actual2 = for_test.calculate('*',2,5000);
        assertEquals(expected,actual);
        float expected3 = 1/3;
        float actual3 = for_test.calculate('/',1,3);
        assertEquals(expected,actual);
    }
}
