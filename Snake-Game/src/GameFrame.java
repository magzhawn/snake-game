import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame () {
        GamePanel gamePanel = new GamePanel();
        gamePanel.gameFrame = this;
        this.add(gamePanel);
        this.setTitle("Snake Game");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void exit () {
        this.dispose();
        this.setVisible(false);
        System.exit(0);
    }
}
