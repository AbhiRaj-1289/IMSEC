import java.util.Scanner;
interface Function
{
    void sum();
    void minus();
    void multiply();
    void divide();
}
class Calculator implements Function 
{
    Scanner input = new Scanner(System.in);
    public void sum()
    {
        System.out.print("Enter value of x : ");
        int x = input.nextInt();
        System.out.print("Enter value of y : ");
        int y = input.nextInt();
        System.out.println("x + y = "+(x+y));
    }
    public void minus()
    {
        System.out.print("Enter value of x : ");
        int x = input.nextInt();
        System.out.print("Enter value of y : ");
        int y = input.nextInt();
        System.out.println("x - y = "+(x-y));
    }
    public void multiply()
    {
        System.out.print("Enter value of x : ");
        int x = input.nextInt();
        System.out.print("Enter value of y : ");
        int y = input.nextInt();
        System.out.println("x * y = "+(x*y));
    }
    public void divide()
    {
        System.out.print("Enter value of x : ");
        int x = input.nextInt();
        System.out.print("Enter value of y : ");
        int y = input.nextInt();
        System.out.println("x / y = "+(x/y));
    }
    public static void main(String[] args) 
    {
        Calculator c = new Calculator();
        c.sum();
        c.minus();
        c.multiply();
        c.divide();    
    }
}
