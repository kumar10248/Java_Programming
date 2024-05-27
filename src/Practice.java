import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice extends JFrame {
    Practice() {
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Sweets");
        menu.setBounds(0, 0, 50, 30);
        menu.setBackground(Color.green);

        JMenuItem[] items = new JMenuItem[6];
        items[1] = new JMenuItem("Rasgulla");
        items[2] = new JMenuItem("GulabJamun");
        items[3] = new JMenuItem("Soan Papdi");
        items[4] = new JMenuItem("Peda");

        // Adding a submenu
        JMenu submenu = new JMenu("Special Sweets");
        items[5] = new JMenuItem("Ras Malai");
        submenu.add(items[5]);

        menu.add(items[1]);
        menu.add(items[2]);
        menu.add(items[3]);
        menu.add(items[4]);
        menu.add(submenu); // Add the submenu to the main menu

        mb.add(menu);
        setJMenuBar(mb);

        // ActionListener for menu items
        for (JMenuItem item : items) {
            if (item != null) {
                item.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(Practice.this, "Selected: " + item.getText());
                    }
                });
            }
        }
        setTitle("List");
        setVisible(true);
        setSize(300, 500);
      setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Practice();
    }
}
