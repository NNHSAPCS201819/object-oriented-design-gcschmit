
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
