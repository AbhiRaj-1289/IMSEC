import java.util.Scanner;
public class Count 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String s;
        int count = 0;
        System.out.print("Enter any string : ");
        s = input.nextLine();
        for(int i = 0; s.charAt(i) != '\0' ; i++)
        {
            count++;
        }
        System.out.println("The nummber of character in "+s+" = "+count);    
    }
}
