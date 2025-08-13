
import java.io.*;
class employee implements Serializable
{
    String empname,desig;
    int empid;
    double salary;
    employee(String empname, String desig, int empid, double salary)
     {
        this.empname = empname;
       this.desig = desig;
        this.empid = empid;
        this.salary = salary;
    }

}
class demoserialization
{
    public static void main(String[] args)throws Exception
    {
        employee e1=new employee("John Doe", "Software Engineer", 101, 75000.00);
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(new File("mydata.txt")));
        os.writeObject(e1);
        ObjectInputStream oi=new ObjectInputStream(new FileInputStream(new File("mydata.txt")));
	   employee e=(employee)oi.readObject();
	   System.out.println("Name of the employee\t"+e.empname);
       System.out.println("Employee code\t"+e.empid);
	   System.out.println("Designation\t"+e.desig);
	   System.out.println("Salary\t"+e.salary);
    }
}
        
    