public class demothread7exp {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                for (int floor = 0; floor < 10; floor++) {
                    System.out.println("Elevator at Floor: " + floor);
                    try {
                        Thread.sleep(500);  
                    } catch (InterruptedException e) {
                        System.out.println("Elevator stopped!");
                    }
                }
            }
        }.start();

        System.out.println("Building is active. Elevator running...");
    }
}
