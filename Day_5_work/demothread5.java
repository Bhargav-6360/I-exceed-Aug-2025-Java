class sample extends Thread

{

     Thread t=new Thread(this);

     public void run()

	{

	   for(var i=0;i<10;i++)

		{

		    try{

			System.out.println(i);

			t.sleep(1000);

			}catch(InterruptedException d){}

		}

	}

}
 
 
class demothread5

{

    public static void main(String asd[]) throws InterruptedException

	{

	     sample obj1=new sample();

	     sample obj2=new sample();

	     sample obj3=new sample();
 
	     obj1.start();

             obj1.join();

	     obj2.start();

	     obj2.join();
 
	     obj3.start();

 
	}

}
 