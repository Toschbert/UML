/*
 * @author Christoph
 * @version 1.0
 * @created on 03.07.2004
 */
package kap_9_3_8;

public class Multiplikation
{
  public int multipliziere(int multiplikator, int multiplikand)
  {
    int produkt = 0;
    
    int i = 0;
   
    while(i < Math.abs(multiplikand))
    {
      if(multiplikand >= 0)
        produkt = produkt + multiplikator;
      else
        produkt = produkt - multiplikator;
      
    i++;
    }
    
    return produkt;
  }
  
  public static void main(String[] args)
  {
    Multiplikation m = new Multiplikation();
    int produkt; 
    
    produkt = m.multipliziere(-10,20);
    System.out.println(produkt);
  }
}
