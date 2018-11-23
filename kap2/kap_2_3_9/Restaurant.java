package kap_2_3_9;
import java.util.ArrayList;

/*
 * @author Christoph
 * @version 1.0
 * @created on 19.05.2004
 */
class Restaurant
{
  public ArrayList stuhl;
  
  public Restaurant()
  {
    stuhl = new ArrayList();
  }
  public void addStuhl(Stuhl s)
  {
    stuhl.add(stuhl.size(), s);
  }
  public Stuhl removeStuhl()
  {
    return (Stuhl)stuhl.remove(stuhl.size()-1);
  }
  public static void main(String[] args)
  {
    Restaurant r = new Restaurant();
    Stuhl[] s = new Stuhl[10];
    for(int i = 0; i < 10; i++)
      s[i] = new Stuhl(i);
    for(int i = 0; i < 10; i++)
      r.addStuhl(s[i]);
    for(int i = 0; i < 10; i++)
    {
      s[i] = r.removeStuhl();
      System.out.println(s[i].stuhlNr);
    }
  }
}
