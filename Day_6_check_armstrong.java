import java.util.Scanner;

public class Day_6_check_armstrong {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        int n = ob.nextInt();

        int temp = n;

        int sum = 0, digit = 0;

        while (temp > 0) {

            digit++;

            temp = temp / 10;

        }

        temp = n;

        while (temp > 0) {

            int x = temp % 10;

            sum += Math.pow(x, digit);

            temp = temp / 10;

        }

        if (sum == n) {

            System.out.println("true");

        } else {

            System.out.println("false");

        }


    }
}