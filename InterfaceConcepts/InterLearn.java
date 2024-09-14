package InterfaceConcepts;

interface SbiBank{
    void transfer();
    void withdrawal();
     void display();

}
abstract class Atm implements SbiBank{
    public void transfer(){
        System.out.println("Transfer to Bank");
    }
    public void play(){
        System.out.println("Play Bank");
    }

}
  class  Bank extends Atm{

    public void transfer() {
        System.out.println("Transfer Bank");
    }
    public void withdrawal() {
        System.out.println("Withdrawal Bank");
    }
     public void display() {
         System.out.println("Displaying Bank1");
     }

 }
class InterLearn{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.transfer();
        bank.withdrawal();
        bank.display();
        bank.play();
        bank.transfer();
    }
}
