import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener 
{
    private JTextField jtf;
    private JButton[] num_button = new JButton[10];
    private JButton add_bt, sub_bt, mul_bt, div_bt, equal_bt, del_bt, dec_bt, clr_bt;
    private JPanel jp;
    private String operator;
    private double num1, num2, result;

    public Calculator() 
    {
        setTitle("My Calculator");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        jtf = new JTextField();
        jtf.setBounds(50, 25, 300, 50);
        jtf.setFont(new Font("Arial", Font.BOLD, 20));
        jtf.setEditable(false);
        add(jtf);

        for (int i = 0; i < 10; i++) 
        {
            num_button[i] = new JButton(String.valueOf(i));
            num_button[i].setFont(new Font("Arial", Font.BOLD, 20));
            num_button[i].addActionListener(this);
            num_button[i].setFocusable(false);
        }

        add_bt = new JButton("+");
        sub_bt = new JButton("-");
        mul_bt = new JButton("x");
        div_bt = new JButton("/");
        equal_bt = new JButton("=");
        del_bt = new JButton("Del");
        dec_bt = new JButton(".");
        clr_bt = new JButton("Clear");

        add_bt.addActionListener(this);
        sub_bt.addActionListener(this);
        mul_bt.addActionListener(this);
        div_bt.addActionListener(this);
        equal_bt.addActionListener(this);
        del_bt.addActionListener(this);
        dec_bt.addActionListener(this);
        clr_bt.addActionListener(this);

        jp = new JPanel();
        jp.setBounds(50, 100, 300, 300);
        jp.setLayout(new GridLayout(4, 4));

        jp.add(num_button[1]);
        jp.add(num_button[2]);
        jp.add(num_button[3]);
        jp.add(add_bt);
        jp.add(num_button[4]);
        jp.add(num_button[5]);
        jp.add(num_button[6]);
        jp.add(sub_bt);
        jp.add(num_button[7]);
        jp.add(num_button[8]);
        jp.add(num_button[9]);
        jp.add(mul_bt);
        jp.add(dec_bt);
        jp.add(num_button[0]);
        jp.add(div_bt);
        jp.add(equal_bt);

        add(jp);

        del_bt.setBounds(40, 430, 145, 50);
        clr_bt.setBounds(205, 430, 145, 50);

        add(del_bt);
        add(clr_bt);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        for (int i = 0; i < 10; i++) 
        {
            if (e.getSource() == num_button[i]) 
            {
                jtf.setText(jtf.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == dec_bt) 
        {
            jtf.setText(jtf.getText().concat("."));
        }
        if (e.getSource() == add_bt) 
        {
            num1 = Double.parseDouble(jtf.getText());
            operator = "+";
            jtf.setText("");
        }
        if (e.getSource() == sub_bt) 
        {
            num1 = Double.parseDouble(jtf.getText());
            operator = "-";
            jtf.setText("");
        }
        if (e.getSource() == mul_bt) 
        {
            num1 = Double.parseDouble(jtf.getText());
            operator = "*";
            jtf.setText("");
        }
        if (e.getSource() == div_bt) 
        {
            num1 = Double.parseDouble(jtf.getText());
            operator = "/";
            jtf.setText("");
        }
        if (e.getSource() == equal_bt) 
        {
            num2 = Double.parseDouble(jtf.getText());
            switch (operator) 
            {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            jtf.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == clr_bt) 
        {
            jtf.setText("");
        }
        if (e.getSource() == del_bt) 
        {
            String s = jtf.getText();
            if (s.length() > 0) 
            {
                jtf.setText(s.substring(0, s.length() - 1));
            }
        }
    }

    public static void main(String[] args) 
    {
        new Calculator();
    }
}
//End Code