package kap_4_3_2;

public class SatReceiver
{
  private String signalSender1;
  private String signalSender2;
  private String getSignalSender1()
  {
    return signalSender1;
  }
  private String getSignalSender2()
  {
  	return signalSender2;
  }
  
  public class ScartPort implements Fernsehsignal
  {
    public String getFernsehsignal(String sender)
    {
      if(sender.compareTo("sender1") == 0)
        return getSignalSender1();
      if(sender.compareTo("sender2") == 0)
        return signalSender2;
      return "Schnee";
    }
  }
  public ScartPort scartanschluss;
  
  public SatReceiver()
  {
	  signalSender1 = new String("Fernsehsignal von Sender1");
	  signalSender2 = new String("Fernsehsignal von Sender2");
	  scartanschluss = new ScartPort();
  }
}
