/*
 * @author Christoph
 * @version 1.0
 * @created on 04.07.2004
 */
package kap_9_3_9;

public class Aktivitaet
{
  public static void main(String[] args)
  {
    System.out.println("Zählen beginnt");
    
    Zaehler z1 = new Zaehler("Thread A", 3);
    Zaehler z2 = new Zaehler("Thread B", 6);
    z1.start();
    z2.start();
    
    while(z1.isAlive() && z2.isAlive())
    {      
      try
      {
        Thread.sleep(1000);
      } 
      catch (InterruptedException e){}
    }
    
    System.out.println("Zählen beendet");
  }
}
