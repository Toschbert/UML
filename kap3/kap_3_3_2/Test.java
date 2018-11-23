/*
 * @author Christoph
 * @version 1.0
 * @created on 14.08.2004
 */
package kap_3_3_2;

public class Test
{
  public static void main(String[] args)
  {
    Gast maren = new Gast();
    Kellner mathias = new Kellner();
    
    maren.setKellner(mathias);
    //mathias.setGast(maren);
  }
}
