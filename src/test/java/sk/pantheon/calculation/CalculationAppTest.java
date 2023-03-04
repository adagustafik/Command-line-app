package sk.pantheon.calculation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculationAppTest {

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;

    @BeforeEach
    void setNewPrintStream() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void mainOK() {
        String input1 = "12345678901234567890";
        String input2 = "11111111111111111111";
        String[] args1 = {"--alg1", input1, input2};
        String[] args2 = {"--alg2", input1, input2};
        String expected = "137174210013717420998628257899862825790";
        CalculationApp.main(args1);
        String actual = outContent.toString().trim();
        assertEquals(expected, actual);
        CalculationApp.main(args2);
    }
}