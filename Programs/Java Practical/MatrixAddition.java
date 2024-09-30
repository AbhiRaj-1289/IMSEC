import java.util.Scanner;
public class MatrixAddition 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows in matrix : ");
        int rows = input.nextInt();
        System.out.print("Enter no. of columns in matrix : ");
        int columns = input.nextInt();
        System.out.println("Enter elements of first matrix : ");
        int[][] a = new int[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix : ");
        int[][] b = new int[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                b[i][j] = input.nextInt();
            }
        }
        int[][] result = new int[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Resultant Matrix : ");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}