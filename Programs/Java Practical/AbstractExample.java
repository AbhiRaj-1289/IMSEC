abstract class A
{
    void Hello()
    {
        System.out.println("I am Defined");
    }
    abstract void show();
}
public class AbstractExample extends A 
{
    void show()
    {
        System.out.println("I am abstract method");
    } 
    public static void main(String[] args) 
    {
      AbstractExample ae = new AbstractExample();
      ae.Hello();
      ae.show();    
    }
}
