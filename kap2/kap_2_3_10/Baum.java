package kap_2_3_10;
import java.util.ArrayList;

/*
 * @author Christoph
 * @version 1.0
 * @created on 20.05.2004
 */
class Baum
{
  private ArrayList bl;
  public Baum()
  {
    bl = new ArrayList();
  }
  public void addBlatt(int nr)
  {
    bl.add(new Blatt(nr));
    System.out.println(((Blatt)bl.get(bl.size()-1)).blattNr);
  }
  public Blatt getBlatt()
  {
    Blatt neuesBlatt = new Blatt(0);
    neuesBlatt.blattNr = ((Blatt)bl.get(bl.size()-1)).blattNr;
    return neuesBlatt;
  }
  public static void main(String[] args)
  {
    Baum b = new Baum();
    Blatt blatt;
    
    for(int i = 0; i < 20; i++)
      b.addBlatt(i);
    blatt = b.getBlatt();
    System.out.println(blatt.blattNr);
    
  }
}
