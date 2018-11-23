package kap_9_3_5;
import java.util.Observable;
import java.util.Observer;
/*
 * @author Christoph
 * @version 1.0
 * @created on 08.07.2004
 */
public class Kellner implements Observer
{
  protected String name;
  
  public String getName()
  {
    return name;
  }
  
  public Kellner(String n)
  {
    name = n;
  }
  
  public void update(Observable subject, Object signal)
  {
    System.out.println(((Gast)subject).getName()+" => "+name+": "+signal);
  }
}
