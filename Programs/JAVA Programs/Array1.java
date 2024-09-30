import java.util.Scanner;
public class Array1 
{
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in)) 
        {
            int i, arr[] = new int[5];
            System.out.print("Enter elements : \n");
            for(i = 0;i < 5; i++)
            {
                arr[i] = input.nextInt();
            }  
            System.out.print("Array elements are : \n");  
            for(i = 0; i < 5;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
