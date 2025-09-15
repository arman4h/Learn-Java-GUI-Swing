import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setTitle("First Java App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(720, 720) ;

        this.setVisible(true); // Make frame visible

        ImageIcon image = new ImageIcon("src/favicon.png") ;
        this.setIconImage(image.getImage()); // change the icon of the frmae
        //frame.getContentPane().setBackground(Color.green); //change the background color
        this.getContentPane().setBackground(new Color(123,50,250)); // custom color
    }
}
