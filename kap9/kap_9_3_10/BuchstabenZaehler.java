/*
 * @author Christoph
 * @version 1.0
 * @created on 05.07.2004
 */
package kap_9_3_10;

public class BuchstabenZaehler
{
  public void zaehleBuchstaben(String text)
  {
    int klein, gross, i;
  
    for(klein = gross = i = 0; 
        i < text.length();
        i++ )
    {
      if(Character.isUpperCase(text.charAt(i)))
        gross++;
      else
        klein++;
    }
    
    System.out.println("Grossbuchstaben: "+gross);
    System.out.println("Kleinbuchstaben: "+klein);
  }
  
  public static void main(String[] args)
  {
    BuchstabenZaehler b = new BuchstabenZaehler();
    
    b.zaehleBuchstaben("GalileoComputing");
  }
}
