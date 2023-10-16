import java.util.Scanner;

public class PrintNumberInRange {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int i,number1,number2;
        System.out.println("Enter the range in which you want to find range ");
        System.out.println("Enter the starting point");
        number1= scan.nextInt();
        System.out.println("Enter the ending point");
        number2= scan.nextInt();
        i=number1;
        System.out.printf("even number in between range %d and %d",number1,number2);
        do {
            if(i%2==0)
            {
                System.out.println(i+" ");
            }
            i++;

        }
        while(i>=number1 && i<=number2);

    }
}
