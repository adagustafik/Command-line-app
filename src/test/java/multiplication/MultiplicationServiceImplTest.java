package multiplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationServiceImplTest {
    MultiplicationService calculationService;

    @BeforeEach
    void setup (){
        calculationService = new MultiplicationImpl();
    }

    @Nested
    class multiplyOK {
        String input11 = "12345678901234567890";
        String input12 = "11111111111111111111";
        String expected1 = "137174210013717420998628257899862825790";

        String input21 = "12345678901234567890123";
        String input22 = "12345678901234567890123";
        String expected2 = "152415787532388367504942236884722755800955129";

        @Test
        void multiply1OK() {
            String actual1 = calculationService.multiply1(input11, input12);
            String actual2 = calculationService.multiply1(input21, input22);
            assertEquals(expected1,actual1);
            assertEquals(expected2,actual2);
        }
        @Test
        void multiply2OK() {
            String actual1 = calculationService.multiply2(input11, input12);
            String actual2 = calculationService.multiply2(input21, input22);
            assertEquals(expected1,actual1);
            assertEquals(expected2,actual2);
        }

    }

    @Nested
    class multiplyOKNegative {
        String input1 = "-99999999999999999999";
        String input2 = "99999999999999999999";
        String expected1 = "-9999999999999999999800000000000000000001";
        String expected2 = "9999999999999999999800000000000000000001";

        @Test
        void multiply1OKNegative1() {
            String actual = calculationService.multiply1(input1, input2);
            assertEquals(expected1, actual);
        }
        @Test
        void multiply1OKNegative2() {
            String actual = calculationService.multiply1(input1, input1);
            assertEquals(expected2, actual);
        }
        @Test
        void multiply2OKNegative1() {
            String actual = calculationService.multiply2(input1, input2);
            assertEquals(expected1, actual);
        }
        @Test
        void multiply2OKNegative2() {
            String actual = calculationService.multiply2(input1, input1);
            assertEquals(expected2, actual);
        }
    }

    @Nested
    class multiplyOKZero {
        String input = "000000000000000000000";
        String expected = "0";

        @Test
        void multiply1zeroOK() {
            String actual = calculationService.multiply1(input, input);
            assertEquals(expected, actual);
        }
        @Test
        void multiply2zeroOK() {
            String actual = calculationService.multiply2(input, input);
            assertEquals(expected, actual);
        }
    }
}