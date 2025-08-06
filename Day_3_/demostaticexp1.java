class Example {
    int a = 5;            
    static int b = 10;    

   
    void show() {
        System.out.println("Instance variable a = " + a);
        System.out.println("Static variable b = " + b);
    }
    static void showStatic() {
        
        Example obj = new Example();
        System.out.println("Instance variable a = " + obj.a);
        System.out.println("Static variable b = " + b);
    }
}

public class demostaticexp1 {
    public static void main(String[] args) {
        Example obj1 = new Example();

        obj1.show();
        Example.showStatic();
    }
}
