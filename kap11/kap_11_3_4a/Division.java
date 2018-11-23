/*
 * @author Christoph
 * @version 1.0
 * @created on 10.08.2004
 */
package kap_11_3_4a;

class Division
{
  public int dividiere(int zaehler, int nenner)
  {
    assert nenner != 0 : "Nenner darf nicht 0 sein";
    return zaehler/nenner;
  }
  public static void main(String[] args)
  {
    Division d = new Division();
    System.out.println("4 : 2 = "+d.dividiere(4,2));
    System.out.println("4 : 0 = "+d.dividiere(4,0));
  }
}
