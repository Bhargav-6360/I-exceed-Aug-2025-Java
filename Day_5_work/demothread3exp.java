class DeliveryBoy extends Thread {
    public void run() {
        Thread.currentThread().setName("Zomato_Boy_1");
        System.out.println(" Delivery started by\t" + Thread.currentThread().getName());
    }
}

public class demothread3exp {
    public static void main(String[] args) {
        System.out.println("User logged in on\t" + Thread.currentThread().getName());

        DeliveryBoy db = new DeliveryBoy();  
        db.start();                          
    }
}
