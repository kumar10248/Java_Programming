import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KingThiefSoldierMinisterGame extends JFrame implements ActionListener {

    private List<String> roles;
    private JButton[] playerButtons;
    private JLabel resultLabel;

    public KingThiefSoldierMinisterGame() {
        roles = new ArrayList<>();
        roles.add("King");
        roles.add("Thief");
        roles.add("Soldier");
        roles.add("Minister");

        Collections.shuffle(roles);

        setTitle("King, Thief, Soldier, Minister Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        initializeComponents();
        assignRoles();

        setVisible(true);
    }

    private void initializeComponents() {
        JPanel playersPanel = new JPanel(new GridLayout(1, roles.size()));
        playerButtons = new JButton[roles.size()];

        for (int i = 0; i < roles.size(); i++) {
            playerButtons[i] = new JButton("Player " + (i + 1));
            playerButtons[i].setFont(new Font("Arial", Font.PLAIN, 14));
            playerButtons[i].addActionListener(this);
            playersPanel.add(playerButtons[i]);
        }

        resultLabel = new JLabel("Make a guess!", JLabel.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));

        add(playersPanel, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);
    }

    private void assignRoles() {
        for (int i = 0; i < roles.size(); i++) {
            playerButtons[i].setEnabled(true);
        }
    }

    private void revealRoles() {
        for (int i = 0; i < roles.size(); i++) {
            playerButtons[i].setText("Player " + (i + 1) + ": " + roles.get(i));
            playerButtons[i].setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        int playerIndex = Integer.parseInt(clickedButton.getText().split(" ")[1]) - 1;

        if (roles.get(playerIndex).equals("Thief")) {
            resultLabel.setText("Congratulations, you caught the Thief! You win!");
        } else {
            resultLabel.setText("Oops! The suspected player is not the Thief. Game over.");
        }

        revealRoles();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KingThiefSoldierMinisterGame());
    }
}
