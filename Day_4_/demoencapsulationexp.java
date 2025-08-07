class Employee {
   
    private String name;
    private double salary;


    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setSalary(double s) {
        if (s > 0) {
            salary = s;
        } else {
            System.out.println("Invalid salary.");
        }
    }
    public double getSalary() {
        return salary;
    }
}
public class demoencapsulationexp {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setName("Bhargav");
        emp.setSalary(25000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: ₹" + emp.getSalary());
        emp.setSalary(-5000);  
    }
}

