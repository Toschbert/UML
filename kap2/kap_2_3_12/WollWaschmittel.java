package kap_2_3_12;

/*
 * @author Christoph
 * @version 1.0
 * @created on 22.05.2004
 */
class WollWaschmittel extends Waschmittel
{
  /* (non-Javadoc)
   * @see Waschmittel#reinigen()
   */
  public void reinigen()
  {
    super.reinigen();
    System.out.println("Reinigung durch WollWaschmittel");
  }
  
  public void wollePflegen()
  {
    System.out.println("Woll-Pflege durch WollWaschmittel");
  }
}
