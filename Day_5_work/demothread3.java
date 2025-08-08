class sample extends Thread
{ 
    Thread t=new Thread(this);
    public void run()
	{
	  t.setName("i-exceed thread");
	  System.out.println("Inside run method\t"+t.getName());
	}
}
 
 
class demothread3
{
    public static void main(String asd[])
	{
	 
	  System.out.println("Name in Main mathod\t"+Thread.currentThread().getName());
	  sample obj=new sample();
	  obj.start();
	} 
}
