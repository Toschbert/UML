/*
 * @author Christoph
 * @version 1.0
 * @created on 11.08.2004
 */
package kap_11_3_4c;

class Kritisch extends Thread
{
  private String name;
  private static Konto konto;
  
  public Kritisch(String n)
  {
    konto = new Konto();
    konto.kontostand = 0;
    name = n;
  }
  
  public void incKontostand(int z)
  {
    while(z-- > 0)
    {
      synchronized(konto) //Kommentieren Sie diese Zeile aus, um einen unsynchronisierten Zugriff zu erhalten
      {
        System.out.println(name+": i = " + konto.kontostand);
      
        try
        {
          sleep(10);
        }
        catch(InterruptedException e){};
      
        konto.kontostand += 1;
        
        System.out.println(name+": i = " + konto.kontostand +"\n"); 
      }
    }
  }
  
  public void run()
  {
    incKontostand(5);
  }
}
