class demothread7 
   {
      public static void main(String asd[])	
	{
		new Thread(){
			public void run()
				{
				  for(var i=0;i<10;i++)
					{
					  System.out.println(i);
					}
				}
		}.start();
 
 
			  
	}
}