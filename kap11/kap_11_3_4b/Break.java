/*
 * @author Christoph
 * @version 1.0
 * @created on 27.02.2011
 */
package kap_11_3_4b;

class Break
{
  public static void main(String[] args)
  {
    for (int i = 0; ; i++)
    {
      System.out.println(i);

      if(i >= 10)
        break;
    }
  }
}
