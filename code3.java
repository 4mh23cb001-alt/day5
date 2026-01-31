class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Boww Boww");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("meow meow");
    }
}
class code3 {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.sound(); 
        dg.bark();  
        Cat ct = new Cat();
        ct.sound(); 
        ct.meow(); 
    }
}
