package za.ac.tut.newframe;
import java.awt.Color;
import javax.swing.JFrame;

public class NewFrame extends JFrame
{
    //contructor for the JFrame
    public NewFrame() 
    {
        setTitle("Kgodiso's Java Frame");
        setSize(200,250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.BLUE);
        setVisible(true);
    }
    
    
}
