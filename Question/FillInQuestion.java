import java.util.Scanner;

/**
 * A FillInQuestion is constructed with a string that contains the
 *      answer surrounded by '_'. For example, "The inventor of
 *      Java is _James Gosling_." The question should be displayed
 *      as: The inventor of Java is _____.
 *
 * @author gcschmit
 * @version 6 February 2019
 */

/*
 * The FillInQuestion class extends (i.e., is a subclass of) the
 *      Question class.
 */
public class FillInQuestion extends Question
{
    /**
     * This method overrides the setText method in the Question class.
     * 
     * Sets the question text and the answer.
     * 
     * @param   questionText    the text of the question including
     *                          the answer
     */
    /*
     * Use the @Override annotation when overriding a method to
     *      help the compiler verify that you are overriding and
     *      not overloading.
     */
    @Override
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        this.text = question;
        this.answer = answer;
    }
}
