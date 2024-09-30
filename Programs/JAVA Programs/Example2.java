class A
{
    int i;
    private int j;
}
class B extends A
{
    int k;
}

public class Example2 
{
    public static void main(String[] args) 
    {
        A a = new A();
        B b = new B();
        a.i =  10;
        a.j = 20;
        System.out.println("Sum = "+(a.i+a.j));
    }
}
