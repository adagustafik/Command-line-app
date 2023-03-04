package sk.pantheon.calculation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceImplTest {
    CalculationService calculationService;

    @BeforeEach
    void setup (){
        calculationService = new CalculationServiceImpl();
    }

    @Test
    void multiplyOK() {
        String input1 = "12345678901234567890";
        String input2 = "11111111111111111111";
        String output = "137174210013717420998628257899862825790";
        String actualMultiply1 = calculationService.multiply1(input1, input2);
        String actualMultiply2 = calculationService.multiply2(input1, input2);
        assertEquals(output,actualMultiply1);
        assertEquals(output, actualMultiply2);
    }

    void multiplyOKNegative1() {
        String input1 = "-99999999999999999999";
        String input2 = "99999999999999999999";
        String output = "999999999999999999800000000000000000001";
        String actualMultiply1 = calculationService.multiply1(input1, input2);
        String actualMultiply2 = calculationService.multiply2(input1, input2);
        assertEquals(output,actualMultiply1);
        assertEquals(output, actualMultiply2);
    }

    void multiplyOKNegative2() {
        String input1 = "-12345678901234567890123";
        String input2 = "-12345678901234567890123";
        String output = "152415787532388367504942236884722755800955129";
        String actualMultiply1 = calculationService.multiply1(input1, input2);
        String actualMultiply2 = calculationService.multiply2(input1, input2);
        assertEquals(output,actualMultiply1);
        assertEquals(output, actualMultiply2);
    }

    void zeroOK() {
        String input1 = "-0000000000";
        String input2 = "00000000000000000000000000";
        String output = "0";
        String actualMultiply1 = calculationService.multiply1(input1, input2);
        String actualMultiply2 = calculationService.multiply2(input1, input2);
        assertEquals(output,actualMultiply1);
        assertEquals(output, actualMultiply2);
    }
}