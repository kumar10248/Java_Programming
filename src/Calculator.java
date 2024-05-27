import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator extends JFrame  implements ActionListener {
    JPanel p1;
    JButton[] funbutton = new JButton[8];
    JButton[] numbutton =new JButton[10];
    JTextField t1;
    JButton add,sub,mul,div,clr,del,dec,eq;
    Font font = new Font("Arial",Font.BOLD,25);
    double num1,num2,Result;
    char op;

    Calculator(){
        t1 = new JTextField();
        t1.setBounds(70,40,300,80);
        t1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        t1.setBackground(Color.white);
        t1.setHorizontalAlignment(SwingConstants.RIGHT);
        t1.setForeground(Color.black);
        t1.setFont(font);
        t1.setCaretColor(Color.GREEN);
        add =new JButton("+");
        sub =new JButton("-");
        mul =new JButton("x");
        div =new JButton("/");
        dec =new JButton(".");
        clr =new JButton("Clear");
        del =new JButton("Delete");
        eq =new JButton("=");
        funbutton[0]=add;
        funbutton[1]=sub;
        funbutton[2]=mul;
        funbutton[3]=div;
        funbutton[4]=dec;
        funbutton[5]=clr;
        funbutton[6]=del;
        funbutton[7]=eq;
        for(int i=0;i<7;i++){
            funbutton[i].addActionListener(this);
            funbutton[i].setFocusable(false);
            funbutton[i].setFont(font);
            funbutton[i].setForeground( Color.BLACK);
           // funbutton[i].setBackground(new Color(192,192,192));

            funbutton[i].setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

        }
        funbutton[7].addActionListener(this);
        funbutton[7].setFocusable(false);
        funbutton[7].setFont(font);
        funbutton[7].setForeground(Color.white);
        funbutton[7].setBackground(new Color(0Xff6a00));
        funbutton[7]. setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

for(int i=0;i<10;i++){
    numbutton[i]=new JButton(String.valueOf(i));
    numbutton[i].addActionListener(this);
    numbutton[i].setFocusable(false);
    numbutton[i].setFont(font);
    numbutton[i].setForeground(Color.black);
    numbutton[i].setBackground(new Color(220,220,220));
    numbutton[i].setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));


}

p1=new JPanel();
p1.setBounds(70,140,300,300);
p1.setLayout(new GridLayout(0,4,0,0));
p1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

p1.add(numbutton[1]);
        p1.add(numbutton[2]);
        p1.add(numbutton[3]);
        p1.add(add);
        p1.add(numbutton[4]);
        p1.add(numbutton[5]);
        p1.add(numbutton[6]);
        p1.add(sub);
        p1.add(numbutton[7]);
        p1.add(numbutton[8]);
        p1.add(numbutton[9]);
        p1.add(mul);
        p1.add(numbutton[0]);
        p1.add(dec);
        p1.add(eq);
        p1.add(div);


del.setBounds(70,470,120,50);
del.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        clr.setBounds(250,470,120,50);
        clr.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
add(del);
add(clr);
add(p1);
        add(t1);
        setTitle("My calculator");
        setSize(450,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(new Color(172,170,255));
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        ImageIcon image =new ImageIcon("C:\\Users\\kumar\\Contacts\\Desktop\\download.jpeg");
        setIconImage(image.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent e){
for(int i=0;i<10;i++){
    if(e.getSource()==numbutton[i]){
        t1.setText(t1.getText().concat(String.valueOf(i)));
    }
    }
        if(e.getSource()==dec){
            t1.setText(t1.getText().concat("."));
}
        if(e.getSource()==add){
            num1=Double.parseDouble(t1.getText());
            op='+';
            t1.setText("");

        }
        if(e.getSource()==sub){
            num1=Double.parseDouble(t1.getText());
            op='-';
            t1.setText("");

        }
        if(e.getSource()==mul){
            num1=Double.parseDouble(t1.getText());
            op='*';
            t1.setText("");

        }
        if(e.getSource()==div){
            num1=Double.parseDouble(t1.getText());
            op='/';
            t1.setText("");
        }
        if(e.getSource()==eq){
            num2=Double.parseDouble(t1.getText());

        switch (op){
            case '+':
                Result=num1+num2;
                break;
            case '-':
                Result=num1-num2;
                break;
            case '*':
                Result=num1*num2;
                break;
            case '/':
                if(num2!=0){
                    Result=num1/num2;
                }
                else {
                    JOptionPane.showMessageDialog(this,"You can't divide by Zero!","Error",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                break;

        }
        t1.setText(String.valueOf(Result));
        }
        if (e.getSource()==clr){
            t1.setText("");
        }
        if(e.getSource()==del){
String st=t1.getText();
t1.setText("");
for (int i=0;i<st.length()-1;i++){
    t1.setText(t1.getText()+st.charAt(i));
}
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}