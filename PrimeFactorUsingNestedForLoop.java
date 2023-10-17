import java.util.Scanner;

public class PrimeFactorUsingNestedForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number whose prime factor we want to print ");
        int number = scan.nextInt();
        int  isprime;
        System.out.println("the prime factors of a number is ");
        for (int i = 1; i < number; i++) {

            if (number % i == 0)
            {
                isprime=1;
                for (int j = 2; j < i/2; j++) {
                    if (i%j == 0) {
                        isprime = 0;
                        break;
                    }
                }

                    if (isprime == 1) {
                        System.out.println(i);
                    }

            }

        }
    }
}




