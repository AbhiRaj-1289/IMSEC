import java.util.Scanner;
public class Add 
{
    public static void main(String[] args) 
    {
        try(Scanner input = new Scanner(System.in)) 
        {
            int a, b, c;
            System.out.print("Enter First Number : ");
            a = input.nextInt();
            System.out.print("Enter Second Number : ");
            b = input.nextInt();
            c = a + b;
            System.out.println("Sum = "+c);
        }
    }    
}