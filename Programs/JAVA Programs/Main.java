class A{
    void show()
    {
        System.out.print("hello");
    }
}
class B extends A
{
    void display()
    {
        System.out.print("Hi");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        A a = new A();
        a.display();
        //a.show();
    }
}