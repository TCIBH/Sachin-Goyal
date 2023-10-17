import java.util.Scanner;

public class FactorialOfANumber
{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number whose factorial we want to find");
        int number=scan.nextInt();
         int factorial=1;
      for(int i=1;i<=number;i++)
      {
          factorial=factorial*i;
      }
        System.out.print(factorial);

    }
}
