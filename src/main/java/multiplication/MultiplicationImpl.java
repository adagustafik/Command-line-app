package multiplication;

import java.math.BigInteger;

public class MultiplicationImpl implements MultiplicationService {

    @Override
    public String multiply1(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        return a.multiply(b).toString();
    }

    @Override
    public String multiply2(String num1, String num2) {
        if(num1.matches("[0]*") || num2.matches("[0]*")){
            return "0";
        }
        boolean isNegative = false;
        if (num1.startsWith("-") ){
            num1 = num1.substring(1);
            isNegative = true;
        }
        if (num2.startsWith("-")) {
            num2 = num2.substring(1);
            isNegative = !isNegative;
        }
        int[] reversed = new int[num1.length() + num2.length()];
        int shiftDigNum2 = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int carry = 0;
            int digit1 = num1.charAt(i) - '0';
            int shiftDigNum1 = 0;
            for (int j = num2.length() - 1; j >= 0 ; j--) {
                int digit2 = num2.charAt(j) - '0';
                int sum = (digit1 * digit2) + reversed[shiftDigNum1 + shiftDigNum2] + carry;
                carry = sum / 10;
                reversed[shiftDigNum1 + shiftDigNum2] = sum % 10;
                shiftDigNum1++;
            }
            if (carry > 0) {
                reversed[shiftDigNum1 + shiftDigNum2] += carry;
            }
            shiftDigNum2++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = reversed.length - 1; i >= 0; i--) {
            if (i != reversed.length - 1 || reversed[i] != 0) {
                sb.append(reversed[i]);
            }
        }
        return (isNegative ? "-" : "") + sb;
    }
}
