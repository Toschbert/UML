package kap_2_3_4;
 
/*
 * @author Christoph
 * @version 1.0
 * @created on 16.05.2004
 */
class Restaurant
{
  	public Gast[] kunde;
  	
  	public Restaurant()
  	{
  	  kunde = new Gast[50];
  	}
  	
  	public static void main(String[] args)
  	{
  	  Restaurant r = new Restaurant();
  	  Gast g = new Gast(r);
  	}
}
