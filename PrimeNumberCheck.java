import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number= scan.nextInt();
        for(int i=1;i<number;i++)
        {
            if(number%i==0){
                System.out.println("not a prime number.....");
                break ;
            }
            else
                System.out.println("prime number");
        }
    }
}
