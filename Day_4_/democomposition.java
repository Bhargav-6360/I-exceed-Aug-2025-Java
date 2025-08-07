class car
{
   int speed;
   final  String color;
   engine eng;

    public car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public void display() {
        System.out.println("Car Speed: " + speed + " km/h, Color: " + color);
    }
}
class engine
{
   private int horsepower;

    public engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public void display() {
        
        System.out.println("Engine Horsepower: " + horsepower + " HP");
    }
}
class democomposition
{
    public static void main(String[] args) {
        car myCar = new car(150, "Red");
   engine myEngine = new engine(200);

        myCar.display();
        myEngine.display();
    }
}