import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number whose prime factor we want to print ");
        int number= scan.nextInt();
        int factors;
        System.out.println("the prime factors of a number is ");
        for(int i=1;i<number;i++)
        {
          factors=number%i;
          if ((factors==0 && isPrime(i)))
          {
              System.out.println(i+" ");
          }

        }
    }

        public static boolean isPrime(int n)
        {
            boolean number2=true;

        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                number2=false;
                break;
            }
        }
        return number2 ;
    }
}
