import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args) 
    {
        int num, i = 1, fact = 1;
        try(Scanner input = new Scanner(System.in))
        {
            System.out.print("Enter A Positive Number : ");
            num = input.nextInt();
            for(i = 1; i <= num; i++)
            {
                fact = fact * i;
            }
            System.out.print("Factorial of given number = "+fact);
        }    
    }
}
