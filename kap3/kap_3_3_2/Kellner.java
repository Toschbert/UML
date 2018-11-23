
package kap_3_3_2;
/*
 * @author Christoph
 * @version 1.0
 * @created on 01.06.2004
 */
public class Kellner
{
  public Gast kunde;
  
  public void setGast(Gast g)
  {
    kunde = g;
    g.bedienung = this;
  }
}
