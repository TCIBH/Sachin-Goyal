import java.util.Scanner;

public class SumofprimeNumberUsingdoWhile
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number= scan.nextInt();
int factors;
int i=1,sum=0;
do {

    factors=number%i;
    if(factors==0&&isPrime(i))
    {
        System.out.println(i+"");
        sum=sum+i;
    }
    i++;


}

while(i<number);

        System.out.println("sum of the prime factor of the given number is "+sum);
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
