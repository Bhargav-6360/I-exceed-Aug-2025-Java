class sample extends Thread
{
   sample()
	{
	   new Thread(this).start();
	}
    public void run()
	{
	   System.out.println("Inside the run method");
	}
}
 
 
class demothread2
{
    public static void main(String asd[])
	{
	 sample obj1=new sample();
	 sample obj2=new sample();
	 obj1.start();
	 obj2.start();
	}
}