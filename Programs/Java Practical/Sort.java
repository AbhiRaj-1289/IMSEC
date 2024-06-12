import java.util.Scanner;

public class Sort 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        
        for (int i = 0; i < array.length - 1; i++) 
        {
            for (int j = 0; j < array.length - i - 1; j++) 
            {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
