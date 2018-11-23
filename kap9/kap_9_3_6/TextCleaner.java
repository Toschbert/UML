/*
 * @author Christoph
 * @version 1.0
 * @created on 29.06.2004
 */
package kap_9_3_6;

public class TextCleaner
{
  String entferneLeerzeichen(String text)
  {
    text = text.replaceAll("[ ]+"," ");
    text = text.trim();
    return text;
  }
  
  String beginnGross(String text)
  {
    text = text.replaceFirst(text.substring(0,1),text.substring(0,1).toUpperCase());
    return text;
  }
  
  String beendeMitPunkt(String text)
  {
    text = text+".";
    return text;
  }
  
  String textSaeubern(String text)
  {
    if(text != null)
    {
    text = entferneLeerzeichen(text);
    text = beginnGross(text);
    text = beendeMitPunkt(text);
    }
    return text;
  }
  
  
  public static void main(String[] args)
  {
    String text = new String("  galileo     Computing    ");
    System.out.println("Vorher: "+text);
    
    TextCleaner tc = new TextCleaner();
    text = tc.textSaeubern(text);
    
    System.out.println("Nachher: "+text);
  }
}
