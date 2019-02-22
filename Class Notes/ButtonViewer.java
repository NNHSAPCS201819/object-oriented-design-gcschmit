import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a description of class ButtonViewer here.
 *
 * @author gcschmit
 * @version 22 February 2019
 */
public class ButtonViewer
{
    private final int FRAME_WIDTH = 400;
    private final int FRAME_HEIGHT = 100;
    
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button;
    
    public ButtonViewer()
    {
        // 1. define and setup the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        this.label = new JLabel("click the button");
        this.panel.add(this.label);
        
        this.button = new JButton("A");
        this.panel.add(this.button);
        
        this.frame.add(this.panel);
        
        // 2. create listener object
        ClickListener listener = new ClickListener();
        
        // 3. register listener object with component that generates events
        this.button.addActionListener(listener);
        
        // configure the frame and show it
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}
