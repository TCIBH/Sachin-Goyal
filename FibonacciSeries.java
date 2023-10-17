import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int number2 = 0;
        int number3=1;
        int swap;
        System.out.println("Enter the nth term for which you want to print fibonacci series\n");
        number = scan.nextInt();
        System.out.printf("the fibonacciSeries of first %d number is \n",number);
        int i=0;
        while ( i < number ) {
            System.out.println(number3);
            swap=number3;
            number3=number3+number2;
            number2=swap;

           i++;
        }

    }
}

