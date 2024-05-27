import javax.swing.*;
import java.awt.*;
import java.applet.Applet;
public class Mst extends Applet {
    TextField t1, t2, t3, t4, t5;
    public void init() {
        Label l1 = new Label("Name");
        Label l2 = new Label("Gender");
        Label l3 = new Label("Email Address");
        Label l4 = new Label("Subject");
        Label l5 = new Label("Password");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t4 = new TextField();
        t5 = new TextField();
        Button submitButton = new Button("Submit");
        setLayout(null);
        l1.setBounds(20, 50, 100, 20);
        t1.setBounds(130, 50, 150, 20);
        l2.setBounds(20, 80, 100, 20);
        t2.setBounds(130, 80, 150, 20);
        l3.setBounds(20, 110, 100, 20);
        t3.setBounds(130, 110, 150, 20);
        l4.setBounds(20, 140, 100, 20);
        t4.setBounds(130, 140, 150, 20);
        l5.setBounds(20, 170, 100, 20);
        t5.setBounds(130, 170, 150, 20);
        submitButton.setBounds(130, 200, 100, 30);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(submitButton);
    }
    public static void main(String[] args) {
        Mst rF = new Mst();
        rF.init();
        Frame frame = new Frame("Registration form");
        frame.add(rF);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
