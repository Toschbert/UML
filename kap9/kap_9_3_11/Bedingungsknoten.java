/*
 * @author Christoph
 * @version 1.0
 * @created on 11.07.2004
 */
package kap_9_3_11;


public class Bedingungsknoten
{
  public static void main(String[] args)
  {
    int zahl = 2;
    
    switch(zahl)
    {
      case 1:
        System.out.println("Ausgabe: Eins");
        break;
      case 2:
        System.out.println("Ausgabe: Zwei");
        break;
      case 3:
        System.out.println("Ausgabe: Drei");
        break;
      default:
        System.out.println("Ausgabe: Unbekannte Zahl");
        break;
    }
  }
}
