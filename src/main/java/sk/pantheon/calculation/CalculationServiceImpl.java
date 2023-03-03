package sk.pantheon.calculation;

import java.math.BigInteger;

public class CalculationServiceImpl implements CalculationService {


    @Override
    public BigInteger multiply1(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        return a.multiply(b);
    }

    //TODO take care of negative numbers as well!!!
    @Override
    public String multiply2(String num1, String num2) {
        return null;
    }
}
