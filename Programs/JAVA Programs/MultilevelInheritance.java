class A {
    public void Hi() 
    {
        System.out.println("This is Parent A class");
    }
}

class B extends A 
{
    public void Display() {
        System.out.println("This is Child B class");
    }
}

public class MultilevelInheritance extends B 
{
    void sum()
    {
        
    }
    public class C 
    {
        public void Hello() 
        {
            System.out.println("This Is Nested Child C class");
        }

        public static void main(String[] args) 
        {
            MultilevelInheritance m = new MultilevelInheritance();
            m.Display();
            m.Hi();
            C c = m.new C();
            c.Hello();
        }
    }
}
