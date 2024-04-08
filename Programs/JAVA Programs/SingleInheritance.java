class A
{
    public void A()
    {
        System.out.println("This is Parent class");
    }
}
public class SingleInheritance extends A 
{
    public void B()
    {
        System.out.println("This is child class");
    }
    public static void main(String[] args) 
    {
        SingleInheritance s = new SingleInheritance();
        s.A();  
        s.B();  
    }
}
