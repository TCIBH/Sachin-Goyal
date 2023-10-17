import java.util.Scanner;
public class SpiralPrinting {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the size of matrix ");
        int size= scan.nextInt();
        int[][] spiralMatrix= new int[size][size];
        int minCol=0;
        int maxCol=size-1;
        int minRow=0;
        int maxRow=size-1;
        int value=1;
        while(value<=size*size)
        {
            for (int i=minCol;i<=maxCol;i++)
            {
                spiralMatrix[minRow][i]=value;
                value++;
            }
            for(int i=minRow+1;i<=maxRow;i++)
            {
                spiralMatrix[i][maxCol]=value;
                value++;
            }
            for(int i=maxCol-1;i>=minCol;i--)
            {
                spiralMatrix[maxRow][i]=value;
                value++;
            }
                for(int i=maxRow-1;i>=minRow+1;i--)
                {
                    spiralMatrix[i][minCol]=value;
                    value++;
                }
                minCol++;
                minRow++;
                maxRow--;
                maxCol--;

        }
        for(int i=0;i< spiralMatrix.length;i++) {
            for (int j = 0; j < spiralMatrix.length; j++)
            {
                System.out.print(spiralMatrix[i][j] + " \t");
            }
            System.out.println();

        }
    }
}

