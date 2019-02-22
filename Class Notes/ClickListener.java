import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * An action listener that prints a message.
 *
 * @author gcschmit
 * @version 22 February 2019
 */
public class ClickListener implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("button was clicked!");
    }
}