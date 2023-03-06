package multiplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationAppTest {

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;

    @BeforeEach
    void setNewPrintStream() {
        System.setOut(new PrintStream(outContent));
    }

    @Nested
    class mainOK {
        String input1 = "12345678901234567890";
        String input2 = "11111111111111111111";
        String expected = "137174210013717420998628257899862825790";

        @Test
        void mainOKargs1() {
            String[] args = {"--alg1", input1, input2};
            MultiplicationApp.main(args);
            String actual = outContent.toString().trim();
            assertEquals(expected, actual);
        }
        @Test
        void mainOKargs2() {
            String[] args = {"--alg2", input1, input2};
            MultiplicationApp.main(args);
            String actual = outContent.toString().trim();
            assertEquals(expected, actual);
        }
    }

    @Test
    void mainNotOKNoArgs() {
        MultiplicationApp.main(new String[]{});
        String actual = outContent.toString().split("\n")[1].trim();
        assertEquals("Command line arguments:", actual);
    }

    @Test
    void mainNotOKMissingArgs() {
        MultiplicationApp.main(new String[]{"--alg1"});
        String actual = outContent.toString().trim();
        assertEquals("Something is missing. Provided input: --alg1", actual);
    }

    @Test
    void mainNotOKTooManyArgs() {
        MultiplicationApp.main(new String[]{"--alg1", "1", "2", "3"});
        String actual = outContent.toString().trim();
        assertEquals("Too many arguments provided: --alg1 1 2 3", actual);
    }

    @Test
    void mainNotOkWrongFlag() {
        MultiplicationApp.main(new String[]{"--xxxx", "1", "2"});
        String actual = outContent.toString().split("\n")[0].trim();
        assertEquals("Unsupported argument provided: --xxxx 1 2", actual);
    }


    @AfterEach
    void reSetPrintStream() {
        System.setOut(originalOut);
    }
}