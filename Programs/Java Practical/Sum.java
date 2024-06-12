import java.util.Scanner;
public class Sum 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i <= 20; i++)
        {
            sum += i;
        }    
        System.out.println("Sum of first 20 natural numbers = "+sum);
    }
}
