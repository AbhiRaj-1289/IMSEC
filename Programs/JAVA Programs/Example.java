class A
{
    int i,j;
    void showij()
    {
        System.out.print("i and j : "+i+" , "+j);
    }
}
class B extends A
{
    int k;
    void showk()
    {
        System.out.print("k : "+k);
    }
    void sum()
    {
        System.out.println("i+j+k = "+(i+j+k));
    }
}
public class Example
{
    public static void main(String[] args) 
    {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of SuperOb : ");
        superOb.showij();
        System.out.println();
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of SubOb : ");
        subOb.showij();
        subOb.showk();
        System.out.println();  
        subOb.sum();
    }
}
