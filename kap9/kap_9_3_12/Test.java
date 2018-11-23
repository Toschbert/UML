/*
 * @author Christoph
 * @version 1.0
 * @created on 17.08.2004
 */
package kap_9_3_12;

public class Test
{
  public static void main(String[] args)
  {
    Division d = new Division();
    double zaehler, nenner, quotient;
    
    try
    {
      while(true)
      {
        zaehler = Math.round(Math.random());
        nenner = Math.round(Math.random());
        
        System.out.print(zaehler+" / "+nenner+" = ");
        
        quotient = d.dividiere(zaehler, nenner);
        System.out.println(quotient);
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
