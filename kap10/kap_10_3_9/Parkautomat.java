/*
 * @author Christoph
 * @version 1.0
 * @created on 20.07.2004
 */
package kap_10_3_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;


class Parkautomat
{
  private final int RUHE 		 = 0;
  private final int BARZAHLUNG 	 = 1;
  private final int RUECKZAHLUNG = 2;
  private final int BELEGDRUCK   = 3;
  
  private int ZUSTAND;  
  private int betrag;
  
  private BufferedReader buffReader;
  
  public Parkautomat()
  {
  	buffReader = new BufferedReader(new InputStreamReader(System.in));
  }
    
  private Event getEvent()
  {
    String input=null;
    
    while(true)
    {
	  try
	  {
	    System.out.print("Event: ");
	    input = buffReader.readLine();
	  }
	  catch(Exception e)
	  {
	  	e.printStackTrace();
	  }
	    
	  switch(input.charAt(0))
	  {
	    case 'M':
	      switch(input.charAt(1))
	      {
	        case '1':
	        case '2':
	        case '5':
	          return new Event(input.charAt(0), input.charAt(1)-'0');
	        default:
	          break;
	      }
	      break;
	    case 'G': 
	    case 'R':
	      return new Event(input.charAt(0), 0);
	    default:
	      break;
	  }
    }
  }
  
  private int RUHE()
  {
    Event e;
    System.out.println("\nZustand: RUHE");
    
    betrag = 0;
    
    while(ZUSTAND == RUHE)
    {
      e = getEvent();
   
      switch (e.msg)
      {
        case 'M':
          betrag = betrag + e.value;
          return BARZAHLUNG;
        default:
          break;
      }
    }
    return RUHE;
  }
  
  private int BARZAHLUNG()
  {
    Event e;
    System.out.println("\nZustand: BARZAHLUNG");
    System.out.println("Betrag: "+betrag);
    
    while(ZUSTAND == BARZAHLUNG)
    {
      e = getEvent();
      
      switch (e.msg)
      {
        case 'M':
          betrag = betrag + e.value;
          return BARZAHLUNG;
        case 'G':
          return BELEGDRUCK;
        case 'R':
          return RUECKZAHLUNG;
        default:
          break;
      }
    }
    return RUHE;
  }
  
  private int BELEGDRUCK()
  {
    System.out.println("\nZustand: BELEGDRUCK");
    double parkzeit = ((float)betrag)/2.0;
    System.out.println("Parkzeit: "+parkzeit+" h");
    return RUHE;
  }
  
  private int RUECKZAHLUNG()
  {
    System.out.println("\nZustand: RUECKZAHLUNG");
    System.out.println("Rückzahlung: "+betrag);
    return RUHE;
  }
  
  public void start()
  {
    ZUSTAND = RUHE;
    
    while(true)
    {
      switch (ZUSTAND)
      {
        case RUHE:
          ZUSTAND = RUHE();
          break;
        case BARZAHLUNG:
          ZUSTAND = BARZAHLUNG();
          break;
        case BELEGDRUCK:
          ZUSTAND = BELEGDRUCK();
          break;
        case RUECKZAHLUNG:
          ZUSTAND = RUECKZAHLUNG();
          break;
        default:
          System.out.println("FEHLER");
          ZUSTAND = RUHE;
          break;
      }
    }
  }
}
