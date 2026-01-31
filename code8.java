interface payment{
    void pay();
}
class upi implements payment{
public void pay(){
    System.out.println("Payment");
}
}
class code8{
    public static void main(String[] args) {
        upi Gpay= new upi();
        Gpay.pay();
    }
}