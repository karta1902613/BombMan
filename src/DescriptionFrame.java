import javax.swing.*;
import java.awt.*;

public class DescriptionFrame extends JFrame {
    private Container cp ;
    private JLabel jlb = new JLabel();
    private ImageIcon img = new ImageIcon("KeyBoard.png");
    public DescriptionFrame(){
        init();
    }
    private void init(){
        this.setResizable(false);
        this.setTitle("遊戲說明");
        this.setBounds(300,300,977,520);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(1,1));
        cp.add(jlb,BorderLayout.CENTER);
        jlb.setIcon(img);

    }
}
