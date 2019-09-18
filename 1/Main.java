package first;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        while (true) {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            try {
                String binaryNumber = reader.readLine();
                if(!isValidBinaryNumber(binaryNumber)) System.out.println("Error, not valid binary number");
                else System.out.println(convertBinaryToDecimal(binaryNumber));
            } catch (Exception e) {
                System.out.println("Error during reading input");
            }

        }
    }

    private static boolean isValidBinaryNumber(String binaryNumber) {
        if (binaryNumber.length() > Integer.SIZE) return false;
        for (int i = 0; i < binaryNumber.length(); ++i)
            if (binaryNumber.charAt(i) != '0' &&
                binaryNumber.charAt(i) != '1')
                return false;
        return true;
    }

    private static int convertBinaryToDecimal(String binaryNumber){
        int res = 0, n = binaryNumber.length();
        for (int i = 0; i < n; ++i)
            if (binaryNumber.charAt(i) == '1')
                res += 1 << (n - i - 1);
        return res;
    }
}
