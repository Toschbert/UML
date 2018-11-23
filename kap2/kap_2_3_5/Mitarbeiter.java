package kap_2_3_5;
/*
 * @author Christoph
 * @version 1.0
 * @created on 16.05.2004
 */
class Mitarbeiter
{
  public Mitarbeiter vorgesetzter;
  public Mitarbeiter[] unterstellter;
  
  public static void main(String[] args)
  {
    Mitarbeiter m = new Mitarbeiter();
    m.vorgesetzter = new Mitarbeiter();
    m.unterstellter = new Mitarbeiter[10];
    for(int i = 0; i < 10; i++)
      m.unterstellter[i] = new Mitarbeiter();
  }
}
