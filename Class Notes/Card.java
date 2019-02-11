/**
 * Card base class.
 *
 * @author gcschmit
 * @version 11 February 2019
 */
public abstract class Card
{
   private String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public abstract boolean isExpired();

   public String toString()
   {
      return "Card holder: " + name;
   }
}
