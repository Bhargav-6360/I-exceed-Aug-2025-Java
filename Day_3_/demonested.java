class karnataka
{
   private String cm,capital;
   private double area_state;
 
    class mysuru
	{;
	   String collector_name;
	   int area_dist;
	    mysuru(String cm,String collector_name,int area_dist,String capital)
		{   
			this.collector_name=collector_name;			
			this.area_dist=area_dist;
		}
           public void displayMysuru()
		{
	       System.out.println(   "  Name of CM  "   +cm);
		   System.out.println("  Name of the collector  "+collector_name);
		   System.out.println("District area  "+area_dist);
		   System.out.println("Capital of Karnataka  "+capital);
		}

	   }
  }
 
class demonested
  {
     public static void main(String asd[])
	{
	    karnataka.mysuru my=new karnataka().new mysuru( "siddaramaiyya","dk ravi",54543543,"Bengaluru");
	     my.displayMysuru();
		 karnataka obj=new karnataka();
	}
}