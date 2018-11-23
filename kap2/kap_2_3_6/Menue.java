package kap_2_3_6;

/*
 * @author Christoph
 * @version 1.0
 * @created on 29.05.2004
 */
class Menue
{
  public Vorspeise vorspeise;
  public Hauptgericht hauptgericht;
  public Dessert dessert;
  
  public Menue(Vorspeise v, Hauptgericht h, Dessert d)
  {
    vorspeise = v;
    hauptgericht = h;
    dessert = d;
  }
}
