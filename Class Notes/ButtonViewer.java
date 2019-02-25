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
    private JButton buttonA;
    private JButton buttonB;

    private int clickCountA;
    private int clickCountB;

    public ButtonViewer()
    {
        this.clickCountA = 0;
        this.clickCountB = 0;

        // 1. define and setup the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();

        this.label = new JLabel("button A: " + this.clickCountA +
            "\nbutton B: " + this.clickCountB);
        this.panel.add(this.label);

        this.buttonA = new JButton("A");
        this.panel.add(this.buttonA);

        this.buttonB = new JButton("B");
        this.panel.add(this.buttonB);

        this.frame.add(this.panel);

        // 2. create listener object
        ActionListener listener = new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    label.setText("button " + event.getActionCommand() +
                        " was clicked");
                }
            };

        // 3. register listener object with component that generates events
        this.buttonA.addActionListener(listener);
        this.buttonB.addActionListener(listener);

        // configure the frame and show it
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == buttonA)
            {
                clickCountA++;
            }
            else if(event.getSource() == buttonB)
            {
                clickCountB++;
            }
            
            label.setText("button A: " + clickCountA +
                    "\nbutton B: " + clickCountB);
        }
    }
}
