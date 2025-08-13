import java.io.FileInputStream;
import java.io.FileOutputStream;
class demoFisCom
 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("demoFileOutputStream.txt");
        String str = "This is a test string for FileOutputStream.";
        byte bystr[]=str.getBytes();
        fout.write(bystr);
        fout.close();
        FileInputStream fin=new FileInputStream("demoFileOutputStream.txt");
        int i=0;
	    fin.skip(10);
	    while((i=fin.read())!=-1)
		System.out.print((char)i);
 
 }
}
        
     
