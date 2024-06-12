import java.util.Scanner;
public class Conversion 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        float celcius, fahrenheit;
        System.out.print("Enter degree Fahrenheit : ");
        fahrenheit = input.nextFloat();
        celcius = (fahrenheit - 32) * 5 / 9;
        System.out.print("Degree Celcius = "+celcius); 
    }    
}
