/*
 * @author Christoph
 * @version 1.0
 * @created on 14.08.2004
 */
package kap_2_3_15;

public class Test
{
  public static void main(String[] args)
  {
    Schmuckstueck s1 = new Schmuckstueck("Ohrring");
    Schmuckstueck s2 = new Schmuckstueck("Halskette");
    Schmuckstueck s3 = new Schmuckstueck("Diamant-Ring");
  
    Kollektion<Schmuckstueck> schmuckKollektion= new Kollektion<Schmuckstueck>();
  
    schmuckKollektion.hinzufuegen(s1);
    schmuckKollektion.hinzufuegen(s2);
    schmuckKollektion.hinzufuegen(s3);
  
    schmuckKollektion.praesentieren();
  }  
}
