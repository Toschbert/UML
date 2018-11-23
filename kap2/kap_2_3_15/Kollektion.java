package kap_2_3_15;
import java.util.ArrayList;

/*
 * @author Christoph
 * @version 1.0
 * @created on 23.05.2004
 */


class Kollektion<T>
{
  protected ArrayList<T> inhalt;
  public Kollektion()
  {
    inhalt = new ArrayList<T>();
  }
  public void hinzufuegen(T elem)
  {
    inhalt.add(elem);
  }
  public void entfernen(T elem)
  {
    inhalt.remove(elem);
  }
  public void praesentieren()
  {
     for (T temp : inhalt)
      System.out.println(temp);
  }
}