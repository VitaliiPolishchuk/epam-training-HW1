package second;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        while (true) {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            try {
                int negativeNumber = Integer.parseInt(reader.readLine());
                if(negativeNumber == Integer.MIN_VALUE) System.out.println("Out of range");
                else System.out.println(convertNegativeToPositive(negativeNumber));
            } catch (Exception e) {
                System.out.println("Error during reading input");
            }
        }
    }

    private static int convertNegativeToPositive(int negativeNumber){
        return addNumbers(~negativeNumber, 1);
    }

    private static int addNumbers(int x, int y) {
        if (y==0) return x;
        return addNumbers(x^y,(x&y)<<1);
    }
}