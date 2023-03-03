package sk.pantheon.calculation;

import java.util.Arrays;
import java.util.List;

public class CalculationApp {

    private static final List<String> flags = Arrays.asList("--alg1", "--alg2");

    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }
        String arguments = String.join(" ", args);
        if (args.length < 3) {
            System.out.println("Something is missing. Provided input: " + arguments);
            return;
        }
        if (args.length > 4) {
            System.out.println("Too many arguments provided: " + arguments);
            return;
        }
        String flag = args[0];
        if (!flags.contains(flag)) {
            System.out.println("Unsupported argument provided:" + arguments);
            printUsage();
            return;
        }
        Long num1;
        Long num2;
        try {
            num1 = Long.parseLong(args[1]);
            num2 = Long.parseLong(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number format provided: " + arguments);
            return;
        }


    }

    public static void printUsage() {
        System.out.println("=============================");
        System.out.println("Command line arguments:");
        System.out.println("\t" + "-alg1" + "\t" + " Algorithm using BigInteger class");
        System.out.println("\t" + "-alg2" + "\t" + " Algorithm from scratch");
    }
}
