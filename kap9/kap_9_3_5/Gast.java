/*
 * @author Christoph
 * @version 1.0
 * @created on 08.07.2004
 */
package kap_9_3_5;

import java.util.Observable;

public class Gast extends Observable
{
  protected String name;
  
  public String getName()
  {
    return name;
  }
  
  public Gast(String n)
  {
    name = n;
  }
   
  public void notify(Object signal)
  {
    setChanged();
    notifyObservers(signal);
  }
  
  public void kellnerRufen()
  {
    notify("Kellner!");
  }
}
