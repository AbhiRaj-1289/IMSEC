import javax.swing.*;
public class Sample2 extends JFrame 
{
    Sample2()
    {
        setSize(300,400);
        setTitle("My Frame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        Sample2 s=new Sample2();
    }
}
