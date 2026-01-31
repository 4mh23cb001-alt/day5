class Animal {
    void run() {
        System.out.println("Animal is running");
    }
    Animal() {
        System.out.println("Hello from Animal");
    }
}
class Dog extends Animal {
    Dog() {
        super.run(); 
        System.out.println("Hello from Dog");
    }
    void sound() {
        System.out.println("Hii");
    }
}
public class code6 {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.sound();
    }
}