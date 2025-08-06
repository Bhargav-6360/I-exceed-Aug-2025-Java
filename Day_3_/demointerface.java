interface one

{

    public void methodfromone();
 
}
 
interface two extends one

{

    public void methodfromtwo();

}
 
class sample implements two

  {
   
     sample()

	{
		System.out.println("sample implements from interface1 and interface2");
	}

    @Override

     public void methodfromone(){

	 System.out.println("it came from interface one");

	}
 
    @Override

     public void methodfromtwo(){

	System.out.println("it came from interface two");

	}

}
 
class demointerface

{

    public static void main(String asd[])

	{
	
	   sample obj=new sample();
	   
	   obj.methodfromone();

	   obj.methodfromtwo();	

	}

}
 
