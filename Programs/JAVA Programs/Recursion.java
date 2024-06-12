import java.util.Scanner;
public class Recursion 
{
    static int fact(int n)
        {
            if(n == 1)
                return 1;
            int result = fact(n-1)*n;
            return result;
        }
    public static void main(String[] args) 
    {
        try(Scanner input = new Scanner(System.in))
        {
            int num;
            System.out.print("Enter a number : ");
            num = input.nextInt();
            System.out.println("Factorial of "+num+" is "+fact(num));
        }
    }
}
