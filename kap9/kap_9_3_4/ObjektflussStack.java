/*
 * @author Christoph
 * @version 1.0
 * @created on 28.06.2004
 */
package kap_9_3_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ObjektflussStack
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
    catch(Exception e){}
    return eing;
  }
  public void eingabeAusgeben(Eingabe eing)
  {
    System.out.println("Ausgabe: " +eing.e);
  }
  public static void main(String[] args)
  {
    ObjektflussStack o = new ObjektflussStack();
    Eingabe eing = null;
    Stack s = new Stack();
    
    for(int i = 0; i < 5; i++)
    {
      eing = o.eingabeLesen();
      s.push(eing);
    }
    
    for(int i = 0; i < 5; i++)
    {
      o.eingabeAusgeben((Eingabe)s.pop());
    }
  }
}
