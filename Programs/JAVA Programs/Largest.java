import java.util.Scanner;
public class Largest
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three values : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a > b && a > c) 
        {
            System.out.println("Greatest = "+b);
        }
        else if(b > c && b > a)
        {
            System.out.println("Greatest = "+b);
        }
        else
        {
            System.out.println("Greatest = "+c);
        }
    }
}