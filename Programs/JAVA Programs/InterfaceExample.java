interface Inter
{
    void show();
    //void display();
}
public class InterfaceExample implements Inter
{
    public void show()
    {
        System.out.println("This is a defined method.");
    }    
    public static void main(String[] args) 
    {
        InterfaceExample ie = new InterfaceExample();
        ie.show();    
    }
}
