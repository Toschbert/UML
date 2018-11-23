package kap_2_3_16;

/*
 * @author Christoph
 * @version 1.0
 * @created on 26.05.2004
 */
class Gericht implements Nahrung
{
  public String name;
  
  public Gericht(String n)
  {
    name = n;
  }

  public void wirdGegessen()
  {
    System.out.println("Gericht "+name+" wird gegessen");
  }
}
