abstract class shape{
    abstract void draw();
    void message(){
        System.out.println("Hello");
    }
}
class Circle extends shape{
    void draw(){
        System.out.println("Drawing");
    }
}
class code7{
    public static void main(String[] args) {
        Circle cl=new Circle();
        cl.draw();
        cl.message();
    }
}
