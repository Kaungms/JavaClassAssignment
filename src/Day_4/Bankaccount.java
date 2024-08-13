package Day_4;

public class Bankaccount {

    private String id;
    private double balance;

    public Bankaccount(String id, double openingBalance){
        this.id = id;
        this.balance = openingBalance;

    }

    public void withdraw(double amount){
        if(this.balance>amount){
            this.balance = this.balance-amount;
            System.out.println("Withdraw successful");
        }else{
            System.out.println("Withdraw unsuccessful");
        }

    }

    public void deposit(double amount){
        if (amount >0){
            this.balance = this.balance+amount;
            System.out.println("Deposit successful");
        }
    }

    public void display(){
        System.out.println("Id: "+ id);
        System.out.println("Balance: "+ balance);
    }
}
