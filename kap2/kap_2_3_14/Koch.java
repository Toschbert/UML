package kap_2_3_14;

/*
 * @author Christoph
 * @version 1.0
 * @created on 22.05.2004
 */
class Koch extends Mitarbeiter
{ 
  public Koch(int paNr)
  {
  	super(paNr);
  }
  public void arbeiten()
  {
    System.out.println("Ich arbeite");
  }
  public static void main(String[] args)
  {
    Koch k = new Koch(12345);
    System.out.println(k.persAusweisNr);
    System.out.println(k.gehalt);
    k.arbeiten();
  }
}
