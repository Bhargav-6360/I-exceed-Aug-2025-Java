class stringconcat

{

    public String concatstring()

	{

	  String str="Global";

	  for(var i=0;i<100000;i++)

		{

	  		str+="Warming";

		}

	  return str;

	}
 
    public String concatstringwithbuffer()

	{

	  StringBuffer sb=new StringBuffer("Global");

	  for(var i=0;i<100000;i++)

		{

	 		 sb.append("warming");

		}

	  return sb.toString();
 
	}	

}
 
class demostringtest

{

    public static void main(String asd[])

	{

	    stringconcat st=new stringconcat();

	    long stm=System.currentTimeMillis();

	    st.concatstring();

	    System.out.println(System.currentTimeMillis()-stm);

            long stmb=System.currentTimeMillis();

	    st.concatstringwithbuffer();

	    System.out.println(System.currentTimeMillis()-stmb);



	}

}

 