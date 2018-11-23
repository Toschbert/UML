package kap_2_3_3;

  public class Gast
  {
    public static final double MIN = 200.0;
    public static String status = "König";
    private double geldbetrag;
    boolean hunger;
    protected String[] freunde;
    public char[] alphabet;
    public boolean freundeEinladen() {
        return geldbetrag > MIN;
    };
    
    public Gast() {
      freunde = new String[10];
      alphabet = new char[26];
      hunger = true;
      freunde[0] = new String();
      for (int i = 0; i < 26; i++)
        alphabet[i] = (char) ('a' + i);
    }
 
	
    public void setGeldbetrag(double geldbetrag) 
    {
      if(geldbetrag > 0)
        this.geldbetrag = geldbetrag;
    }

    public double getGeldbetrag()
    {
      return this.geldbetrag;
    }

    public static String getMINAsString()
    {
      return  "Mindestgeldbetrag: " + MIN;
    }

    public void setFreund(final String freund, int pos)
    {
      if(pos <= 9 && pos >= 0)
        freunde[pos] = freund;
    }

    protected void getBesterFreund(StringBuffer freund)
    {
      freund.append(freunde[0]);
    }

    public String[] getFreunde()
    {
      return freunde;
    }

    public String getAlphabet(int start, int end)
    {
      StringBuffer temp = new StringBuffer();
      for(int i=start-1; i<alphabet.length && i<end; i++)
        temp.append(alphabet[i]);
      return temp.toString();
    }

    public Gericht bestellt(Menuepunkt menuepunkt)
    {
      Koch koch = new Koch();
      Gericht gericht = koch.kocht(menuepunkt);
      return gericht;
    }

    public Gericht bestellt(int nummer)
    {
      Menuepunkt menuepunkt = new Menuepunkt(nummer);
      Koch koch = new Koch();
      Gericht gericht = koch.kocht(menuepunkt);
      return gericht;
    }

    public double zahlt(double d)
    {
      return 0.0;  
    }
  }
