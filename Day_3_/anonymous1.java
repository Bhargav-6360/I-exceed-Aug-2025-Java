abstract class sample{
    abstract public void display();
}
class anonymous1
{
    public static void main(String[] args) {
        sample obj = new sample() {
            @Override
            public void display() {
                System.out.println("Anonymous class implementation of abstract method");
            }
        };
        obj.display();
    }
}