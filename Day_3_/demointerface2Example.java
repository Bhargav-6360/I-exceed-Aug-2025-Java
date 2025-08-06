interface Animal {
    static void soundInfo() {
        System.out.println("All animals make sounds.");
    }
    public void makeSound();
}

class Dog implements Animal {
    Dog() {
        System.out.println("Dog object created!");
    }
    
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof Woof!");
    }
}

class demointerface2Example {
    public static void main(String[] args) {
        Dog d = new Dog();     
        d.makeSound();         
        Animal.soundInfo();    
    }
}
