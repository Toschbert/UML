package kap_2_3_2;

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
  }
