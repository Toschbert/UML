
package kap_3_3_1;
/*
 * @author Christoph
 * @version 1.0
 * @created on 31.05.2004
 */
public class Gast
{
  public static String status = "König";
  private EUR geldbetrag;
  protected boolean hunger;
  
  public Gast(EUR g, boolean h)
  {
    geldbetrag = g;
    hunger = h;
  }
  public Gast(EUR g)
  {
    geldbetrag = g;
    hunger = true;
  }
}
