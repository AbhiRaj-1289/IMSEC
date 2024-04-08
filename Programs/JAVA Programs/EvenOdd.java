import java.util.Scanner;
class EvenOdd
{
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in)) 
        {
            int num;
            System.out.print("Enter a Number : ");
            num = input.nextInt();
            if(num % 2 == 0) 
            {
                System.out.println("The Number is Even");
            }
            else
            {
                System.out.println("The Number is Odd");
            }
        }    
    }
}