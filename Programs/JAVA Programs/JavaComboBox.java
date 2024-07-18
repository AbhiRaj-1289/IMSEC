import javax.swing.*;
public class JavaComboBox 
{
    JFrame jf;
    JavaComboBox()
    {
        jf = new JFrame("Combo Box Example");
        String country[] = {"India", "USA", "Russia","China"};
        JComboBox cb = new JComboBox(country);
        String capital[] = {"Delhi","Washington D.C.","Moscow","Beijing"};
        JComboBox cb1 = new JComboBox(capital);
        cb.setBounds(50,50,100,20);
        cb1.setBounds(50,100,100,20);
        jf.add(cb);
        jf.add(cb1);
        jf.setLayout(null);
        jf.setSize(400,500);
        jf.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new JavaComboBox();
    }
}
