import java.awt.*;
public class AWTExample2 
{
    AWTExample2()
    {
        Frame f = new Frame();
        Label l1 = new Label("Name:");
        Label l2 = new Label("Roll No:");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        Button b = new Button("Submit");

        l1.setBounds(50, 50, 80, 30);
        l2.setBounds(50, 100, 80, 30);
        t1.setBounds(150, 50, 150, 30);
        t2.setBounds(150, 100, 150, 30);
        b.setBounds(150, 150, 80, 30);

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b);

        f.setSize(400, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("Student");
    }
    public static void main(String args[])
    {
        AWTExample2 a = new AWTExample2();
    }
}
