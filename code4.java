class Animal {
    void sound() {
        System.out.println("Hello");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Hii");
    }

    void display() {
        sound();      
        super.sound(); 
    }
}
class code4 {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.display(); 
    }
}