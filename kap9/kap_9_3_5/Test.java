/*
 * @author Christoph
 * @version 1.0
 * @created on 08.07.2004
 */
package kap_9_3_5;

public class Test
{
  public static void main(String[] args)
  {
    Kellner kellner1 = new Kellner("Kellner1");
    Kellner kellner2 = new Kellner("Kellner2");
    Gast gast1 = new Gast("Gast1");
    Gast gast2 = new Gast("Gast2");
    
    gast1.addObserver(kellner1);
    gast1.addObserver(kellner2);
    
    gast2.addObserver(kellner2);
    
    gast1.kellnerRufen();
    gast2.kellnerRufen();
  }
}
