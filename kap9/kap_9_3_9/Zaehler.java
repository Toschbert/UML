/*
 * @author Christoph
 * @version 1.0
 * @created on 04.07.2004
 */
package kap_9_3_9;

public class Zaehler extends Thread
{
  protected int zahl;
  
  public Zaehler(String name, int z)
  {
    super(name);
    zahl = z;
  }
  
  public void run() 
  {
    for (int i = 1; i <= zahl; i++) 
    {
      System.out.println(getName()+": " + i);
      try 
      {
          sleep(100);
      } 
      catch (InterruptedException e) {}
    }
  }
}
