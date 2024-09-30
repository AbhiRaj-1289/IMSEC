import java.util.Scanner;
public class GCD 
{
    public static void main(String[] args) 
    {
        int num1, num2, i = 1, gcd = 0;
        try (Scanner input = new Scanner(System.in)) 
        {
            System.out.print("Enter the first number : ");
            num1 = input.nextInt();
            System.out.print("Enter the second number : ");
            num2 = input.nextInt();
            while(i <= num1 && i <= num2) 
            {
                if(num1 % i == 0 && num2 % i == 0)
                {
                    gcd = i;
                }
                i += 1;
            }
            System.out.println("The G.C.D. of given numbers = "+gcd);
        }    
    }
}
