class Animal{
    void sound(){
        System.out.println("Dog");
    }
}
class  Dog extends Animal{
void  Bark(){
System.out.println("Boww Boww");
}
}
class code1{
    public static void main(String[] args) {
        Dog dg= new Dog();
        dg.Bark();
        dg.sound();
    
    }
}



