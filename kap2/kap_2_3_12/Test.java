/*
 * @author Christoph
 * @version 1.0
 * @created on 14.08.2004
 */
package kap_2_3_12;

public class Test
{
  public static void main(String[] args)
  {
    System.out.println("ColorWaschmittel:");
    ColorWaschmittel cw = new ColorWaschmittel();
    System.out.println(cw.colorpflege);
    System.out.println("Pulvergroesse: "+cw.pulvergroesse);
    cw.reinigen();
    System.out.println();
    
    System.out.println("WollWaschmittel:");
    WollWaschmittel ww = new WollWaschmittel();
    System.out.println("Farbe: "+ww.farbe);
    ww.wollePflegen();
    ww.reinigen();
  }
}
