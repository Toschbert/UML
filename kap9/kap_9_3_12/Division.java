/*
 * @author Christoph
 * @version 1.0
 * @created on 11.07.2004
 */
package kap_9_3_12;

public class Division
{
  
  public double dividiere(double zaehler, double nenner) throws Exception
  {
    if(nenner == 0)
      throw new Exception("Nenner ist gleich 0");
    
    return zaehler/nenner;
  }
}
