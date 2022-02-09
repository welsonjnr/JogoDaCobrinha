import javax.swing.*;
import java.awt.*;

public class FrameJogo extends JFrame {

    public FrameJogo(){
        this.add(new PainelJogo());
        this.setTitle("Jogo da Cobrinha");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
