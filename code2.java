class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Mammal extends Animal {
    void bark() {
        System.out.println("Boww Boww");
    }
}
class Dog extends Mammal {
    void breed() {
        System.out.println("German Shepherd");
    }
}
class code2{
    public static void main(String[] args) {
       
        Dog dg = new Dog();
        
        dg.sound(); 
        dg.bark();  
        dg.breed(); 
    }
}