class Bank{
     String name;
     int actno;
     double balance;
    public Bank(String name, int actno, double balance){
        this.name = name;
        this.actno = actno;
        this.balance = balance;

    }
    public String getName(){
        return name;

    }
    public int getActno(){
        return actno;
    }
    public double getBalance(){
        return balance;
    }
}
public class Encap {
    public static void main(String[] args) {
        Bank bank = new Bank("Sai", 1000, 500);
        System.out.println(bank.getName());
        System.out.println(bank.getActno());
        System.out.println(bank.getBalance());
    }

}
