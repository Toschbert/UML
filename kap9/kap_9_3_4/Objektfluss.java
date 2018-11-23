/*
 * @author Christoph
 * @version 1.0
 * @created on 27.06.2004
 */
package kap_9_3_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Objektfluss
{
  public Eingabe eingabeLesen()
  {
    Eingabe eing = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try
    {
      System.out.print("Eingabe: ");
      eing = new Eingabe(br.readLine());
    }
    catch(Exception e)
	{
    	System.out.println(e.getStackTrace());
    }
    return eing;
  }
  public void eingabeAusgeben(Eingabe eing)
  {
    System.out.println("Ausgabe: " +eing.e);
  }
  public static void main(String[] args)
  {
    Objektfluss o = new Objektfluss();
    Eingabe eing = o.eingabeLesen();
    o.eingabeAusgeben(eing);
  }
}
