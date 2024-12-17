import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the secret code, first key value (N), and second key value (M) as input
        long S = scanner.nextLong();
        long N = scanner.nextLong();
        long M = scanner.nextLong();

        // Encrypt the code using the given formula and key values
        long encryptedCode = encryptCode(S, N, M);

        // Print the encrypted code
        System.out.println(encryptedCode);
    }

    public static long encryptCode(long S, long N, long M) {
        // Calculate the remainder of S^N divided by 10
        long SN = pow(S, N) % 10;

        // Calculate the remainder of (S^N)^M divided by 10
        long SMN = pow(SN, M) % 10;

        // Calculate the remainder of (S^N)^M divided by 1000000007
        long encryptedCode = SMN % 1000000007;

        return encryptedCode;
    }

    public static long pow(long base, long exponent) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= base;
                result %= 10;
            }
            base *= base;
            base %= 10;
            exponent /= 2;
        }
        return result;
    }
}