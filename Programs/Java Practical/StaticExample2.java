import java.util.Scanner;
class A
{
    Scanner input = new Scanner(System.in);
    static int a = 5;
    void show()
    {
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
    }
    static void change()
    {
        a = 10; 
    }
}
public class StaticExample2 extends A 
{
    public static void main(String[] args) 
    {
        StaticExample2 se = new StaticExample2();
        se.show();   
        se.change();
        se.show(); 
    }
}
