import java.util.Scanner;
public class Swap
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = input.nextInt();
        System.out.println("Enter value of b : ");
        int b = input.nextInt();
        System.out.println("Before Swapping a = "+a+" b = "+b);
        int swap = a;
        a = b;
        b = swap;
        System.out.println("After Swapping : a = "+a+" b = "+b);
    }    
}