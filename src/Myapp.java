import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myapp extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JButton b1, b2, b3, b4, b5;
    JTextField t1, t2, t3;

    Myapp() {

        l1 = new JLabel("First number");
        l2 = new JLabel("Second number");
        l3 = new JLabel("Result");
        l1.setForeground(Color.white);
        l2.setForeground(Color.white);
        l3.setForeground(Color.white);
        l1.setFont(new Font("Consolas",Font.BOLD,14));
        l2.setFont(new Font("Consolas",Font.BOLD,13));
        l3.setFont(new Font("Consolas",Font.BOLD,15));
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t1.setBackground(Color.black);
        t2.setBackground(Color.black);
        t3.setBackground(Color.black);
        t1.setForeground(Color.green);
        t2.setForeground(Color.green);
        t3.setForeground(Color.green);
        t1.setFont(new Font("Consolas",Font.PLAIN,15));
        t2.setFont(new Font("Consolas",Font.PLAIN,15));
        t3.setFont(new Font("Consolas",Font.PLAIN,15));
        t1.setCaretColor(Color.white);
        t2.setCaretColor(Color.white);
        t2.setForeground(Color.green);
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("x");
        b4 = new JButton("/");
        b5 = new JButton("Clr");
b1.setForeground(Color.ORANGE);
        b2.setForeground(Color.ORANGE);
        b3.setForeground(Color.ORANGE);
        b4.setForeground(Color.ORANGE);
        b5.setForeground(Color.ORANGE);
        b1.setBackground(Color.BLACK);
        b2.setBackground(Color.BLACK);
        b3.setBackground(Color.BLACK);
        b4.setBackground(Color.BLACK);
        b5.setBackground(Color.BLACK);

        setLayout(null);

        l1.setBounds(10, 15, 100, 20);
        t1.setBounds(180, 15, 150, 20);
        l2.setBounds(10, 40, 100, 20);
        t2.setBounds(180, 40, 150, 20);

        b1.setBounds(35,  65, 50, 30);
        b2.setBounds(100, 65, 40, 30);
        b3.setBounds(150, 65, 40, 30);
        b4.setBounds(200, 65, 40, 30);
        b5.setBounds(250, 65, 55, 30);

        l3.setBounds(10, 100, 100, 20);
        t3.setBounds(120, 100, 150, 20);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        setTitle("My Calculator!");
        setSize(360, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        ImageIcon image =new ImageIcon("C:\\Users\\kumar\\Contacts\\Desktop\\download.jpeg");
        setIconImage(image.getImage());
        getContentPane().setBackground(Color.black);
        //getContentPane().setBackground(new Color(255,250,250));

    }

    public void actionPerformed(ActionEvent e) {
        int a, b,result;
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());

        if (e.getSource() == b1) {
            result = a + b;
        } else if (e.getSource() == b2) {
            result = a - b;
        } else if (e.getSource() == b3) {
            result = a * b;
        } else  {

            if (b != 0) {
                result = a / b;
            } else {
                JOptionPane.showMessageDialog(this,"You can't divide by Zero!","Error",JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        t3.setText(String.valueOf(result));
        if (e.getSource() == b5) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String[] args) {

        new Myapp();
    }
}