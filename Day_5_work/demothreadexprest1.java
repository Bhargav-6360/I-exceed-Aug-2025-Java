class Waiter extends Thread {
    public void run() {
        System.out.println("Waiter is taking the order");
    }
}

public class demothreadexprest1 {
    public static void main(String[] args) {
        Waiter w = new Waiter();  
        w.start();                

        System.out.println("Customer is browsing menu"); 
    }
}

