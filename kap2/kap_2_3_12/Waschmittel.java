package kap_2_3_12;
import java.util.ArrayList;

/*
 * @author Christoph
 * @version 1.0
 * @created on 22.05.2004
 */
class Waschmittel
{
  public String farbe;
  protected int pulvergroesse;
  private ArrayList bestandteil;
  
  public Waschmittel()
  {
    farbe = new String("Weiss");
    pulvergroesse = 3;
    bestandteil = new ArrayList(10);
    bestandteil.add("Waschpulver");
  }
  
  public void reinigen()
  {
    System.out.println("Reinigung durch Waschmittel");
  }
}
