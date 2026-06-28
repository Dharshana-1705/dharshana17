import java.util.Scanner;

public class primedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num > 0) {
            int digit = num % 10;

            if (digit == 2|| digit == 3 || digit == 5 || digit == 7) {
                System.out.println(digit);
            }

            num = num / 10;
        }
    }
}