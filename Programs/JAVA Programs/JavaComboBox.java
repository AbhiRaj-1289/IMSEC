import javax.swing.*;
public class JavaComboBox 
{
    JFrame jf;
    JavaComboBox()
    {
        jf = new JFrame("Combo Box Example");
        String country[] = {"India", "USA", "Russia","China"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50,50,100,20);
        jf.add(cb);
        jf.setLayout(null);
        jf.setSize(400,500);
        jf.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new JavaComboBox();
    }
}
