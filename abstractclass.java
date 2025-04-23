abstract class Animal {
    abstract void sound();
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Meow..");
    }
}
class Dog extends Animal {
    public void sound() {
        System.out.println("Bark..");
    }
}

public class Main_Abstract {
    public static void main(String args[]) {
        Animal a1 = new Cat();
Animal a2=new Dog();

        a1.sound();
a2.sound();
    }
}
