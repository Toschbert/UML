package kap_2_3_14;
/*
 * @author Christoph
 * @version 1.0
 * @created on 15.05.2004
 */

abstract class Mitarbeiter
{
  protected int persAusweisNr;
  protected int gehalt;

  public Mitarbeiter(int paNr)
  {
    persAusweisNr = paNr;
    gehalt = 1500;
  }
  public abstract void arbeiten();
}

