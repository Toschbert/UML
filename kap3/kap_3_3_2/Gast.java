package kap_3_3_2;

/*
 * @author Christoph
 * @version 1.0
 * @created on 01.06.2004
 */
public class Gast
{
  public Kellner bedienung;
  
  public void setKellner(Kellner k)
  {
    bedienung = k;
    k.kunde = this;
  }
}
