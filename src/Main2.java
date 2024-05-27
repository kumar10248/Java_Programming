import java.applet.*;
import java.awt.*;
public class Main2 extends Applet{
    /*
    <applet code = "Myapp.java" height=500 width=500>
    <\applet>
     */
    public void init(){
        Label l1= new Label("Name");
        TextField tb1 = new TextField();
        Label l2= new Label("Gender");
        Label l3= new Label("E-mail");
        Label l4= new Label("subject");
        Label l5= new Label("password");
        TextField tb2 = new TextField();
        TextField tb5 = new TextField();
        TextField tb3 = new TextField();
        TextField tb4 = new TextField();
        Button b1 = new Button("Submit");
        setLayout(null);
        l1.setBounds(20,50,100,20);
        tb1.setBounds(130, 50, 100, 20);
        l2.setBounds(20,90,100,20);
        tb2.setBounds(130, 90, 100, 20);
        l3.setBounds(20,130,100,20);
        tb3.setBounds(130, 130, 100, 20);
        l4.setBounds(20,170,100,20);
        tb4.setBounds(130, 170, 100, 20);
        l5.setBounds(20,210,100,20);
        tb5.setBounds(130, 210, 100, 20);
        b1.setBounds(50,240,100,20);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(tb5);
        add(tb2);
        add(tb3);
        add(tb4);
        add(tb1);
        add(b1);
    }
    public static void main(String[] args) {
        Main2 app = new Main2();
        app.init();
        Frame frame = new Frame("Registration form");
        frame.add(app);
        frame.setSize(400,300);
        frame.setVisible(true);
    }


}