/*
 * @author Christoph
 * @version 1.0
 * @created on 11.08.2004
 */
package kap_11_3_4c;

public class Test
{
  public static void main(String[] args)
  {
    Kritisch k1 = new Kritisch("Thread 1");
    Kritisch k2 = new Kritisch("Thread 2");
    
    k1.start();
    k2.start();
  }
}
