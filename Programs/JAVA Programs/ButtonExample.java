import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample {
    public static void main(String[] args) {
        Frame f = new Frame("Button Example");
        final TextField tf = new TextField();
        tf.setBounds(50, 50, 120, 30);
        
        Button b = new Button("Click Here");
        b.setBounds(50, 150, 100, 30);
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to IMSEC");
            }
        });
        
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
