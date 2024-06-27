import java.awt.*;

public class AWTExample {
    AWTExample() {
        Frame f = new Frame();
        Label l = new Label("Employee ID:");
        Button b = new Button("Submit");
        TextField tf = new TextField();
        
        l.setBounds(50, 50, 80, 30);
        tf.setBounds(150, 50, 150, 30);
        b.setBounds(150, 100, 80, 30);
        
        f.add(l);
        f.add(tf);
        f.add(b);
        
        f.setSize(400, 200);
        f.setTitle("Employee ID");
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String args[]) {
        AWTExample obj = new AWTExample();
    }
}
